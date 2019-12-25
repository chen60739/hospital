package com.example.hospital.dao;

import com.example.hospital.model.Template;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TemplateMapper {
    int deleteByPrimaryKey(Integer templateId);

    int insert(Template record);

    int insertSelective(Template record);

    Template selectByPrimaryKey(Integer templateId);

    int updateByPrimaryKeySelective(Template record);

    int updateByPrimaryKey(Template record);
}