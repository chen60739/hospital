package com.example.hospital.dao;

import com.example.hospital.model.InspectionReport;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InspectionReportMapper {
    int deleteByPrimaryKey(Integer inspectionId);

    int insert(InspectionReport record);

    int insertSelective(InspectionReport record);

    InspectionReport selectByPrimaryKey(Integer inspectionId);

    int updateByPrimaryKeySelective(InspectionReport record);

    int updateByPrimaryKey(InspectionReport record);
}