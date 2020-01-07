package com.example.hospital.service;

import com.example.hospital.dto.SuperUser;
import com.example.hospital.model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UserService {
    List<User> getUser(String dictionaryName,String userName);//权限界面

    List<User> getUserByName(String dictionaryName,String userName);

    int deleteByPrimaryKey(Integer userId);

    List<User> selectUser();//查询

    int updateByPrimaryKeySelective(User record);

    //批量删除
    int removeById(String ids);

    User selectByPrimaryKey(Integer userId);//查询单条

    User selectOne(Integer userId);//查询单条


    List<User> selectOne(Integer userId);//查询单条

    //用户界面
    List<User> getUserAll(Integer userId,String userName,Integer userSex,String userPhone,String userEmail,String dictionaryName);

    int updateUser(User record);

    List<User> getUserOne(Integer userId);

    int insertUser(User record);
}
