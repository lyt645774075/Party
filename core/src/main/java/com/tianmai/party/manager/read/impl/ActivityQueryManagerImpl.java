package com.tianmai.party.manager.read.impl;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.tianmai.party.constants.DomainRole;
import com.tianmai.party.dal.dao.ActivityDAO;
import com.tianmai.party.dal.dao.DetailActivityAccountDAO;
import com.tianmai.party.dal.dao.RelaActivityUserDAO;
import com.tianmai.party.dal.dbobj.ActivityDO;
import com.tianmai.party.dal.dbobj.DetailActivityAccountDO;
import com.tianmai.party.dal.dbobj.RelaActivityUserDO;
import com.tianmai.party.domain.ActivityBO;
import com.tianmai.party.domain.DetailActivityAccountBO;
import com.tianmai.party.domain.RelaActivityUserBO;
import com.tianmai.party.domain.UserBO;
import com.tianmai.party.manager.read.ActivityQueryManager;
import com.tianmai.party.support.objbuilder.ActivityBuilder;
import com.tianmai.party.support.objbuilder.CommonObjTransfer;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yangtao.lyt
 * @version $Id: ActivityQueryManagerImpl, v 0.1 2015-10-12 20:11 yangtao.lyt Exp $
 */
@Service
public class ActivityQueryManagerImpl implements ActivityQueryManager{

    @Resource
    private ActivityDAO activityDAO;

    @Resource
    private DetailActivityAccountDAO detailActivityAccountDAO;

    @Resource
    private RelaActivityUserDAO relaActivityUserDAO;



    @Override
    public ActivityBO getActivityBOById(Long id) {

        ActivityDO acitivityDO = activityDAO.findOne(id);

        ActivityBuilder builder = new ActivityBuilder();
        ActivityBO activityBO = builder.fromActivityDO(acitivityDO).build();

        UserBO currentUser = (UserBO) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if(currentUser == null){
            return activityBO;
        }

        activityBO.setCurrentUserRole(getDomainRole(id, currentUser.getId()));

        return activityBO;

    }

    @Override
    public List<DetailActivityAccountBO> queryAccountBOListByActivityId(Long activityId) {
        List<DetailActivityAccountDO> doList = detailActivityAccountDAO.findAllByActivityId(activityId);

        return CommonObjTransfer.toBOList(doList);
    }


    @Override
    public Integer getDomainRole(Long activityId, Long userId) {
        Preconditions.checkNotNull(activityId);
        Preconditions.checkNotNull(userId);

        RelaActivityUserDO relaActivityUserDO = relaActivityUserDAO.findByActivityIdAndUserId(activityId, userId);
        if(relaActivityUserDO == null){
            return DomainRole.NONE;
        }

        return relaActivityUserDO.getStatus();

    }


    @Override
    public List<RelaActivityUserBO> getAppliedUserList(Long activityId) {
        Preconditions.checkNotNull(activityId);

        List<RelaActivityUserDO> doList = relaActivityUserDAO.findAllUserByActivityIdAndStatusIn(activityId, Lists.newArrayList(DomainRole.APPLIED));

        return CommonObjTransfer.toRAUBOList(doList);
    }

    @Override
    public List<RelaActivityUserBO> getMemberList(Long activityId) {
        Preconditions.checkNotNull(activityId);

        List<RelaActivityUserDO> doList = relaActivityUserDAO.findAllUserByActivityIdAndStatusIn(activityId, Lists.newArrayList(DomainRole.MEMBER, DomainRole.ADMIN, DomainRole.CREATOR));

        return CommonObjTransfer.toRAUBOList(doList);
    }


}
