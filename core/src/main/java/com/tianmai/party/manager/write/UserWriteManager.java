package com.tianmai.party.manager.write;

import com.tianmai.party.domain.UserBO;

/**
 * @author yangtao.lyt
 * @version $Id: UserWriteManager, v 0.1 2015-10-19 09:53 yangtao.lyt Exp $
 */
public interface UserWriteManager {

    UserBO register(UserBO userBO);

    void applyJoinInActivity(Long activityId);

}
