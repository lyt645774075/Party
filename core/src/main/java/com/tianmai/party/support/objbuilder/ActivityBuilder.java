package com.tianmai.party.support.objbuilder;

import com.tianmai.party.dal.dbobj.ActivityDO;
import com.tianmai.party.dal.dbobj.RelaActivityPeopleDO;
import com.tianmai.party.domain.ActivityBO;

import java.util.List;

/**
 * @author yangtao.lyt
 * @version $Id: ActivityBuilder, v 0.1 2015-10-12 20:18 yangtao.lyt Exp $
 */
public class ActivityBuilder {

    private ActivityDO activityDO;

    private List<RelaActivityPeopleDO> relaActivityPeopleDOList;


    public ActivityBuilder fromActivityDO(ActivityDO activityDO){
        this.activityDO = activityDO;
        return this;
    }

    public ActivityBuilder fromRelaActivityPeopleDOList(List<RelaActivityPeopleDO> relaActivityPeopleDOList){
        this.relaActivityPeopleDOList = relaActivityPeopleDOList;
        return this;
    }

    public ActivityBO build(){
        ActivityBO activityBO = new ActivityBO();

        activityBO.setId(activityDO.getId());
        activityBO.setName(activityDO.getName());
        activityBO.setDesc(activityDO.getDescription());
        activityBO.setBeginTime(activityDO.getBeginTime());
        activityBO.setEndTime(activityDO.getEndTime());
        activityBO.setGmtCreate(activityDO.getGmtCreate());
        activityBO.setGmtModified(activityDO.getGmtModified());

        return activityBO;
    }



}
