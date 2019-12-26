package com.example.hospital.controller;

import com.example.hospital.model.User;
import com.example.hospital.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/getUser")
    public List<User> getUser(){
        List<User> users =userService.getUser();
        return users;
    }

    @ResponseBody
    @RequestMapping("/getUserByName")
    public String getUserByName(ModelMap map, String dictionaryName, String userName){
        List<User> name =userService.getUserByName(dictionaryName, userName);
        map.put("name",name);
        return "power";
    }
}
