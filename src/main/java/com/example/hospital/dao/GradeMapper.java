package com.example.hospital.dao;

import com.example.hospital.model.Grade;

import java.util.List;

public interface GradeMapper {
    int deleteByPrimaryKey(Integer gId);

    int insert(Grade record);

    int insertSelective(Grade record);

    List<Grade> selectByGradeGid(Integer gId);

    int updateByPrimaryKeySelective(Grade record);

    int updateByPrimaryKey(Grade record);
}