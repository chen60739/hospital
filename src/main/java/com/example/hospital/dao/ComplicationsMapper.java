package com.example.hospital.dao;

import com.example.hospital.model.Complications;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ComplicationsMapper {
    int deleteByPrimaryKey(Integer complicationsId);

    int insert(Complications record);

    int insertSelective(Complications record);

    Complications selectByPrimaryKey(Integer complicationsId);

    int updateByPrimaryKeySelective(Complications record);

    int updateByPrimaryKey(Complications record);
}