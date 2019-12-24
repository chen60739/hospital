package com.example.hospital.dao;

import com.example.hospital.model.TemplateSetting;

public interface TemplateSettingMapper {
    int deleteByPrimaryKey(Integer templateSettingId);

    int insert(TemplateSetting record);

    int insertSelective(TemplateSetting record);

    TemplateSetting selectByPrimaryKey(Integer templateSettingId);

    int updateByPrimaryKeySelective(TemplateSetting record);

    int updateByPrimaryKey(TemplateSetting record);
}