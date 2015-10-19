package com.tianmai.party.support.objbuilder;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.tianmai.party.dal.dbobj.ActivityDO;
import com.tianmai.party.dal.dbobj.DetailActivityAccountDO;
import com.tianmai.party.dal.dbobj.RelaActivityUserDO;
import com.tianmai.party.dal.dbobj.UserDO;
import com.tianmai.party.domain.ActivityBO;
import com.tianmai.party.domain.DetailActivityAccountBO;
import com.tianmai.party.domain.RelaActivityUserBO;
import com.tianmai.party.domain.UserBO;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.List;


/**
 * @author yangtao.lyt
 * @version $Id: CommonObjTransfer, v 0.1 2015-10-15 23:23 yangtao.lyt Exp $
 */
public class CommonObjTransfer {

    public static ActivityDO toDO(ActivityBO activityBO){
        Preconditions.checkNotNull(activityBO);

        ActivityDO activityDO = new ActivityDO();
        activityDO.setId(activityBO.getId());
        activityDO.setName(activityBO.getName());
        activityDO.setBeginTime(activityBO.getBeginTime());
        activityDO.setEndTime(activityBO.getEndTime());
        activityDO.setDescription(activityBO.getDesc().trim());
        activityDO.setEnable(1);
        activityDO.setGmtCreate(new Date());
        activityDO.setGmtModified(new Date());

        return activityDO;

    }

    public static DetailActivityAccountBO toBO(DetailActivityAccountDO detailActivityAccountDO){
        DetailActivityAccountBO bo = new DetailActivityAccountBO();

        bo.setId(detailActivityAccountDO.getId());
        bo.setDesc(detailActivityAccountDO.getDesc());
        bo.setActionPeopleId(detailActivityAccountDO.getActionPeopleId());
        bo.setActionPeopleName(detailActivityAccountDO.getActionPeopleName());
        bo.setAuditPeopleId(detailActivityAccountDO.getAuditPeopleId());
        bo.setAuditPeopleName(detailActivityAccountDO.getAuditPeopleName());
        bo.setGmtCreate(detailActivityAccountDO.getGmtCreate());
        bo.setActivityId(detailActivityAccountDO.getActivityId());
        bo.setMoney(detailActivityAccountDO.getMoney() / 100.0);
        bo.setType(detailActivityAccountDO.getType());

        return bo;
    }

    public static List<DetailActivityAccountBO> toBOList(List<DetailActivityAccountDO> detailActivityAccountDOList){
        if(CollectionUtils.isEmpty(detailActivityAccountDOList)){
            return Lists.newArrayList();
        }

        List<DetailActivityAccountBO> result = Lists.newArrayList();
        for(DetailActivityAccountDO dbobj : detailActivityAccountDOList){
            result.add(toBO(dbobj));
        }

        return result;
    }


    public static UserDO toDO(UserBO userBO){
        Preconditions.checkNotNull(userBO);

        UserDO userDO = new UserDO();
        userDO.setId(userBO.getId());
        userDO.setEmail(userBO.getEmail());
        userDO.setPassword(userBO.getPassword());
        userDO.setName(userBO.getName());
        userDO.setGmtCreate(userBO.getGmtCreate());
        userDO.setGmtModified(userBO.getGmtModified());

        return userDO;

    }

    public static UserBO toBO(UserDO userDO){
        Preconditions.checkNotNull(userDO);

        UserBO userBO = new UserBO();
        userBO.setId(userDO.getId());
        userBO.setEmail(userDO.getEmail());
        userBO.setPassword(userDO.getPassword());
        userBO.setName(userDO.getName());
        userBO.setGmtCreate(userDO.getGmtCreate());
        userBO.setGmtModified(userDO.getGmtModified());

        return userBO;

    }

    public static RelaActivityUserBO toBO(RelaActivityUserDO relaActivityUserDO){
        Preconditions.checkNotNull(relaActivityUserDO);

        RelaActivityUserBO relaActivityUserBO = new RelaActivityUserBO();
        relaActivityUserBO.setId(relaActivityUserDO.getId());
        relaActivityUserBO.setActivityId(relaActivityUserDO.getActivityId());
        relaActivityUserBO.setActivityName(relaActivityUserDO.getActivityName());
        relaActivityUserBO.setUserId(relaActivityUserDO.getUserId());
        relaActivityUserBO.setUserName(relaActivityUserDO.getUserName());
        relaActivityUserBO.setStatus(relaActivityUserDO.getStatus());
        relaActivityUserBO.setGmtCreate(relaActivityUserDO.getGmtCreate());
        relaActivityUserBO.setGmtModified(relaActivityUserDO.getGmtModified());

        return relaActivityUserBO;
    }

    public static List<RelaActivityUserBO> toRAUBOList(List<RelaActivityUserDO> relaActivityUserDOList){
        if(CollectionUtils.isEmpty(relaActivityUserDOList)){
            return Lists.newArrayList();
        }

        List<RelaActivityUserBO> result = Lists.newArrayList();
        for(RelaActivityUserDO relaActivityUserDO : relaActivityUserDOList){
           result.add(toBO(relaActivityUserDO));
        }

        return result;
    }

}
