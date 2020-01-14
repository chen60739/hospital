package com.example.hospital.controller;

import com.example.hospital.model.Dictionary;
import com.example.hospital.model.Groups;
import com.example.hospital.service.GroupsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
*@Author 王斌
*@data 2019/12/26
*/
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
    //查看所有医院  回显
    @RequestMapping("findAllHospital")
    public List<Dictionary> findAllHospital(){
        return groupsService.findAll1();
    }
    //查看所有级别  回显
    @RequestMapping("findAllLeavl")
    public List<Dictionary> findAllLeavl(){
        return groupsService.findAll2();
    }

    //批量删除
    @RequestMapping("removeById")
    public String  removeById(String ids){
        String substring = ids.substring(0, ids.length() - 1);
        String[] split = substring.split(",");
        try{
            for (int i=0;i<split.length;i++){
                groupsService.removeById(split[i]);
            }
            return "success";
        }catch (NumberFormatException e){
            e.printStackTrace();
            return "error";
        }

    }
    //修改单条随访组列表
    @RequestMapping("changeOne")
    public int changeOne(Groups groups){
        return groupsService.changeOne(groups);
    }
    //新增随访组列表
    @RequestMapping("saveOne")
    public  int saveOne(Groups groups){
        /*groups.setGroupStartTime(groupStartTime);
        System.out.println(groupStartTime);*/
        return groupsService.saveOne(groups);
    }
}
