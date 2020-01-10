package com.example.hospital.service;

import com.example.hospital.dto.SupGroupUserRole;
import com.example.hospital.dto.SuperUser;
import com.example.hospital.model.Dictionary;
import com.example.hospital.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

/**
 * @Author 王斌
 * @data 2020/01/05
 */
public interface GroupUserRoleService {

    //权限管理页面--查询
    List<SupGroupUserRole> findAllGroupUser(String occupationId);

    //批量删除
    int removeById(String ids);

    //根据科室id查询 姓名
    List<SupGroupUserRole> findNameByDepartmentId(Integer departmentId ,String userName);

    //新增用户
    HashMap<String,Object> changeGroupUserRole(String groupUserId, Integer id, String groupRoleId);

    //根据id查询权限名字
    Dictionary findGroupRoleName(String id);
    //根据id查询用户
    User findNameById(String id);

}
