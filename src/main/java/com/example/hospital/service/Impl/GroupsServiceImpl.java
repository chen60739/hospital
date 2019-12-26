package com.example.hospital.service.Impl;

import com.example.hospital.dao.DictionaryMapper;
import com.example.hospital.dao.GroupsMapper;
import com.example.hospital.model.Dictionary;
import com.example.hospital.model.Groups;
import com.example.hospital.service.GroupsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GroupsServiceImpl implements GroupsService{
    @Resource
    GroupsMapper groupsMapper;
    @Resource
    DictionaryMapper dictionaryMapper;

    @Override
    public List<Groups> findAllGroups(String groupPrincipal,String dictionaryName,Integer groupState,String time1,String time2) {
        System.out.println(groupState);
        List<Groups> findAllGroups= groupsMapper.selectAllGroups(groupPrincipal,dictionaryName,groupState,time1,time2);
        return findAllGroups;
    }

    @Override
    public List<Dictionary> findAll() {
        return dictionaryMapper.selectAll();
    }

}
