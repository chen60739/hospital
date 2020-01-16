package com.example.hospital.dao;

import com.example.hospital.model.PlanningGroup;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PlanningGroupMapper {
    int deleteByPrimaryKey(Integer planningId);

    /**
     * 插入入组id病人id
     * @param record
     * @return
     */
    int insert(PlanningGroup record);

    int insertSelective(PlanningGroup record);

    PlanningGroup selectByPrimaryKey(Integer planningId);

    int updateByPrimaryKeySelective(PlanningGroup record);

    int updateByPrimaryKey(PlanningGroup record);
}