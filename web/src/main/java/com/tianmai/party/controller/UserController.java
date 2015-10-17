/*
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved
 */

package com.tianmai.party.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author yangtao.lyt
 * @version $Id: HomeController, v 0.1 2015-10-08 12:27 yangtao.lyt Exp $
 */
@Controller
@RequestMapping("/user")
public class UserController {


    private static final String PAGE_PATH_PRE = "screen/user/";

    @RequestMapping(method = RequestMethod.GET)
    public String doGet(){
        return PAGE_PATH_PRE + "home";
    }

    @RequestMapping(value = "/home")
    public String doGetHome(){
        return PAGE_PATH_PRE + "home";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String doGetLogin(){
        return PAGE_PATH_PRE + "login";
    }

    @RequestMapping(value = "/register")
    public String doGetRegister(){
        return PAGE_PATH_PRE + "register";
    }


}
