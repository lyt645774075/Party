package com.tianmai.party.dal.dao;

import com.tianmai.party.dal.dbobj.RelaActivityUserDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yangtao.lyt
 * @version $Id: RelaActivityPeopleDAO, v 0.1 2015-10-19 14:06 yangtao.lyt Exp $
 */
@Repository
public interface RelaActivityUserDAO extends JpaRepository<RelaActivityUserDO, Long>{

    RelaActivityUserDO findByActivityIdAndUserId(Long activityId, Long userId);

    List<RelaActivityUserDO> findAllUserByActivityIdAndStatusIn(Long activityId, List<Integer> statusList);

}
