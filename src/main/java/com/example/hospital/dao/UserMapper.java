package com.example.hospital.dao;

import com.example.hospital.dto.SuperUser;
import com.example.hospital.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insertUser(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);


    List<User> getUser(@Param("dictionaryName") String dictionaryName,@Param("userName") String userName);

    List<User> getUserByName(String dictionaryName,String userName);

    /**
     * 查询医生
     * @return
     */
    List<User> selectUser();

    /**
     * 查询护士
     * @return
     */
    List<User> selectNurse();

    /**
     * 查询药师
     * @return
     */
    List<User> selectApothecary();

    /**
     * 查询技师
     * @return
     */
    List<User> selectArtificer();

    List<User> selectOne(Integer userId);//查询单条

    /**
     * 用户界面条件查询加显示
     * @param userId
     * @param userName
     * @param userSex
     * @param userPhone
     * @param userEmail
     * @param dictionaryName
     * @return
     */
    List<User> getUserAll(@Param("userId") Integer userId, @Param("userName") String userName, @Param("userSex") Integer userSex,
                          @Param("userPhone") String userPhone, @Param("userEmail") String userEmail, @Param("dictionaryName") String dictionaryName);

    int updateUser(User record);

    List<User> getUserOne(Integer userId);

    /**
     *  //入组管理查询医生
     * @return
     */
    List<User> selectDoctor();

    //权限管理页面--查询
    List<SuperUser> selectAllUser(@Param("occupationId") String occupationId);


    /**
     * 批量删除
     * @param ids
     * @return
     */
    int removeUserById(@Param("ids") String ids);

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User selectNameById(@Param("id")String id);

    /**
     * 通过手机号查找用户
     * @param phone
     * @return
     */
    User getUserByPhone(String phone);

    /**
     * 通过用户id修改密码
     * @param id
     * @param pwd
     * @return
     */
    int updatePwdById(@Param("id") Integer id,@Param("pwd") String pwd);
}