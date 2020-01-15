package com.example.hospital.dao;

import com.example.hospital.dto.SuperFollow;
import com.example.hospital.model.FollowUpRule;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FollowUpRuleMapper {
    List<SuperFollow> selectAllFollow(Integer upGroupId);

    int deleteByPrimaryKey(Integer ruleId);

    int insert(FollowUpRule record);

    int insertFollowUpRule(FollowUpRule record);

    FollowUpRule selectByPrimaryKey(Integer ruleId);

    int updateFollowRuleByid(FollowUpRule record);

    int updateByPrimaryKey(FollowUpRule record);
}