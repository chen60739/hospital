package com.example.hospital.service.impl;

import com.example.hospital.dao.UserMapper;
import com.example.hospital.model.User;
import com.example.hospital.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
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

    @Override
    public Map<String, String> checkUser(String phone, String password, HttpSession session) {
        User user = userMapper.getUserByPhone(phone);
        Map<String,String> res = new HashMap<>();
        if (user != null) {
            if (password.equals(user.getUserPwd())){
                session.setAttribute("user",user);
                res.put("mes","success");
                res.put("address","/login");
            }else {
                res.put("mes","密码错误");
            }
        }else {
            res.put("mes","用户不存在");
        }
        return res;
    }

    @Override
    public int insertUser(User record) {
        record.setCreateTime(new Date());
        return userMapper.insertUser(record);
    }

    /**
     * 根据id 批量删除user
     *
     * @param ids
     * @return
     */
    @Override
    public int removeUserById(String ids) {
        return userMapper.removeUserById(ids);
    }
}
