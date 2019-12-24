package com.example.hospital.dao;

import com.example.hospital.model.Complications;

public interface ComplicationsMapper {
    int deleteByPrimaryKey(Integer complicationsId);

    int insert(Complications record);

    int insertSelective(Complications record);

    Complications selectByPrimaryKey(Integer complicationsId);

    int updateByPrimaryKeySelective(Complications record);

    int updateByPrimaryKey(Complications record);
}