package com.example.hospital.controller;

import com.example.hospital.dto.SuperProgramme;
import com.example.hospital.model.*;
import com.example.hospital.service.QueryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.rmi.ServerError;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author 周津锐
 * @date 2019/12/24
 */
@Controller
public class QueryController {
    @Resource
    QueryService queryService;

    @RequestMapping("/findPlan")
    @ResponseBody
    public List<Dictionary> findPlan(){
        List<Dictionary> plans = queryService.findProgramme();
        return plans;
    }

    @RequestMapping("/findAllProgramme")
    @ResponseBody
    public List<SuperProgramme> findAllProgramme(Integer departmentId){
       List<SuperProgramme> programmeList = queryService.findProgrammeByDepartment(departmentId);
        for (int i = 0; i <programmeList.size() ; i++) {
            List<Medication> medicationList = queryService.findMedication(programmeList.get(i).getProgrammeId());
            List<Test> testList = queryService.findTest(programmeList.get(i).getProgrammeId());
            List<Checked> checkedList = queryService.findChecked(programmeList.get(i).getProgrammeId());
            if(medicationList!=null){ programmeList.get(i).setMedicationList(medicationList); }
            if(testList!=null){  programmeList.get(i).setTestList(testList); }
            if(checkedList!=null){ programmeList.get(i).setCheckedList(checkedList); }
        }
        return programmeList;
    }

    @RequestMapping("/savePlan")
    public String savePlan(Programme Programme, Integer[] medicationDictionaryId,
                           Integer[] testDictionaryId,Integer [] checkedDictionaryId){
        Integer pid = Programme.getProgrammeId();
        Medication m = new Medication();
        Checked c = new Checked();
        Test t =new Test();
        if(!"".equals(pid) && pid!=null){
           //Programme p= queryService.getByProgrammeName(Programme.getProgrammeName());
               // String pName=p.getProgrammeName();
                //pName.substring(pName.lastIndexOf("(")+1,pName.lastIndexOf(")"));
                //Programme.setProgrammeName();
            queryService.changeProgramme(Programme);
            queryService.removeMedication(pid);
            for (Integer integer : medicationDictionaryId) {
                m.setMedicationId(pid);
                m.setMedicationDictionaryId(integer);
                queryService.addMedication(m);
            }
            queryService.removeTest(pid);
            for (Integer integer : testDictionaryId) {
                t.setTestId(pid);
                t.setTestDictionaryId(integer);
                queryService.addTest(t);
            }
            queryService.removeChecked(pid);
            for (Integer integer : checkedDictionaryId) {
                c.setCheckedId(pid);
                c.setCheckedDictionaryId(integer);
                queryService.addChecked(c);
            }
        }else{
            queryService.addProgramme(Programme);
            for (Integer integer : medicationDictionaryId) {
                m.setMedicationId(Programme.getProgrammeId());
                m.setMedicationDictionaryId(integer);
                queryService.addMedication(m);
            }
            for (Integer integer : testDictionaryId) {
                t.setTestId(Programme.getProgrammeId());
                t.setTestDictionaryId(integer);
                queryService.addTest(t);
            }
            for (Integer integer : checkedDictionaryId) {
                c.setCheckedId(Programme.getProgrammeId());
                c.setCheckedDictionaryId(integer);
                queryService.addChecked(c);
            }
        }
        return "diagnosis_and_treatment_plan";
    }
}
