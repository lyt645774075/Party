package com.tianmai.party.controller;

import com.tianmai.party.manager.read.TeamQueryManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author yangtao.lyt
 * @version $Id: TeamController, v 0.1 2015-10-09 23:58 yangtao.lyt Exp $
 */
@Controller
@RequestMapping("/team")
public class TeamController {

    @Resource
    private TeamQueryManager teamQueryManager;


    @RequestMapping(value = "/home")
    public String doGetHome(){
        return "teamhome";
    }

    @RequestMapping(value = "/account")
    public String doGetAccount(){
        return "teamaccount";
    }

    @RequestMapping(value = "/admin")
    public String doGetAdmin(){
        return "teamadmin";
    }



}
