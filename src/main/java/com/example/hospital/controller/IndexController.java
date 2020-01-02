package com.example.hospital.controller;

import com.example.hospital.model.Dictionary;
import com.example.hospital.model.Groups;
import com.example.hospital.model.Lable;
import com.example.hospital.service.impl.GroupsServiceImpl;
import com.example.hospital.service.impl.TemplateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 陈奕璇
 * @date 2019/12/18
 */
@Controller
public class IndexController {

    @Autowired
    private GroupsServiceImpl groupsService;
    @Autowired
    private TemplateServiceImpl templateService;

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
    public String one(Integer groupId, Model model){
        model.addAttribute("groupId",groupId);
        return "group_one";
    }

    @RequestMapping("/rili")
    public String rili(){
        return "follow";
    }

    @RequestMapping("/followUp")
    public String followUp(Model model){
        List<Dictionary> departments = groupsService.findAll();
        List<Groups> groups = groupsService.selectAllGroups();
        model.addAttribute("departments",departments);
        model.addAttribute("groups",groups);
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

    @RequestMapping("/dataReview")
    public String dataReview(){
        return "data_review";
    }
    @RequestMapping("/term")
    public String term(){
        return "term_management";
    }

    @RequestMapping("/getLableTree")
    @ResponseBody
    public List<Lable> getLableTree(){
        List<Lable> treeData = templateService.getTreeData();
        return treeData;
    }

}
