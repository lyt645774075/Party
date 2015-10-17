package com.tianmai.party.support.objbuilder;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.tianmai.party.dal.dbobj.ActivityDO;
import com.tianmai.party.dal.dbobj.DetailActivityAccountDO;
import com.tianmai.party.domain.ActivityBO;
import com.tianmai.party.domain.DetailActivityAccountBO;
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

}
