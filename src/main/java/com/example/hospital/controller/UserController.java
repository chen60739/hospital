package com.example.hospital.controller;

import com.example.hospital.dto.SuperUser;
import com.example.hospital.model.User;
import com.example.hospital.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author 陈云强
 * @data
 */

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 权限页面的查询
     * @param dictionaryName
     * @param userName
     * @return
     */
    @ResponseBody
    @RequestMapping("/getUser")
    public List<User> getUser(String dictionaryName,String userName){
        System.out.println(dictionaryName);
        List<User> users =userService.getUser(dictionaryName,userName);
        return users;
    }

    @ResponseBody
    @RequestMapping("/getUserByName")
    public List<User> getUserByName(String dictionaryName,String userName){
        List<User> list =userService.getUserByName(dictionaryName,userName);
        return list;
    }

    /**
     * 删除用户界面的个人信息
     * @param userId
     * @return
     */
    @RequestMapping("/deleteUser")
    public String deleteUser(@RequestParam("userId")Integer userId){
        userService.deleteByPrimaryKey(userId);
        return "redirect:power";
    }

    /**
     * 查询医生
     * @return
     */
    @ResponseBody
    @RequestMapping("/selectUser")
    public List<User> selectUser(){
       List<User> users= userService.selectUser();
        return users;
    }

    /**
     * 查询护士
     * @return
     */
    @ResponseBody
    @RequestMapping("/selectNurse")
    public List<User> selectNurse(){
        List<User> nurse= userService.selectNurse();
        return nurse;
    }

    /**
     * 查询药师
     * @return
     */
    @ResponseBody
    @RequestMapping("/selectApothecary")
    public List<User> selectApothecary(){
        List<User> apothecary= userService.selectApothecary();
        return apothecary;
    }

    /**
     * 查询技师
     * @return
     */
    @ResponseBody
    @RequestMapping("/selectArtificer")
    public List<User> selectArtificer(){
        List<User> artificer= userService.selectArtificer();
        return artificer;
    }

    @RequestMapping("/updateInsert")
    public String updateInsert(User user){
        userService.updateByPrimaryKeySelective(user);
        return "redirect:power";
    }

    @RequestMapping("/selectByKey")
    public String selectByKey(Integer userId){
        userService.selectByPrimaryKey(userId);
        return "redirect:power";
    }

    @ResponseBody
    @RequestMapping("/selectOne")
    public List<User> selectOne(Integer userId){
        List<User> list =userService.selectOne(userId);
        return list;
    }

    /**
     * 查询用户界面，包括条件查询
     * @param userId
     * @param userName
     * @param userSex
     * @param userPhone
     * @param userEmail
     * @param dictionaryName
     * @return
     */
    @ResponseBody
    @RequestMapping("/getUserAll")
    public List<User> getUserAll(Integer userId,String userName,Integer userSex,
                                 String userPhone,String userEmail,
                                 String dictionaryName){

        List<User> userAll =userService.getUserAll(userId, userName, userSex,
                userPhone, userEmail, dictionaryName);
        System.out.println(dictionaryName);
        return userAll;
    }

    /**
     * 用户管理界面插入用户
     * @param user
     * @return
     */
    @RequestMapping("/insertUser")
    public String insertUser(User user){
        System.out.println(user);
        userService.insertUser(user);
        return "redirect:user";
    }

    /**
     * 用户管理界面修改用户
     * @param user
     * @return
     */
    @RequestMapping("/updateUser")
    public String updateUser(User user){
        userService.updateUser(user);
        return "redirect:user";
    }

    @RequestMapping("findAllUser")
    @ResponseBody
    public List<SuperUser> findAllUser(String occupationId){
        return userService.findAllUser(occupationId);
    }

    //批量删除
    @RequestMapping("removeById1")
    @ResponseBody
    public String  removeById1(String ids){
        System.out.println(ids);
        String substring = ids.substring(0, ids.length() - 1);
        String[] split = substring.split(",");
        try{
            for (int i=0;i<split.length;i++){
                userService.removeById(split[i]);
            }
            return "success";
        }catch (NumberFormatException e){
            e.printStackTrace();
            return "error";
        }

    }

    /**
     * 根据id查询单个用户
     * @param userId
     * @return
     */
    @ResponseBody
    @RequestMapping("/selectUserOne")
    public List<User> selectUserOne(Integer userId){
        List<User> list=userService.getUserOne(userId);
        return list;
    }

}
