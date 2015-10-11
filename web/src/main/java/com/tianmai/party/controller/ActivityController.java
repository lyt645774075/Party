package com.tianmai.party.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author yangtao.lyt
 * @version $Id: ActivityController, v 0.1 2015-10-11 04:16 yangtao.lyt Exp $
 */
@Controller
@RequestMapping("/activity")
public class ActivityController {

    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public String doGetDetail(){

        return "activitydetail";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String doCreate(){

        return "activitydetail";
    }

    @RequestMapping(value = "/modify", method = RequestMethod.POST)
    public String doModify(){

        return "activitydetail";
    }
}
