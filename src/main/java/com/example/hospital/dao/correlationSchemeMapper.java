package com.example.hospital.dao;

import com.example.hospital.model.correlationScheme;

public interface correlationSchemeMapper {
    int deleteByPrimaryKey(Integer csId);

    int insert(correlationScheme record);

    int insertSelective(correlationScheme record);

    correlationScheme selectByPrimaryKey(Integer csId);

    int updateByPrimaryKeySelective(correlationScheme record);

    int updateByPrimaryKey(correlationScheme record);
}