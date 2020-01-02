package com.example.hospital.service;

import com.example.hospital.dto.SuperUser;
import com.example.hospital.model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UserService {
    List<User> getUser(String dictionaryName,String userName);

    List<User> getUserByName(String dictionaryName,String userName);

    int deleteByPrimaryKey(Integer userId);

    List<User> selectUser();//插入查询

    int insert(User record);

    List<User> getUserByNUll();

    //权限管理页面--查询
    List<SuperUser> findAllUser(String occupationId);

    //批量删除
    int removeById(String ids);
}
