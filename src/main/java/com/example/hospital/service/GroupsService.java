package com.example.hospital.service;

import com.example.hospital.model.Dictionary;
import com.example.hospital.model.Groups;

import java.util.List;
import java.util.Map;

public interface GroupsService {

    //随访组管理查询
    List<Groups> findAllGroups(String groupPrincipal,String dictionaryId,Integer groupState,String time1,String time2);

    //查询科室
    List<Dictionary> findAll();

    List<Groups> selectAllGroups();
}
