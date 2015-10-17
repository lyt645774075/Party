package com.tianmai.party.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author yangtao.lyt
 * @version $Id: WebHomeController, v 0.1 2015-10-12 00:11 yangtao.lyt Exp $
 */

@Controller
@RequestMapping("/")
public class WebHomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String doGet(){
        return "webhome";
    }

    @RequestMapping(value = "home")
    public String doGetHome(){
        return "webhome";
    }



}
