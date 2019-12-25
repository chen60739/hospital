package com.example.hospital.dao;

import com.example.hospital.model.CorrelationScheme;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CorrelationSchemeMapper {
    int deleteByPrimaryKey(Integer csId);

    int insert(CorrelationScheme record);

    int insertSelective(CorrelationScheme record);

    CorrelationScheme selectByPrimaryKey(Integer csId);

    int updateByPrimaryKeySelective(CorrelationScheme record);

    int updateByPrimaryKey(CorrelationScheme record);
}