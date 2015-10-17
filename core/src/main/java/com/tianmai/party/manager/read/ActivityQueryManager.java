package com.tianmai.party.manager.read;

import com.tianmai.party.domain.ActivityBO;
import com.tianmai.party.domain.DetailActivityAccountBO;

import java.util.List;

/**
 * @author yangtao.lyt
 * @version $Id: ActivityQueryManager, v 0.1 2015-10-12 20:09 yangtao.lyt Exp $
 */
public interface ActivityQueryManager {

    ActivityBO getActivityBOById(Long id);

    List<DetailActivityAccountBO> queryAccountBOListByActivityId(Long activityId);

}
