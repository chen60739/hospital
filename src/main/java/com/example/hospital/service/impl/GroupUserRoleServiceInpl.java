package com.example.hospital.service.impl;

import com.example.hospital.dao.DictionaryMapper;
import com.example.hospital.dao.GroupUserRoleMapper;
import com.example.hospital.dao.UserMapper;
import com.example.hospital.dto.SupGroupUserRole;
import com.example.hospital.dto.SuperUser;
import com.example.hospital.model.Dictionary;
import com.example.hospital.model.User;
import com.example.hospital.service.GroupUserRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * @Author 王斌
 * @data 2020/01/05
 */
@Service
public class GroupUserRoleServiceInpl implements GroupUserRoleService {
    @Resource
    GroupUserRoleMapper groupUserRoleMapper;
    @Resource
    DictionaryMapper dictionaryMapper;
    @Resource
    UserMapper userMapper;

    @Override
    public List<SupGroupUserRole> findNameByDepartmentId(Integer departmentId, String userName) {
        return groupUserRoleMapper.selectNameByDepartmentId(departmentId,userName);
    }

    @Override
    public HashMap<String,Object> changeGroupUserRole(String groupUserId, Integer id, String groupRoleId) {
        HashMap<String,Object> map= new HashMap<>();
         groupUserRoleMapper.updateGroupUserRole(groupUserId,id);
        groupUserRoleMapper.updateGroupUserRole1(id, groupRoleId);
         return map;
    }

    @Override
    public Dictionary findGroupRoleName(String id) {
        return dictionaryMapper.selectGroupRoleName(id);
    }

    @Override
    public User findNameById(String id) {
        return userMapper.selectNameById(id);
    }


    @Override
    public List<SupGroupUserRole> findAllGroupUser(String occupationId,Integer groupId) {
        return groupUserRoleMapper.selectAllGroupUser(occupationId,groupId);
    }

    @Override
    public int removeById(String ids) {
        return groupUserRoleMapper.deleteById(ids);
    }


}
