package com.example.hospital.service;

import com.example.hospital.dto.FollowUpPatient;
import com.example.hospital.dto.SupFollowUp;

import java.util.List;
import java.util.Map;

/**
 * @author 陈奕璇
 * @date 2019/12/28
 */
public interface FollowUpManagementService {

    List<FollowUpPatient> getDate(FollowUpPatient followUpPatient, String startDate, String endDate);

    String changeFollowState(Integer followId, Boolean followState);

    Map<String, List> getCalendarData();

    /**
     * 查询所有的随访计划
     * @return
     */
    List<SupFollowUp> findFollowUp();
}
