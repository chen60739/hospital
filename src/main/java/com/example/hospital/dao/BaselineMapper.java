package com.example.hospital.dao;

import com.example.hospital.model.Baseline;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BaselineMapper {
    int deleteByPrimaryKey(Integer baselineId);

    int insert(Baseline record);

    int insertSelective(Baseline record);

    Baseline selectByPrimaryKey(Integer baselineId);

    int updateByPrimaryKeySelective(Baseline record);

    int updateByPrimaryKey(Baseline record);
}