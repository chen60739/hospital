package com.example.hospital.service;

import com.example.hospital.model.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<User> getUser(String dictionaryName,String userName);

    List<User> getUserByName(String dictionaryName,String userName);

    int deleteByPrimaryKey(Integer userId);

    List<User> selectUser();//查询

    int updateByPrimaryKeySelective(User record);

    User selectByPrimaryKey(Integer userId);//查询单条

    User selectOne(Integer userId);//查询单条
}
