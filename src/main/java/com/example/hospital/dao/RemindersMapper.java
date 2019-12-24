package com.example.hospital.dao;

import com.example.hospital.model.Reminders;

public interface RemindersMapper {
    int deleteByPrimaryKey(Integer remId);

    int insert(Reminders record);

    int insertSelective(Reminders record);

    Reminders selectByPrimaryKey(Integer remId);

    int updateByPrimaryKeySelective(Reminders record);

    int updateByPrimaryKey(Reminders record);
}