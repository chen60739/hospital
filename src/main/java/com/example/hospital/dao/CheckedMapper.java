package com.example.hospital.dao;

import com.example.hospital.model.Checked;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CheckedMapper {
    int deleteByPrimaryKey(Integer cId);

    int insert(Checked record);

    int insertSelective(Checked record);

    Checked selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(Checked record);

    int updateByPrimaryKey(Checked record);
}