package com.example.hospital.dto;

import com.example.hospital.model.FollowUp;

/**
 * @author 陈奕璇
 * @date 2019/12/30
 */
public class CalendarFollowUp extends FollowUp {
    /** 患者姓名 */
    private String patientName ;

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    @Override
    public String toString() {
        return "CalendarFollowUp{" +
                "patientName='" + patientName + '\'' +
                '}';
    }
}
