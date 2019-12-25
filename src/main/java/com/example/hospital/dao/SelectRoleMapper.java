package com.example.hospital.dao;

import com.example.hospital.model.SelectRole;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SelectRoleMapper {
    int deleteByPrimaryKey(Integer selectRoleId);

    int insert(SelectRole record);

    int insertSelective(SelectRole record);

    SelectRole selectByPrimaryKey(Integer selectRoleId);

    int updateByPrimaryKeySelective(SelectRole record);

    int updateByPrimaryKey(SelectRole record);
}