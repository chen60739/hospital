package com.example.hospital.service.impl;

import com.example.hospital.dao.PatientMapper;
import com.example.hospital.dto.FollowUpPatient;
import com.example.hospital.service.FollowUpManagementService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 陈奕璇
 * @date 2019/12/28
 */
@Service
public class FollowUpManagementServiceImpl implements FollowUpManagementService {

    @Resource
    private PatientMapper patientMapper;

    @Override
    public List<FollowUpPatient> getDate(FollowUpPatient followUpPatient, String startDate, String endDate) {
        List<FollowUpPatient> followUpPatients = patientMapper.followUpManagementData(followUpPatient,startDate,endDate);
        for (FollowUpPatient patient:followUpPatients) {
            String hospitalizationNumber = patient.getHospitalizationNumber();
            //对门诊号和住院号进行拼接
            if(hospitalizationNumber!=null){
                String outpatientService = patient.getOutpatientService()+"/"+hospitalizationNumber;
                patient.setOutpatientService(outpatientService);
            }
        }
        return followUpPatients;
    }
}
