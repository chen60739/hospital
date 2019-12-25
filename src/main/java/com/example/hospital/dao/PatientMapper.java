package com.example.hospital.dao;

import com.example.hospital.model.Patient;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PatientMapper {
    int deleteByPrimaryKey(Integer patientId);

    int insert(Patient record);

    int insertSelective(Patient record);

    Patient selectByPrimaryKey(Integer patientId);

    int updateByPrimaryKeySelective(Patient record);

    int updateByPrimaryKey(Patient record);
}