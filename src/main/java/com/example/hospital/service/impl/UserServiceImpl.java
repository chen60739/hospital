package com.example.hospital.service.impl;

import com.example.hospital.dao.UserMapper;
import com.example.hospital.dto.SuperUser;
import com.example.hospital.model.User;
import com.example.hospital.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

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

    /**
     * 查询医生
     * @return
     */
    @Override
    public List<User> selectUser() {
       return userMapper.selectUser();
    }

    /**
     * 查询护士
     * @return
     */
    @Override
    public List<User> selectNurse() {
        return userMapper.selectNurse();
    }

    /**
     * 查询药师
     * @return
     */
    @Override
    public List<User> selectApothecary() {
        return userMapper.selectApothecary();
    }

    /**
     * 查询技师
     * @return
     */
    @Override
    public List<User> selectArtificer() {
        return userMapper.selectArtificer();
    }


    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public User selectByPrimaryKey(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public List<User> selectOne(Integer userId) {
        return userMapper.selectOne(userId);
    }

    @Override
    public List<User> getUserAll(Integer userId,String userName,Integer userSex,String userPhone,String userEmail,String dictionaryName) {
        return userMapper.getUserAll(userId, userName, userSex, userPhone, userEmail,  dictionaryName);
    }

    @Override
    public int updateUser(User record) {
        return userMapper.updateUser(record);
    }

    @Override
    public List<User> getUserOne(Integer userId) {
        return userMapper.getUserOne(userId);
    }

    /**
     * 插入用户
     * @param record
     * @return
     */
    @Override
    public int insertUser(User record) {
        record.setCreateTime(new Date());
        return userMapper.insertUser(record);
    }

 /*   @Override

    @Override
    public List<SuperUser> findAllUser(String occupationId) {
        System.out.println(occupationId);
        return userMapper.selectAllUser(occupationId);
    }*/

    @Override
    public int removeById(String ids) {
        return userMapper.deleteById(ids);
    }
}
