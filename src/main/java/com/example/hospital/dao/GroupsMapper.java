package com.example.hospital.dao;

import com.example.hospital.model.Dictionary;
import com.example.hospital.model.Groups;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GroupsMapper {
    int deleteByPrimaryKey(Integer groupId);

    int insert(Groups record);

    int insertSelective(Groups record);

    Groups selectByPrimaryKey(Integer groupId);

    int updateByPrimaryKeySelective(Groups record);

    int updateByPrimaryKey(Groups record);

    //随访组管理查询
    List<Groups> selectAllGroups(@Param("groupPrincipal") String groupPrincipal, @Param("dictionaryId")String dictionaryId, @Param("groupState")Integer groupState, @Param("time1")String time1, @Param("time2")String time2);

    //批量删除
    int deleteById(@Param("ids") String ids);

    //修改随访组列表
    int updateOne(Groups groups);

    //添加随访组列表
    int insertOne(Groups groups);


}