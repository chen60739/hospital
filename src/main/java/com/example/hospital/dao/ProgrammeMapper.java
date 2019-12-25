package com.example.hospital.dao;

import com.example.hospital.model.Programme;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProgrammeMapper {
    int deleteByPrimaryKey(Integer programmeId);

    int insert(Programme record);

    int insertSelective(Programme record);

    Programme selectByPrimaryKey(Integer programmeId);

    int updateByPrimaryKeySelective(Programme record);

    int updateByPrimaryKey(Programme record);
}