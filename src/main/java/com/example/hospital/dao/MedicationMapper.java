package com.example.hospital.dao;

import com.example.hospital.model.Medication;

public interface MedicationMapper {
    int deleteByPrimaryKey(Integer mId);

    int insert(Medication record);

    int insertSelective(Medication record);

    Medication selectByPrimaryKey(Integer mId);

    int updateByPrimaryKeySelective(Medication record);

    int updateByPrimaryKey(Medication record);
}