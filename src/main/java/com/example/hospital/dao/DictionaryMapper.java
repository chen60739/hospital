package com.example.hospital.dao;

import com.example.hospital.model.Dictionary;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DictionaryMapper {
    //查询提醒方式
    List<Dictionary> selectVisit();
    //查询方案
    List<Dictionary> selectProgramme();

    int deleteByPrimaryKey(Integer dictionaryId);

    int insert(Dictionary record);

    int insertSelective(Dictionary record);

    Dictionary selectByPrimaryKey(Integer dictionaryId);

    int updateByPrimaryKeySelective(Dictionary record);

    int updateByPrimaryKey(Dictionary record);

    //查询科室
    List<Dictionary> selectAll();
    //查询医院
    List<Dictionary> selectAll1();
    //查询级别
    List<Dictionary> selectAll2();
}