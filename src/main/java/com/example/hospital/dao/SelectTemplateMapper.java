package com.example.hospital.dao;

import com.example.hospital.model.SelectTemplate;

public interface SelectTemplateMapper {
    int deleteByPrimaryKey(Integer stId);

    int insert(SelectTemplate record);

    int insertSelective(SelectTemplate record);

    SelectTemplate selectByPrimaryKey(Integer stId);

    int updateByPrimaryKeySelective(SelectTemplate record);

    int updateByPrimaryKey(SelectTemplate record);
}