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

    /**
     * 权限管理页面--查询
     * @param occupationId
     * @param groupId
     * @return
     */
    List<SupGroupUserRole> selectAllGroupUser(@Param("occupationId") String occupationId,@Param("groupId")Integer groupId);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    int deleteById(@Param("ids") String ids);

    /**
     * 根据科室id查询 姓名
     * @param departmentId
     * @param userName
     * @return
     */
    List<SupGroupUserRole> selectNameByDepartmentId(@Param("departmentId") Integer departmentId, @Param("userName") String userName);

    /**
     * 新增用户
     * @param groupUserId
     * @param id
     * @return
     */
    int updateGroupUserRole(@Param("groupUserId") String groupUserId, @Param("id") Integer id);

    /**
     * 修改权限
     * @param id
     * @param groupRoleId
     * @return
     */
    int updateGroupUserRole1(@Param("id") Integer id, @Param("groupRoleId") String groupRoleId);

    /**
     * 新增用户权限
     * @param groupUserRole
     * @return
     */
    int insertGroupUserRole(GroupUserRole groupUserRole);




}