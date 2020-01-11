package com.example.hospital.controller;

import com.example.hospital.model.Patient;
import com.example.hospital.model.PlanningGroup;
import com.example.hospital.service.PatientService;
import com.example.hospital.service.PlanningGroupService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author 陈云强
 * @data 2020-01-17
 */

@Controller
public class PlanningGroupController {


    @Resource
    private PatientService patientService;

    @Resource
    private PlanningGroupService planningGroupService;

    @RequestMapping("/insertGroup")
    public String insertGroup(PlanningGroup planningGroup,Integer dId){
        System.out.println("科室的id="+dId);
        List<Patient> patients=patientService.selectPatientByDepartment(dId);
        for(int i=0;i<patients.size();i++){
            System.out.println("病人id="+ patients.get(i).getPatientId());
            planningGroup.setPPatientId(patients.get(i).getPatientId());
            planningGroup.setPGroupId(dId);
            planningGroupService.insert(planningGroup);
        }

        return "redirect:intoGroup";
    }

}
