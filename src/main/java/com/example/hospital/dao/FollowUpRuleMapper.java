package com.example.hospital.dao;

import com.example.hospital.model.FollowUpRule;

public interface FollowUpRuleMapper {
    int deleteByPrimaryKey(Integer ruleId);

    int insert(FollowUpRule record);

    int insertSelective(FollowUpRule record);

    FollowUpRule selectByPrimaryKey(Integer ruleId);

    int updateByPrimaryKeySelective(FollowUpRule record);

    int updateByPrimaryKey(FollowUpRule record);
}