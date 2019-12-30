package com.example.hospital.service.impl;

import com.example.hospital.dao.DictionaryMapper;
import com.example.hospital.dao.GroupsMapper;
import com.example.hospital.model.Dictionary;
import com.example.hospital.model.Groups;
import com.example.hospital.service.GroupsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 *@Author 王斌
 *@data 2019/12/26
 */
@Service
public class GroupsServiceImpl implements GroupsService{
    @Resource
    GroupsMapper groupsMapper;
    @Resource
    DictionaryMapper dictionaryMapper;

    @Override
    public List<Groups> findAllGroups(String groupPrincipal,String dictionaryName,Integer groupState,String time1,String time2) {
        List<Groups> findAllGroups= groupsMapper.selectAllGroups(groupPrincipal,dictionaryName,groupState,time1,time2);
        return findAllGroups;
    }

    @Override
    public List<Groups> selectAllGroups() {
        List<Groups> groups = groupsMapper.selectAll();
        return groups;
    }

    @Override
    public List<Dictionary> findAll() {
        return dictionaryMapper.selectAll();
    }
    @Override
    public List<Dictionary> findAll1() {
        return dictionaryMapper.selectAll1();
    } @Override
    public List<Dictionary> findAll2() {
        return dictionaryMapper.selectAll2();
    }

    @Override
    public int removeById(String ids) {
        return groupsMapper.deleteById(ids);
    }

    @Override
    public int changeOne(Groups groups) {
        return groupsMapper.updateOne(groups);
    }

    @Override
    public int saveOne(Groups groups) {
        return groupsMapper.insertOne(groups);
    }

}
