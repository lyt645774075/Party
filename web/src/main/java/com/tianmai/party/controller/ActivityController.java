package com.tianmai.party.controller;

import com.tianmai.party.domain.ActivityBO;
import com.tianmai.party.domain.DetailActivityAccountBO;
import com.tianmai.party.manager.read.ActivityQueryManager;
import com.tianmai.party.manager.write.ActivityWriteManager;
import com.tianmai.party.support.utils.DateUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yangtao.lyt
 * @version $Id: ActivityController, v 0.1 2015-10-11 04:16 yangtao.lyt Exp $
 */
@Controller
@RequestMapping(value = "/activity")
public class ActivityController {

    @Resource
    private ActivityQueryManager activityQueryManager;

    @Resource
    private ActivityWriteManager activityWriteManager;

    private static final String PAGE_PATH_PRE = "screen/activity/";

    @RequestMapping(value = "/detail")
    public String doGetDetail(@RequestParam("id") String id, ModelMap modelMap){

        ActivityBO activityBO = activityQueryManager.getActivityBOById(Long.parseLong(id));
        modelMap.addAttribute("activity", activityBO);

        return PAGE_PATH_PRE + "activitydetail";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String doGetCreate(){

        return PAGE_PATH_PRE + "activityedit";
    }

    @RequestMapping(value = "/modify", method = RequestMethod.GET, params = "activityId")
    public String doGetModify(@RequestParam("activityId") String activityId,
                              ModelMap modelMap){

        ActivityBO activityBO = activityQueryManager.getActivityBOById(Long.parseLong(activityId));

        modelMap.addAttribute("activity", activityBO);

        return PAGE_PATH_PRE + "activityedit";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST, params = "action=createOrUpdate")
    public String doGetCreateByPost(@RequestParam("activityName") String name,
                                    @RequestParam("beginTime") String beginTime,
                                    @RequestParam("endTime") String endTime,
                                    @RequestParam("activityDetail") String desc,
                                    ModelMap modelMap){

        ActivityBO activityBO = new ActivityBO();
        activityBO.setName(name);
        activityBO.setBeginTime(DateUtil.parseStr(beginTime));
        activityBO.setEndTime(DateUtil.parseStr(endTime));
        activityBO.setDesc(desc);

        activityBO = activityWriteManager.createActivity(activityBO);

        modelMap.addAttribute("activity", activityBO);

        return "redirect:/activity/detail?id=" + activityBO.getId();

    }

    @RequestMapping(value = "/modify", method = RequestMethod.POST, params = "action=createOrUpdate")
    public String doGetModify(@RequestParam("activityId") String activityId,
                              @RequestParam("activityName") String name,
                              @RequestParam("beginTime") String beginTime,
                              @RequestParam("endTime") String endTime,
                              @RequestParam("activityDetail") String desc,
                                ModelMap modelMap){

        ActivityBO activityBO = new ActivityBO();
        activityBO.setId(Long.parseLong(activityId));
        activityBO.setName(name);
        activityBO.setBeginTime(DateUtil.parseStr(beginTime));
        activityBO.setEndTime(DateUtil.parseStr(endTime));
        activityBO.setDesc(desc);

        activityBO = activityWriteManager.updateActivity(activityBO);
        modelMap.addAttribute("activity", activityBO);

        return "redirect:/activity/detail?id=" + activityBO.getId();
    }
    @RequestMapping(value = "/account")
    public String doGetAccount(@RequestParam("activityId") String activityId, ModelMap modelMap){

        List<DetailActivityAccountBO> result = activityQueryManager.queryAccountBOListByActivityId(Long.parseLong(activityId.trim()));

        modelMap.addAttribute("accountList", result);

        return PAGE_PATH_PRE + "activityaccount";
    }
}
