package com.example.hospital.controller;

import com.example.hospital.dto.TemplateOverView;
import com.example.hospital.model.Template;
import com.example.hospital.model.TemplateSet;
import com.example.hospital.service.impl.TemplateServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 陈奕璇
 * @date 2020/01/03
 */
@Controller
public class TemplateController {

    public static final Logger LOGGER = LoggerFactory.getLogger(TemplateController.class);

    @Autowired
    private TemplateServiceImpl templateService;

    @RequestMapping("/saveTemp")
    @ResponseBody
    public Map<String, String> createTemp(@RequestParam("tempName") String tempName,
                                          @RequestParam("lableId") String lableId){
        templateService.saveTemplate(tempName,lableId);
        Map<String,String> res = new HashMap<>();
        res.put("mes","message");
        return res;
    }

    @RequestMapping("/setTempRange")
    @ResponseBody
    public Map<String, String> setTempRange(@RequestParam("tempId") Integer tempId,
                                            @RequestParam("departmentIds") String departmentIds){
        Map<String,String> res = templateService.setTempRange(tempId,departmentIds);
        return res;
    }

    @RequestMapping("/tempListDate")
    @ResponseBody
    public List<Template> tempListData(@RequestParam("groupId") Integer groupId){
        List<Template> list = templateService.getTemplateList(groupId);
        return list;
    }

    @RequestMapping("/getTemp")
    @ResponseBody
    public Map<String, List> getTemp(@RequestParam("groupId")Integer groupId,
                                     @RequestParam("departmentId") Integer departmentId){
        Map<String, List> res = templateService.getTemp(groupId, departmentId);
        return res;
    }

    @RequestMapping("/design")
    public String design(@RequestParam("tempId") Integer tempId,
                        @RequestParam("departmentId") Integer departmentId,
                         Model model){
        List<TemplateSet> list = templateService.getLablesByTempId(tempId);
        model.addAttribute("lables",list);
        model.addAttribute("tempId",tempId);
        model.addAttribute("departmentId",departmentId);
        return "template_design";
    }

    @RequestMapping("/publishTemp")
    @ResponseBody
    public Map<String, String> publishTemp(@RequestParam("tempId") Integer tempId){
        Map<String, String> res = templateService.publishTemp(tempId);
        return res;
    }

    @RequestMapping("/delTemplate")
    @ResponseBody
    public Map<String, String> delTemplate(@RequestParam("tempId") Integer tempId){
        Map<String, String> res = templateService.delTemplate(tempId);
        return res;
    }

    /**
     * 保存选择的模板
     * @param groupId
     * @param tempIds
     * @return
     */
    @RequestMapping("/saveGroupSelectTemp")
    @ResponseBody
    public Map<String,String> saveGroupSelectTemp(@RequestParam("groupId")Integer groupId,
                                                  @RequestParam("tempIds")String tempIds){
        Map<String, String> res = null;
        try {
            res = templateService.setGroupSelectTemp(groupId,tempIds);
            LOGGER.info("TemplateController-----saveGroupSelectTemp  成功" +"groupId:" +groupId +"tempIds:"+ tempIds);
        }catch (Exception e){
            LOGGER.info("TemplateController-----saveGroupSelectTemp  失败"+ e +"groupId:" +groupId +"tempIds:"+ tempIds);
        }
        return res;
    }

    @RequestMapping("/templateOverviewData")
    @ResponseBody
    public List<TemplateOverView> templateOverviewData(@RequestParam("groupName")String groupName,
                                                       @RequestParam("startTime")String startTime,
                                                       @RequestParam("endTime")String endTime,
                                                       @RequestParam("tempName")String tempName,
                                                       @RequestParam("createPeople")String createPeople){
        List<TemplateOverView> list = templateService.templateOverviewData(groupName,startTime,endTime,tempName,createPeople);
        return list;
    }
}
