package com.example.hospital.dao;

import com.example.hospital.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import javax.jws.soap.SOAPBinding;
import java.util.List;
@Component
@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> getUser(String dictionaryName,String userName);

    List<User> getUserByName(String dictionaryName,String userName);

    List<User> selectUser();

    List<User> getUserByNull();
}