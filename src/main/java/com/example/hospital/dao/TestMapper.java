package com.example.hospital.dao;

import com.example.hospital.model.Test;

public interface TestMapper {
    int deleteByPrimaryKey(Integer tId);

    int insert(Test record);

    int insertSelective(Test record);

    Test selectByPrimaryKey(Integer tId);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);
}