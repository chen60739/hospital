package com.example.hospital.dao;

import com.example.hospital.model.TemplateSet;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TemplateSetMapper {
    int deleteByPrimaryKey(Integer templateId);

    int insert(TemplateSet record);

    int insertSelective(TemplateSet record);

    TemplateSet selectByPrimaryKey(Integer templateId);

    int updateByPrimaryKeySelective(TemplateSet record);

    int updateByPrimaryKey(TemplateSet record);

    List<TemplateSet> selectByTempId(Integer tempId);
}