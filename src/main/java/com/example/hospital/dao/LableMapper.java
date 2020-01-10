package com.example.hospital.dao;

import com.example.hospital.model.Lable;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LableMapper {
    int deleteByPrimaryKey(Integer lableId);

    int insert(Lable record);

    int insertSelective(Lable record);

    Lable selectByPrimaryKey(Integer lableId);

    int updateByPrimaryKeySelective(Lable record);

    int updateByPrimaryKey(Lable record);

    List<Lable> selectAll();

    /**
     * 通过模板id查找
     * @param tempId
     * @return
     */
    List<Lable> selectSome(Integer tempId);
}