package com.tianmai.party.manager.write.impl;

import com.google.common.base.Preconditions;
import com.tianmai.party.constants.DomainRole;
import com.tianmai.party.dal.dao.ActivityDAO;
import com.tianmai.party.dal.dao.RelaActivityUserDAO;
import com.tianmai.party.dal.dbobj.ActivityDO;
import com.tianmai.party.dal.dbobj.RelaActivityUserDO;
import com.tianmai.party.domain.ActivityBO;
import com.tianmai.party.manager.write.ActivityWriteManager;
import com.tianmai.party.support.objbuilder.ActivityBuilder;
import com.tianmai.party.support.objbuilder.CommonObjTransfer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yangtao.lyt
 * @version $Id: ActivityWriteManagerImpl, v 0.1 2015-10-15 23:05 yangtao.lyt Exp $
 */
@Service
public class ActivityWriteManagerImpl implements ActivityWriteManager{
    @Resource
    private ActivityDAO activityDAO;

    @Resource
    private RelaActivityUserDAO relaActivityUserDAO;

    @Override
    public ActivityBO createActivity(ActivityBO activityBO) {
        ActivityDO activityDO = activityDAO.save(CommonObjTransfer.toDO(activityBO));

        ActivityBuilder builder = new ActivityBuilder();

        return builder.fromActivityDO(activityDO).build();
    }


    @Override
    public ActivityBO updateActivity(ActivityBO activityBO) {
        ActivityDO activityDO = activityDAO.save(CommonObjTransfer.toDO(activityBO));

        ActivityBuilder builder = new ActivityBuilder();

        return builder.fromActivityDO(activityDO).build();
    }


    @Override
    public void auditPassMember(Long activityId, Long userId) {
        Preconditions.checkNotNull(activityId);
        Preconditions.checkNotNull(userId);

        RelaActivityUserDO relaActivityUserDO = relaActivityUserDAO.findByActivityIdAndUserId(activityId, userId);
        relaActivityUserDO.setStatus(DomainRole.MEMBER);

        relaActivityUserDAO.save(relaActivityUserDO);

    }
}
