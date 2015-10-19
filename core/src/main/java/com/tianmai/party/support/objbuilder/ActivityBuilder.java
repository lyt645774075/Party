package com.tianmai.party.support.objbuilder;

import com.tianmai.party.dal.dbobj.ActivityDO;
import com.tianmai.party.dal.dbobj.RelaActivityUserDO;
import com.tianmai.party.domain.ActivityBO;

import java.util.List;

/**
 * @author yangtao.lyt
 * @version $Id: ActivityBuilder, v 0.1 2015-10-12 20:18 yangtao.lyt Exp $
 */
public class ActivityBuilder {

    private ActivityDO activityDO;

    private List<RelaActivityUserDO> relaActivityUserDOList;


    public ActivityBuilder fromActivityDO(ActivityDO activityDO){
        this.activityDO = activityDO;
        return this;
    }

    public ActivityBuilder fromRelaActivityPeopleDOList(List<RelaActivityUserDO> relaActivityUserDOList){
        this.relaActivityUserDOList = relaActivityUserDOList;
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
