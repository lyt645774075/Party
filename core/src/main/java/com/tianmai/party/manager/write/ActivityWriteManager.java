package com.tianmai.party.manager.write;

import com.tianmai.party.domain.ActivityBO;

/**
 * @author yangtao.lyt
 * @version $Id: ActivityWriteManager, v 0.1 2015-10-15 23:03 yangtao.lyt Exp $
 */
public interface ActivityWriteManager {


    /**
     * 创建活动
     * @param activityBO
     * @return 活动主键id
     */
    public ActivityBO createActivity(ActivityBO activityBO);

    public ActivityBO updateActivity(ActivityBO activityBO);


}
