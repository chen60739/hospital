package com.example.hospital.dao;

import com.example.hospital.dto.SupGroupUserRole;
import com.example.hospital.dto.SuperUser;
import com.example.hospital.model.GroupUserRole;
import com.example.hospital.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GroupUserRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GroupUserRole record);

    int insertSelective(GroupUserRole record);

    GroupUserRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GroupUserRole record);

    int updateByPrimaryKey(GroupUserRole record);

    //权限管理页面--查询
    List<SupGroupUserRole> selectAllGroupUser(@Param("occupationId") String occupationId);

    //批量删除
    int deleteById(@Param("ids") String ids);

    //根据科室id查询 姓名
    List<SupGroupUserRole> selectNameByDepartmentId(@Param("departmentId") Integer departmentId, @Param("userName") String userName);

    //新增用户
    int updateGroupUserRole(@Param("groupUserId") String groupUserId, @Param("id") Integer id);

    //修改权限
    int updateGroupUserRole1(@Param("id") Integer id, @Param("groupRoleId") String groupRoleId);


}