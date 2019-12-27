package com.example.hospital.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 陈奕璇
 * @date 2019/12/18
 */
@Controller
public class IndexController {

    @RequestMapping("/groupManagement")
    public String group(){
        return "grouping_management";
    }

    @RequestMapping("/muban")
    public String temp(){
        return "form_template";
    }

    @RequestMapping("/newGroup")
    public String newGroup(){
        return "new_group";
    }

    @RequestMapping("/design")
    public String tz(){
        return "template_design";
    }

    @RequestMapping("/one")
    public String one(){
        return "group_one";
    }

    @RequestMapping("/rili")
    public String rili(){
        return "follow";
    }

    @RequestMapping("/followUp")
    public String followUp(){
        return "follow_up_management";
    }

    @RequestMapping("/login")
    public String login(){
        return "main";
    }
    @RequestMapping("/templist")
    public String templist(){
        return "template_list";
    }
    @RequestMapping("/plan")
    public String plan(){
        return "diagnosis_and_treatment_plan";
    }

    @RequestMapping("/power")
    public String power(){
        return "power";
    }
    @RequestMapping("/user")
    public String user(){
        return "user_management";
    }

    @RequestMapping("/groupPower")
    public String groupPower(){
        return "group_power";
    }

    @RequestMapping("/intoGroup")
    public String intoGroup(){
        return "into_group_management";
    }
    @RequestMapping("/tempView")
    public String tempView(){
        return "template_overview";
    }
    @RequestMapping("/followUpSetting")
    public String followUpSetting(){
        return "follow_up_rule_setting";
    }
    @RequestMapping("/patient")
    public String patient(){
        return "patient";
    }

}
