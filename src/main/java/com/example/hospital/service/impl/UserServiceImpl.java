package com.example.hospital.service.impl;

import com.example.hospital.dao.UserMapper;
import com.example.hospital.dto.SuperUser;
import com.example.hospital.model.User;
import com.example.hospital.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUser(String dictionaryName,String userName) {
        return userMapper.getUser(dictionaryName,userName);
    }

    @Override
    public List<User> getUserByName(String dictionaryName,String userName) {
        return userMapper.getUserByName(dictionaryName,userName);
    }

    @Override
    public int deleteByPrimaryKey(Integer userId) {
        return userMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public List<User> selectUser() {
       return userMapper.selectUser();
    }

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public List<User> getUserByNUll() {
        return userMapper.getUserByNull();
    }

    @Override
    public List<SuperUser> findAllUser(String occupationId) {
        System.out.println(occupationId);
        return userMapper.selectAllUser(occupationId);
    }

    @Override
    public int removeById(String ids) {
        return userMapper.deleteById(ids);
    }
}
