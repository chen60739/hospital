package com.example.hospital.service;

import com.example.hospital.model.Dictionary;
import com.example.hospital.model.Groups;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 *@Author 王斌
 *@data 2019/12/26
 */
public interface GroupsService {

    //随访组管理查询
    List<Groups> findAllGroups(String groupPrincipal,String dictionaryId,Integer groupState,String time1,String time2);

    //查询科室
    List<Dictionary> findAll();
    //查询医院
    List<Dictionary> findAll1();
    //查询级别
    List<Dictionary> findAll2();

    //批量删除
    int removeById(String ids);

    //修改随访组列表
    int changeOne(Groups groups);

    //添加随访组列表
    int saveOne(Groups groups);

    List<Groups> selectAllGroups();
}
