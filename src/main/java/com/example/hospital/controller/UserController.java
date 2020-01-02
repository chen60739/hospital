package com.example.hospital.controller;

import com.example.hospital.dto.SuperUser;
import com.example.hospital.model.User;
import com.example.hospital.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/getUser")
    public List<User> getUser(String dictionaryName,String userName){
        System.out.println("123");
        System.out.println(dictionaryName+" "+userName);
        List<User> users =userService.getUser(dictionaryName,userName);
        return users;
    }

    @ResponseBody
    @RequestMapping("/getUserByName")
    public List<User> getUserByName(String dictionaryName,String userName){
        List<User> list =userService.getUserByName(dictionaryName,userName);
        return list;
    }


    @RequestMapping("/deleteUser")
    public String deleteUser(@RequestParam("userId")Integer userId){
        userService.deleteByPrimaryKey(userId);
        return "redirect:power";
    }

    @ResponseBody
    @RequestMapping("/selectUser")
    public List<User> selectUser(){
       List<User> users= userService.selectUser();
        return users;
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

    @RequestMapping("/selectOne")
    public String selectOne(Integer userId){
        userService.selectOne(userId);
        return "redirect:power";
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


}
