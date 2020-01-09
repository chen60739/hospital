package com.example.hospital.controller;

import com.example.hospital.dto.TemplateOverView;
import com.example.hospital.model.Lable;
import com.example.hospital.model.Template;
import com.example.hospital.model.TemplateSet;
import com.example.hospital.service.impl.LableServiceImpl;
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
    @Autowired
    private LableServiceImpl lableService;

    /**
     * 保存模板
     * @param tempName 模板名称
     * @param lableId 表单控件id
     * @return
     */
    @RequestMapping("/saveTemp")
    @ResponseBody
    public Map<String, String> createTemp(@RequestParam("tempName") String tempName,
                                          @RequestParam("lableId") String lableId){
        Map<String, String> res = templateService.saveTemplate(tempName, lableId);
        return res;
    }

    @RequestMapping("updateTemp")
    @ResponseBody
    public Map<String, String> updateTemplate(@RequestParam("tempId") Integer tempId,
                                              @RequestParam("lableId") String lableId){
        Map<String, String> res = templateService.updateTemp(tempId,lableId);
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
        Template t = templateService.selectOneTemplate(tempId);
        model.addAttribute("lables",list);
        model.addAttribute("temp",t);
        model.addAttribute("departmentId",departmentId);
        return "template_design";
    }

    @RequestMapping("/getLables")
    @ResponseBody
    public List<Lable> getLables(@RequestParam("tempId") Integer tempId){
        List<Lable> lables = lableService.getLablesByTempId(tempId);
        return lables;
    }

    @RequestMapping("/publishTemp")
    @ResponseBody
    public Map<String, String> publishTemp(@RequestParam("tempId") Integer tempId){
        Map<String, String> res = templateService.publishTemp(tempId);
        return res;
    }

    @RequestMapping("/removeTemplate")
    @ResponseBody
    public Map<String, String> delTemplate(@RequestParam("tempId") Integer tempId,
                                           @RequestParam("groupId") Integer groupId){
        Map<String, String> res = templateService.removeTemplate(groupId,tempId);
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
