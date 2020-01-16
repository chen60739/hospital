package com.example.hospital.dto;

import com.example.hospital.model.Patient;
import com.example.hospital.model.PlanningGroup;

/**
 * @Author 陈云强
 * @data 2020/01/15
 */
public class SuperPatient extends Patient {

    /** 字典id */
    private Integer dictionaryId ;
    /** 字典名称 */
    private String dictionaryName ;

    private PlanningGroup planningGroups;

    public PlanningGroup getPlanningGroups() {
        return planningGroups;
    }

    public void setPlanningGroups(PlanningGroup planningGroups) {
        this.planningGroups = planningGroups;
    }

    public Integer getDictionaryId() {
        return dictionaryId;
    }

    public void setDictionaryId(Integer dictionaryId) {
        this.dictionaryId = dictionaryId;
    }

    public String getDictionaryName() {
        return dictionaryName;
    }

    public void setDictionaryName(String dictionaryName) {
        this.dictionaryName = dictionaryName;
    }

    @Override
    public String toString() {
        return "SuperPatient{" +
                "dictionaryId=" + dictionaryId +
                ", dictionaryName='" + dictionaryName + '\'' +
                '}';
    }
}
