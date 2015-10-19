package com.tianmai.party.dal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tianmai.party.dal.dbobj.UserDO;

/**
 * @author yangtao.lyt
 * @version $Id: UserDAO, v 0.1 2015-10-19 09:48 yangtao.lyt Exp $
 */
@Repository
public interface UserDAO extends JpaRepository<UserDO, Long>{


    UserDO findByEmail(String email);

    UserDO findById(Long id);


}
