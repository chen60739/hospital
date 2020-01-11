package com.example.hospital.dao;

import com.example.hospital.model.Reminders;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RemindersMapper {
    int deleteByRemindersId(Integer remRemindersId);

    int insert(Reminders record);

    int insertReminders(Reminders record);

    Reminders selectByPrimaryKey(Integer remId);

    int updateByPrimaryKeySelective(Reminders record);

    int updateByPrimaryKey(Reminders record);
}