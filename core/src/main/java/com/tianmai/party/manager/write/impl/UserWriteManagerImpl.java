package com.tianmai.party.manager.write.impl;

import com.google.common.base.Preconditions;
import com.tianmai.party.dal.dao.ActivityDAO;
import com.tianmai.party.dal.dao.RelaActivityUserDAO;
import com.tianmai.party.dal.dao.UserDAO;
import com.tianmai.party.dal.dbobj.ActivityDO;
import com.tianmai.party.dal.dbobj.RelaActivityUserDO;
import com.tianmai.party.dal.dbobj.UserDO;
import com.tianmai.party.domain.UserBO;
import com.tianmai.party.manager.write.UserWriteManager;
import com.tianmai.party.support.objbuilder.CommonObjTransfer;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author yangtao.lyt
 * @version $Id: UserWriteManagerImpl, v 0.1 2015-10-19 09:57 yangtao.lyt Exp $
 */
@Service
public class UserWriteManagerImpl implements UserWriteManager{

    @Resource
    private UserDAO userDAO;

    @Resource
    private RelaActivityUserDAO relaActivityUserDAO;

    @Resource
    private ActivityDAO activityDAO;

    @Override
    public UserBO register(UserBO userBO) {

        Preconditions.checkNotNull(userBO);

        UserDO userDO = userDAO.findByEmail(userBO.getEmail());
        if(userDO != null){
            return null;
        }

        userDO = userDAO.save(CommonObjTransfer.toDO(userBO));

        return CommonObjTransfer.toBO(userDO);

    }


    @Override
    public void applyJoinInActivity(Long activityId) {

        ActivityDO activityDO = activityDAO.findOne(activityId);

        RelaActivityUserDO relaActivityUserDO = new RelaActivityUserDO();

        UserBO userBO = (UserBO) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        relaActivityUserDO.setActivityId(activityId);
        relaActivityUserDO.setActivityName(activityDO.getName());
        relaActivityUserDO.setUserId(userBO.getId());
        relaActivityUserDO.setUserName(userBO.getName());
        relaActivityUserDO.setStatus(1);
        relaActivityUserDO.setGmtCreate(new Date());
        relaActivityUserDO.setGmtModified(new Date());


        relaActivityUserDAO.save(relaActivityUserDO);


    }
}
