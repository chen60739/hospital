package com.example.hospital.controller;

import com.example.hospital.model.Dictionary;
import com.example.hospital.model.Groups;
import com.example.hospital.service.GroupsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class GroupsController {
    @Resource
    GroupsService groupsService;


    //随访组管理查询
    @RequestMapping("findAllGroups")
    public List<Groups> findAllGroups(String groupPrincipal,String dictionaryId,Integer groupState,String time1,String time2){
        List<Groups> allGroups = groupsService.findAllGroups(groupPrincipal,dictionaryId,groupState,time1,time2);
        return allGroups;
    }
    //查看所有科室  回显
    @RequestMapping("findAllDepartment")
    public List<Dictionary> findAllDepartment(){
        return groupsService.findAll();
    }
}
