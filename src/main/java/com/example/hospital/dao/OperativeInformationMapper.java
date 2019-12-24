package com.example.hospital.dao;

import com.example.hospital.model.OperativeInformation;

public interface OperativeInformationMapper {
    int deleteByPrimaryKey(Integer operativeId);

    int insert(OperativeInformation record);

    int insertSelective(OperativeInformation record);

    OperativeInformation selectByPrimaryKey(Integer operativeId);

    int updateByPrimaryKeySelective(OperativeInformation record);

    int updateByPrimaryKey(OperativeInformation record);
}