package com.example.hospital.service.impl;

import com.example.hospital.dao.FollowUpMapper;
import com.example.hospital.dao.PatientMapper;
import com.example.hospital.dto.CalendarFollowUp;
import com.example.hospital.dto.FollowUpPatient;
import com.example.hospital.service.FollowUpManagementService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author 陈奕璇
 * @date 2019/12/28
 */
@Service
public class FollowUpManagementServiceImpl implements FollowUpManagementService {

    @Resource
    private PatientMapper patientMapper;
    @Resource
    private FollowUpMapper followUpMapper;

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

    @Override
    public Map<String, List> getCalendarData() {
        List<CalendarFollowUp> list = followUpMapper.calendarData();
        List<Date> dates = followUpMapper.getDistinctFollowTime();
        List<String> time = new ArrayList<>();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        for (Date date : dates) {
            String s = format.format(date);
            time.add(s);
        }
        Map<String,List> data = new HashMap<>();
        data.put("list",list);
        data.put("time",time);
        return data;
    }

    @Override
    public String changeFollowState(Integer followId, Boolean followState) {
        int i = followUpMapper.changeFollowState(followId,followState);
        if (i==1){
            return "修改成功";
        }
        return "修改失败";
    }
}
