/*
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved
 */

package com.tianmai.party.controller;

import com.tianmai.party.domain.ActivityBO;
import com.tianmai.party.domain.UserBO;
import com.tianmai.party.manager.read.ActivityQueryManager;
import com.tianmai.party.manager.read.UserReadManager;
import com.tianmai.party.manager.write.UserWriteManager;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * @author yangtao.lyt
 * @version $Id: HomeController, v 0.1 2015-10-08 12:27 yangtao.lyt Exp $
 */
@Controller
@RequestMapping("/user")
public class UserController {


    @Resource
    private UserWriteManager userWriteManager;

    @Resource
    private UserReadManager userReadManager;

    @Resource
    private ActivityQueryManager activityQueryManager;


    private static final String PAGE_PATH_PRE = "screen/user/";

    @RequestMapping(method = RequestMethod.GET)
    public String doGet(){
        return PAGE_PATH_PRE + "userHome";
    }

    @RequestMapping(value = "/home")
    public String doGetHome(@RequestParam("id") String id, ModelMap modelMap){

        //UserBO userBO = (UserBO) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        UserBO userBO = userReadManager.getUserBOById(Long.parseLong(id));

        modelMap.addAttribute("user", userBO);

        return PAGE_PATH_PRE + "userHome";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String doGetLogin(){

        SecurityContextHolder.clearContext();



        return PAGE_PATH_PRE + "login";
    }

    @RequestMapping(value = "/register")
    public String doGetRegister(){
        return PAGE_PATH_PRE + "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST, params = "action=registerUser")
    public String registerUser(@RequestParam("email") String email,
                               @RequestParam("password") String password,
                               @RequestParam("name") String name){

        UserBO userBO = new UserBO();
        userBO.setEmail(email);
        userBO.setPassword(password);
        userBO.setName(name);

        userBO = userWriteManager.register(userBO);



        return "redirect:/user/home?id=" + userBO.getId();
    }


    @RequestMapping(value = "/applyJoinIn")
    public String applyJoinIn(@RequestParam("activityId") String activityId,
                              ModelMap modelMap){

        userWriteManager.applyJoinInActivity(Long.parseLong(activityId));

        ActivityBO activityBO = activityQueryManager.getActivityBOById(Long.parseLong(activityId));

        modelMap.addAttribute("activity", activityBO);

        return "redirect:/activity/detail?id=" + activityId;


    }

}
