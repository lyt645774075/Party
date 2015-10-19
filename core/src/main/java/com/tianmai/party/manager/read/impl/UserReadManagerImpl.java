package com.tianmai.party.manager.read.impl;

import com.google.common.base.Preconditions;
import com.tianmai.party.dal.dao.UserDAO;
import com.tianmai.party.dal.dbobj.UserDO;
import com.tianmai.party.domain.UserBO;
import com.tianmai.party.manager.read.UserReadManager;
import com.tianmai.party.support.objbuilder.CommonObjTransfer;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yangtao.lyt
 * @version $Id: UserReadManagerImpl, v 0.1 2015-10-19 10:12 yangtao.lyt Exp $
 */
@Service
public class UserReadManagerImpl implements UserReadManager{

    @Resource
    private UserDAO userDAO;

    @Override
    public UserBO getUserBOByEmailAddress(String emailAddress) {

        Preconditions.checkNotNull(emailAddress);

        UserDO userDO = userDAO.findByEmail(emailAddress);

        return CommonObjTransfer.toBO(userDO);

    }

    @Override
    public UserBO getUserBOById(Long id) {

        Preconditions.checkNotNull(id);

        UserDO userDO = userDAO.findById(id);

        return CommonObjTransfer.toBO(userDO);
    }


    @Override
    public UserBO getUserBOByName(String name) {
        return null;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return getUserBOByEmailAddress(username);
    }
}
