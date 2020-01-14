package com.example.hospital.service.impl;

import com.example.hospital.dao.GroupsMapper;
import com.example.hospital.dao.LableMapper;
import com.example.hospital.dao.TemplateMapper;
import com.example.hospital.dao.TemplateSetMapper;
import com.example.hospital.dto.LablePro;
import com.example.hospital.dto.TemplateOverView;
import com.example.hospital.model.Lable;
import com.example.hospital.model.Template;
import com.example.hospital.model.TemplateSet;
import com.example.hospital.service.TemplateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

/**
 * @author 陈奕璇
 * @date 2020/01/02
 */
@Service
public class TemplateServiceImpl implements TemplateService {

    @Resource
    private LableMapper lableMapper;
    @Resource
    private TemplateMapper templateMapper;
    @Resource
    private TemplateSetMapper templateSetMapper;
    @Resource
    private GroupsMapper groupsMapper;

    @Override
    public Map<String, String> updateTemp(Integer tempId, String lableId) {
        Map<String,String> res = new HashMap<>();
        Template old = templateMapper.selectByPrimaryKey(tempId);
        old.setTemplateSettingCreateTime(new Date());
        old.setTemplateSettingVersion(old.getTemplateSettingVersion()+1);
        templateMapper.insert(old);
        saveLables(old.getTemplateId(),lableId);
        res.put("mes","success");
        return res;
    }

    @Override
    public Template selectOneTemplate(Integer tempId) {
        Template template = templateMapper.selectByPrimaryKey(tempId);
        return template;
    }

    @Override
    public Map<String, String> removeTemplate(Integer groupId, Integer tempId) {
        int i = groupsMapper.updateSelectTemplate(groupId,tempId);
        Map<String,String> res = new HashMap<>();
        if (i==1){
            res.put("mes","成功");
        }else{
            res.put("mes","失败");
        }
        return res;
    }

    @Override
    public List<TemplateOverView> templateOverviewData(String groupName, String startTime, String endTime, String tempName, String createPeople) {
        List<TemplateOverView> list = templateMapper.templateOverviewData(groupName,startTime,endTime,tempName,createPeople);
        return list;
    }

    @Override
    public Map<String, String> setGroupSelectTemp(Integer groupId, String tempIds) {
        Map<String,String> res = new HashMap<>();
        int i = groupsMapper.setGroupTemp(groupId,tempIds);
        if (i==1){
            res.put("mes","成功");
        }else{
            res.put("mes","失败");
        }
        return res;
    }

    @Override
    public Map<String, List> getTemp(Integer groupId, Integer departmentId) {
        List<Template> list = templateMapper.getTemplate(departmentId);
        String tempIds = groupsMapper.getSelectTemp(groupId);
        List<String> idList = new ArrayList<>();
        if(tempIds!=null) {
            String[] ids = tempIds.split(",");
            for (String id : ids) {
                idList.add(id);
            }
        }
        Map<String,List> res = new HashMap<>();
        res.put("tempList",list);
        res.put("tempIds",idList);
        return res;
    }

    @Override
    public Map<String, String> delTemplate(Integer id, Integer tempId) {
        Map<String,String> res = new HashMap<>();
        int i = templateMapper.delTemplate(tempId);
        if (i==1){
            res.put("mes","删除成功");
        }else{
            res.put("mes","删除失败");
        }
        return res;
    }

    @Override
    public Map<String, String> publishTemp(Integer tempId) {
        Map<String,String> res = new HashMap<>();
        int i = templateMapper.changeTemplateState(tempId);
        if (i==1){
            res.put("mes","发布成功");
        }else{
            res.put("mes","发布失败");
        }
        return res;
    }

    @Override
    public Map<String, String> setTempRange(Integer tempId, String departmentIds) {
        int i = templateMapper.setRange(tempId,departmentIds);
        Map<String,String> res = new HashMap<>();
        if (i==1){
            res.put("mes","共享成功");
        }else{
            res.put("mes","共享失败");
        }
        return res;
    }

    @Override
    public List<TemplateSet> getLablesByTempId(Integer tempId) {
        List<TemplateSet> list = templateSetMapper.selectByTempId(tempId);
        return list;
    }

    @Override
    public List<Template> getTemplateList(Integer groupId) {
        List<Template> list = templateMapper.selectAll(groupId);
        return list;
    }

    @Override
    public Map<String, String> saveTemplate(String tempName, String lableId) {
        Template template = new Template();
        int i = templateMapper.checkName(tempName);
        Map<String,String> res = new HashMap<>();
        if (i==0){
            template.setTemplateSettingCreateTime(new Date());
            template.setTemplateName(tempName);
            templateMapper.insert(template);
            saveLables(template.getTemplateId(),lableId);
            res.put("mes","success");
        }else {
            res.put("mes","模板已存在");
        }
        return res;
    }

    @Override
    public List<LablePro> getTreeData() {
        List<LablePro> list = lableMapper.selectAll();
        return list;
    }

    public void saveLables(Integer tempId,String lableId){
        String[] ids = lableId.split(",");
        for (String id : ids) {
            TemplateSet templateSet = new TemplateSet();
            templateSet.setLableId(Integer.parseInt(id));
            templateSet.setTempId(tempId);
            templateSetMapper.insert(templateSet);
        }
    }

}
