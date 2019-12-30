package com.example.hospital.dao;

import com.example.hospital.model.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {
    List<Test> selectTest(Integer testId);

    int deleteTest(Integer testId);

    int insert(Test record);

    int insertTest(Test record);

    Test selectByPrimaryKey(Integer tId);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);
}