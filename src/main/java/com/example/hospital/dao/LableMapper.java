package com.example.hospital.dao;

import com.example.hospital.model.Lable;

public interface LableMapper {
    int deleteByPrimaryKey(Integer lableId);

    int insert(Lable record);

    int insertSelective(Lable record);

    Lable selectByPrimaryKey(Integer lableId);

    int updateByPrimaryKeySelective(Lable record);

    int updateByPrimaryKey(Lable record);
}