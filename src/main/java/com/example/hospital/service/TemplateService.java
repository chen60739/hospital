package com.example.hospital.service;

import com.example.hospital.dto.TemplateOverView;
import com.example.hospital.model.Lable;
import com.example.hospital.model.Template;
import com.example.hospital.model.TemplateSet;

import java.util.List;
import java.util.Map;

/**
 * @author 陈奕璇
 * @date 2020/01/02
 */
public interface TemplateService {

    List<Lable> getTreeData();

    void saveTemplate(String tempName, String lableId);

    List<Template> getTemplateList(Integer groupId);

    List<TemplateSet> getLablesByTempId(Integer tempId);

    Map<String,String> setTempRange(Integer tempId, String departmentIds);

    Map<String,String> publishTemp(Integer tempId);

    Map<String,String> delTemplate(Integer tempId);

    Map<String, List> getTemp(Integer groupId, Integer departmentId);

    Map<String,String> setGroupSelectTemp(Integer groupId, String tempIds);

    List<TemplateOverView> templateOverviewData(String groupName, String startTime, String endTime, String tempName, String createPeople);

}
