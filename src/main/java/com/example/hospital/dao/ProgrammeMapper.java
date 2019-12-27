package com.example.hospital.dao;

import com.example.hospital.dto.SuperProgramme;
import com.example.hospital.model.Programme;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProgrammeMapper {
    List<SuperProgramme> selectProgrammeByDepartment(Integer departmentId);

//  int updateProgrammeName(Integer programmeId,String programmeName);

    Programme selectProgrammeName(String programmeName);

    int deleteByPrimaryKey(Integer programmeId);

    int insert(Programme record);

     int insertProgramme(Programme record);

    Programme selectByPrimaryKey(Integer programmeId);

    int updateProgramme(Programme record);

    int updateByPrimaryKey(Programme record);
}