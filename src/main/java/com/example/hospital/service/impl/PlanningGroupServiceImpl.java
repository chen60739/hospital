package com.example.hospital.service.impl;

import com.example.hospital.dao.PlanningGroupMapper;
import com.example.hospital.model.PlanningGroup;
import com.example.hospital.service.PlanningGroupService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class PlanningGroupServiceImpl implements PlanningGroupService {

    @Resource
    private PlanningGroupMapper planningGroupMapper;

    @Override
    public int insert(PlanningGroup record) {
        record.setInGroupTime(new Date());
        return planningGroupMapper.insert(record);
    }
}
