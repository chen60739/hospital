package com.example.hospital.dao;

import com.example.hospital.model.Dictionary;
import com.example.hospital.model.GroupUserRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DictionaryMapper {
    //查询提醒方式
    List<Dictionary> selectVisit();
    //查询方案
    List<Dictionary> selectProgramme();

    int deleteByPrimaryKey(Integer dictionaryId);

    int insert(Dictionary record);

    int insertSelective(Dictionary record);

    Dictionary selectByPrimaryKey(Integer dictionaryId);

    int updateByPrimaryKeySelective(Dictionary record);

    int updateByPrimaryKey(Dictionary record);

    //查询科室
    List<Dictionary> selectAll();
    //查询医院
    List<Dictionary> selectAll1();
    //查询级别
    List<Dictionary> selectAll2();

    //根据id查询权限名字
    Dictionary selectGroupRoleName(@Param("id") String id);

    /**
     * 查询疾病和疾病编码的回显
     * @return
     */
    List<Dictionary> getDisease();

}