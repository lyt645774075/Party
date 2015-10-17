package com.tianmai.party.dal.dao;

import com.tianmai.party.dal.dbobj.ActivityDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author yangtao.lyt
 * @version $Id: AcitivityDAO, v 0.1 2015-10-18 00:36 yangtao.lyt Exp $
 */

@Repository
public interface ActivityDAO extends JpaRepository<ActivityDO, Long>{
}
