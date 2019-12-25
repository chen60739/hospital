package com.example.hospital.dao;

import com.example.hospital.model.Medication;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MedicationMapper {
    int deleteByPrimaryKey(Integer mId);

    int insert(Medication record);

    int insertSelective(Medication record);

    Medication selectByPrimaryKey(Integer mId);

    int updateByPrimaryKeySelective(Medication record);

    int updateByPrimaryKey(Medication record);
}