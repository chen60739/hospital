package com.example.hospital.dao;

import com.example.hospital.model.Baseline;

public interface BaselineMapper {
    int deleteByPrimaryKey(Integer baselineId);

    int insert(Baseline record);

    int insertSelective(Baseline record);

    Baseline selectByPrimaryKey(Integer baselineId);

    int updateByPrimaryKeySelective(Baseline record);

    int updateByPrimaryKey(Baseline record);
}