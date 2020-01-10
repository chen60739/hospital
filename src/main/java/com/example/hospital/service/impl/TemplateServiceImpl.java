package com.example.hospital.service.impl;

import com.example.hospital.dao.LableMapper;
import com.example.hospital.dao.TemplateMapper;
import com.example.hospital.dao.TemplateSetMapper;
import com.example.hospital.model.Lable;
import com.example.hospital.model.Template;
import com.example.hospital.model.TemplateSet;
import com.example.hospital.service.TemplateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Override
    public Map<String, String> delTemplate(Integer tempId) {
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
        Map<String,String> res = new HashMap<>();
        int i = templateMapper.setRange(tempId,departmentIds);
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
    public List<Template> getTemplateList(Integer departmentId) {
        List<Template> list = templateMapper.selectAll(departmentId);
        return list;
    }

    @Override
    public void saveTemplate(String tempName, String lableId) {
        Template template = new Template();
        template.setTemplateSettingCreateTime(new Date());
        template.setTemplateName(tempName);
        templateMapper.insert(template);
        String[] ids = lableId.split(",");
        for (String id : ids) {
            TemplateSet templateSet = new TemplateSet();
            templateSet.setLableId(Integer.parseInt(id));
            templateSet.setTempId(template.getTemplateId());
            templateSetMapper.insert(templateSet);

        }
    }

    @Override
    public List<Lable> getTreeData() {
        List<Lable> list = lableMapper.selectAll();
        return list;
    }
}
