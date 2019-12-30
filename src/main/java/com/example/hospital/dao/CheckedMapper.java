package com.example.hospital.dao;

import com.example.hospital.model.Checked;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CheckedMapper {
    List<Checked>   selectChecked(Integer checkedId);

    int deleteChecked(Integer checkedId);

    int insert(Checked record);

    int insertChecked(Checked record);

    Checked selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(Checked record);

    int updateByPrimaryKey(Checked record);
}