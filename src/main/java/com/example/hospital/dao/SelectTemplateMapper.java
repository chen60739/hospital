package com.example.hospital.dao;

import com.example.hospital.model.SelectTemplate;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SelectTemplateMapper {
    int deleteByFollowUpRuleId(Integer selectRuleId);

    int insert(SelectTemplate record);

    int insertFollowTemplate(SelectTemplate record);

    SelectTemplate selectByPrimaryKey(Integer stId);

    int updateByPrimaryKeySelective(SelectTemplate record);

    int updateByPrimaryKey(SelectTemplate record);
}