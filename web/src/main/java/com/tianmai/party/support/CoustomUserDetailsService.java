package com.tianmai.party.support;

import com.google.common.collect.Lists;
import com.tianmai.party.domain.UserBO;
import com.tianmai.party.manager.read.UserReadManager;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.annotation.Resource;

/**
 * @author yangtao.lyt
 * @version $Id: CoustomUserDetailsService, v 0.1 2015-10-13 20:43 yangtao.lyt Exp $
 */
public class CoustomUserDetailsService implements UserDetailsService{

    @Resource
    private UserReadManager userReadManager;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        /**
         * 此处的username  实际上对应的是 用户的email
         */

        System.out.println("===================load user detail======================");

        UserBO userBO = userReadManager.getUserBOByEmailAddress(username);


        User user = new User(userBO.getEmail(), userBO.getPassword(), Lists.newArrayList(new SimpleGrantedAuthority("ROLE_USER"), new SimpleGrantedAuthority("ROLE_ANONYMOUS"))
        );

        return user;
    }
}
