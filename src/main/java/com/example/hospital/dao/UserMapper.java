package com.example.hospital.dao;

import com.example.hospital.dto.SuperUser;
import com.example.hospital.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
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


    List<User> getUser(@Param("dictionaryName") String dictionaryName,@Param("userName") String userName);

    List<User> getUserByName(String dictionaryName,String userName);

    List<User> selectUser();

    User selectOne(Integer userId);//查询单条

    //批量删除
    int deleteById(@Param("ids") String ids);

    //根据id查询用户
    User selectNameById(@Param("id")String id);
}