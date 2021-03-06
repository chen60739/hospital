package com.example.hospital.dao;

import com.example.hospital.model.Reviewers;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReviewersMapper {
    int deleteByPrimaryKey(Integer checkedId);

    int insert(Reviewers record);

    int insertSelective(Reviewers record);

    Reviewers selectByPrimaryKey(Integer checkedId);

    int updateByPrimaryKeySelective(Reviewers record);

    int updateByPrimaryKey(Reviewers record);
}