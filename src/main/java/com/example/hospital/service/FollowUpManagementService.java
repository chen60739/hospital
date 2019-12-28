package com.example.hospital.service;

import com.example.hospital.dto.FollowUpPatient;

import java.util.List;

/**
 * @author 陈奕璇
 * @date 2019/12/28
 */
public interface FollowUpManagementService {

    List<FollowUpPatient> getDate(FollowUpPatient followUpPatient, String startDate, String endDate);
}
