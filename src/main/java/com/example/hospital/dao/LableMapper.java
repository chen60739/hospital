package com.example.hospital.dao;

import com.example.hospital.dto.LablePro;
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

    /**
     * 查询所有标签
     * @return
     */
    List<LablePro> selectAll();

    /**
     * 通过模板id查找
     * @param tempId
     * @return
     */
    List<Lable> selectSome(Integer tempId);

    /**
     * 查找一级标签
     * @return
     */
    List<Lable> selectOneLevel();

}