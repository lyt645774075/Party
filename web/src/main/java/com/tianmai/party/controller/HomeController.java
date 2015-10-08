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
@RequestMapping("/home")
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String doGet(){
        return "home";
    }

}
