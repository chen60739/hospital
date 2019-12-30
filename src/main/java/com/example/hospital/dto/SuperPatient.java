package com.example.hospital.dto;

import com.example.hospital.model.Patient;
import com.example.hospital.model.PlanningGroup;

/**
 * @author 李海波
 * @date 2019/12/25
 */
public class SuperPatient extends Patient {
    private PlanningGroup planningGroups;
    public PlanningGroup getPlanningGroups() {
        return planningGroups;
    }

    public void setPlanningGroups(PlanningGroup planningGroups) {
        this.planningGroups = planningGroups;
    }



}
