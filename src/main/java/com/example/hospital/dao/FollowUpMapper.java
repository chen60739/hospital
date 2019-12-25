package com.example.hospital.dao;

import com.example.hospital.model.FollowUp;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FollowUpMapper {
    int deleteByPrimaryKey(Integer followId);

    int insert(FollowUp record);

    int insertSelective(FollowUp record);

    FollowUp selectByPrimaryKey(Integer followId);

    int updateByPrimaryKeySelective(FollowUp record);

    int updateByPrimaryKey(FollowUp record);
}