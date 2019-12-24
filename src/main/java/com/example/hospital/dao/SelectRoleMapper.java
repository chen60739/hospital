package com.example.hospital.dao;

import com.example.hospital.model.SelectRole;

public interface SelectRoleMapper {
    int deleteByPrimaryKey(Integer selectRoleId);

    int insert(SelectRole record);

    int insertSelective(SelectRole record);

    SelectRole selectByPrimaryKey(Integer selectRoleId);

    int updateByPrimaryKeySelective(SelectRole record);

    int updateByPrimaryKey(SelectRole record);
}