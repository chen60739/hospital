package com.example.hospital.controller;

import com.example.hospital.model.Dictionary;
import com.example.hospital.model.Groups;
import com.example.hospital.model.Lable;
import com.example.hospital.model.User;
import com.example.hospital.service.impl.GroupsServiceImpl;
import com.example.hospital.service.impl.TemplateServiceImpl;
import com.example.hospital.service.impl.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * @author 陈奕璇
 * @date 2019/12/18
 */

@Controller
public class IndexController {

    public static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private GroupsServiceImpl groupsService;
    @Autowired
    private TemplateServiceImpl templateService;
    @Autowired
    private UserServiceImpl userService;

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

    /*@RequestMapping("/design")
    public String tz(){
        return "template_design";
    }*/


    @RequestMapping("/one")
    public String one(@RequestParam("groupId") Integer groupId,
                      @RequestParam("departmentId") Integer departmentId,
                      Model model){
        try {
            model.addAttribute("groupId",groupId);
            model.addAttribute("departmentId",departmentId);
            LOGGER.info("IndexController-----one  成功" + departmentId);
        }catch (Exception e){
            LOGGER.info("IndexController-----one  失败");
        }

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
    public String login(HttpSession session){
        Object user = session.getAttribute("user");
        if (user != null) {
            return "main";
        }
        return "redirect:/";
    }

    @RequestMapping("/checkLogin")
    @ResponseBody
    public Map<String, String> checkLogin(@RequestParam("phone") String phone,
                                          @RequestParam("password") String password,
                                          HttpSession session){
        Map<String, String> res = userService.checkUser(phone,password,session);
        return res;

    }

    @RequestMapping("/templist")
    public String templist(@RequestParam("departmentId") Integer departmentId,
                           @RequestParam("groupId") Integer groupId,
                           Model model){
        model.addAttribute("departmentId",departmentId);
        model.addAttribute("groupId",groupId);
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
    public String groupPower(Model model,Integer groupId,Integer departmentId){
        model.addAttribute("groupId",groupId);
        model.addAttribute("departmentId",departmentId);
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

    @RequestMapping("/exit")
    public String exit(HttpSession session){
        session.removeAttribute("user");
        return "redirect:/";
    }

    @RequestMapping("/accountSet")
    public String accountSet(){
        return "account_settings";
    }

}
