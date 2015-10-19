package com.tianmai.party.manager.read;

import com.tianmai.party.domain.UserBO;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @author yangtao.lyt
 * @version $Id: UserReadManager, v 0.1 2015-10-19 09:57 yangtao.lyt Exp $
 */
public interface UserReadManager extends UserDetailsService{

    UserBO getUserBOByEmailAddress(String emailAddress);

    UserBO getUserBOById(Long id);

    UserBO getUserBOByName(String name);
}
