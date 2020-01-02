package com.example.hospital.dto;

import com.example.hospital.model.Checked;
import com.example.hospital.model.Medication;
import com.example.hospital.model.Programme;
import com.example.hospital.model.Test;

import java.util.List;

/**
 * @Author 周津锐
 * @date 2019/12/25
 */
public class SuperProgramme extends Programme {
    private List<Medication> medicationList;

    private List<Test> testList;

    private List<Checked> checkedList;

    public List<Medication> getMedicationList() {
        return medicationList;
    }

    public void setMedicationList(List<Medication> medicationList) {
        this.medicationList = medicationList;
    }

    public List<Test> getTestList() {
        return testList;
    }

    public void setTestList(List<Test> testList) {
        this.testList = testList;
    }

    public List<Checked> getCheckedList() {
        return checkedList;
    }

    public void setCheckedList(List<Checked> checkedList) {
        this.checkedList = checkedList;
    }

    @Override
    public String toString() {
        return "SuperProgramme{" +
                "medicationList=" + medicationList +
                ", testList=" + testList +
                ", checkedList=" + checkedList +
                '}';
    }
}
