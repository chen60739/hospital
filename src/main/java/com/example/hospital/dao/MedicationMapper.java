package com.example.hospital.dao;

import com.example.hospital.model.Medication;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MedicationMapper {
    List<Medication> selectMedication(Integer medicationId);

    int deleteMedication(Integer medicationId);

    int insert(Medication record);

    int insertMedication(Medication record);

    Medication selectByPrimaryKey(Integer mId);

    int updateByPrimaryKeySelective(Medication record);

    int updateByPrimaryKey(Medication record);
}