package com.example.hospital.dao;

import com.example.hospital.model.OperativeInformation;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OperativeInformationMapper {
    int deleteByPrimaryKey(Integer operativeId);

    int insert(OperativeInformation record);

    int insertSelective(OperativeInformation record);

    OperativeInformation selectByPrimaryKey(Integer operativeId);

    int updateByPrimaryKeySelective(OperativeInformation record);

    int updateByPrimaryKey(OperativeInformation record);
}