package com.example.hospital.dao;

import com.example.hospital.model.Dictionary;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DictionaryMapper {
    int deleteByPrimaryKey(Integer dictionaryId);

    int insert(Dictionary record);

    int insertSelective(Dictionary record);

    Dictionary selectByPrimaryKey(Integer dictionaryId);

    int updateByPrimaryKeySelective(Dictionary record);

    int updateByPrimaryKey(Dictionary record);
}