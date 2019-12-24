package com.example.hospital.dao;

import com.example.hospital.model.FollowUpRule;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FollowUpRuleMapper {
    int deleteByPrimaryKey(Integer ruleId);

    int insert(FollowUpRule record);

    int insertSelective(FollowUpRule record);

    FollowUpRule selectByPrimaryKey(Integer ruleId);

    int updateByPrimaryKeySelective(FollowUpRule record);

    int updateByPrimaryKey(FollowUpRule record);
}