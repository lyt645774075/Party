package com.tianmai.party.dal.dao;


import com.tianmai.party.dal.dbobj.DetailActivityAccountDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yangtao.lyt
 * @version $Id: DetailActivityAccountDAO, v 0.1 2015-10-17 00:57 yangtao.lyt Exp $
 */
@Repository
public interface DetailActivityAccountDAO extends JpaRepository<DetailActivityAccountDO, Long> {

    DetailActivityAccountDO findByMoney(Long money);

    List<DetailActivityAccountDO> findAllByActivityId(Long activityId);


}
