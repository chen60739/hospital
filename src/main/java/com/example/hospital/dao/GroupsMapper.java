package com.example.hospital.dao;

import com.example.hospital.model.Groups;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GroupsMapper {
    int deleteByPrimaryKey(Integer groupId);

    int insert(Groups record);

    int insertSelective(Groups record);

    Groups selectByPrimaryKey(Integer groupId);

    int updateByPrimaryKeySelective(Groups record);

    int updateByPrimaryKey(Groups record);

}