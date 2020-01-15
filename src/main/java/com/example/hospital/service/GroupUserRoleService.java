package com.example.hospital.service;

import com.example.hospital.dto.SupGroupUserRole;
import com.example.hospital.dto.SuperUser;
import com.example.hospital.model.Dictionary;
import com.example.hospital.model.GroupUserRole;
import com.example.hospital.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

/**
 * @Author 王斌
 * @data 2020/01/05
 */
public interface GroupUserRoleService {

    /**
     * 权限管理页面--查询
     * @param occupationId
     * @param groupId
     * @return
     */
    List<SupGroupUserRole> findAllGroupUser(String occupationId,Integer groupId);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    int removeById(String ids);

    /**
     * 根据科室id查询 姓名
     * @param departmentId
     * @param userName
     * @return
     */
    List<SupGroupUserRole> findNameByDepartmentId(Integer departmentId ,String userName);

    /**
     * 新增用户
     * @param groupUserId
     * @param id
     * @param groupRoleId
     * @return
     */
    HashMap<String,Object> changeGroupUserRole(String groupUserId, Integer id, String groupRoleId);

    /**
     * 根据id查询权限名字
     * @param id
     * @return
     */
    Dictionary findGroupRoleName(String id);

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User findNameById(String id);
    /**
     * 新增用户权限
     * @param groupUserRole
     * @return
     */
    int saveGroupUserRole(GroupUserRole groupUserRole);

    /**
     * 修改角色级别和角色名称
     * @param groupUserRole
     * @return
     */
    int changeOccupationGrade(GroupUserRole groupUserRole);

}
