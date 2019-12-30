package com.example.hospital.dao;

import com.example.hospital.dto.CalendarFollowUp;
import com.example.hospital.model.FollowUp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface FollowUpMapper {
    int deleteByPrimaryKey(Integer followId);

    int insert(FollowUp record);

    int insertSelective(FollowUp record);

    FollowUp selectByPrimaryKey(Integer followId);

    int updateByPrimaryKeySelective(FollowUp record);

    int updateByPrimaryKey(FollowUp record);

    /**
     * 通过id修改随访状态
     * @param followId id
     * @param followState 随访状态
     * @return
     */
    int changeFollowState(@Param("followId") Integer followId,@Param("followState") Boolean followState);

    List<CalendarFollowUp> calendarData();

    List<Date> getDistinctFollowTime();
}