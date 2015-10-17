package com.tianmai.party.support;

import com.google.common.collect.Lists;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @author yangtao.lyt
 * @version $Id: MyService, v 0.1 2015-10-13 20:43 yangtao.lyt Exp $
 */
public class MyService implements UserDetailsService{
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        System.out.println("===================load user detail======================");
        User user = new User("yangtao.lyt@alibaba-inc.com", "123", Lists.newArrayList(new SimpleGrantedAuthority("ROLE_USER"), new SimpleGrantedAuthority("ROLE_ANONYMOUS"))
        );

        return user;
    }
}
