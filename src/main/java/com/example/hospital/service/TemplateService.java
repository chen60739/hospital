package com.example.hospital.service;

import com.example.hospital.model.Lable;
import com.example.hospital.model.Template;
import com.example.hospital.model.TemplateSet;

import java.util.List;

/**
 * @author 陈奕璇
 * @date 2020/01/02
 */
public interface TemplateService {

    List<Lable> getTreeData();

    void saveTemplate(String tempName, String lableId);

    List<Template> getTemplateList();

    List<TemplateSet> getLablesByTempId(Integer tempId);
}
