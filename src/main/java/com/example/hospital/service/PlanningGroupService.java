package com.example.hospital.service;

import com.example.hospital.model.PlanningGroup;

public interface PlanningGroupService {

    /**
     * 插入入组id病人id
     * @param record
     * @return
     */
    int insert(PlanningGroup record);
}
