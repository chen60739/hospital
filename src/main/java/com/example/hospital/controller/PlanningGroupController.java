package com.example.hospital.controller;

import com.example.hospital.model.Dictionary;
import com.example.hospital.model.Patient;
import com.example.hospital.model.PlanningGroup;
import com.example.hospital.service.DictionaryService;
import com.example.hospital.service.PatientService;
import com.example.hospital.service.PlanningGroupService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.xml.ws.RequestWrapper;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

    @Resource
    private DictionaryService dictionaryService;

    @RequestMapping("/insertGroup")
    public String insertGroup(PlanningGroup planningGroup, Integer departmentId, Integer doctorId,
                              Integer nurseId, Integer apothecaryId, Integer artificerId, String inGroupTime,
                              String code1,String code2,Integer groupId,String diseaseName) throws ParseException {

        System.out.println(groupId+" "+doctorId+" "+nurseId+" "+apothecaryId+" "+artificerId+" "+inGroupTime+" "+code1+" "+code2+" "+diseaseName);

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date time=sdf.parse(inGroupTime);

        if(departmentId!=null) {
            System.out.println("科室的id="+departmentId);
            List<Patient> patients=patientService.selectPatientByDepartment(departmentId);//根据科室入组
            for (int i = 0; i < patients.size(); i++) {
                System.out.println("病人id=" + patients.get(i).getPatientId());
                planningGroup.setPPatientId(patients.get(i).getPatientId());
                planningGroup.setPGroupId(groupId);
                planningGroup.setInGroupTime(time);
                planningGroupService.insert(planningGroup);
            }
        }

        if(code1!=null&&code2!=null){
            System.out.println("开始编码="+code1+" "+"结束编码="+code2);
            List<Patient> diseaseCode=patientService.selectPatientByDiseaseCode(code1,code2);
            for (Patient p:diseaseCode) {
                planningGroup.setPPatientId(p.getPatientId());
                planningGroup.setPGroupId(groupId);
                planningGroup.setInGroupTime(time);
                planningGroupService.insert(planningGroup);
            }
        }

        if(diseaseName!=null){
            System.out.println("疾病名称="+diseaseName);
            List<Patient> name= patientService.selectPatientByDiseaseName(diseaseName);
            for (Patient p:name) {
                planningGroup.setPPatientId(p.getPatientId());
                planningGroup.setPGroupId(groupId);
                planningGroup.setInGroupTime(time);
                planningGroupService.insert(planningGroup);
            }

        }

        if(doctorId!=null){
            System.out.println("医生的id="+doctorId);
            byUser(planningGroup, doctorId,groupId,time);

        }

        if(nurseId!=null){
            System.out.println("护士的id="+nurseId);
            byUser(planningGroup, nurseId,groupId,time);

        }

        if(apothecaryId!=null){
            System.out.println("药师的id="+apothecaryId);
            byUser(planningGroup, apothecaryId,groupId,time);

        }

        if(artificerId!=null){
            System.out.println("技师的id="+artificerId);
            byUser(planningGroup, artificerId,groupId,time);

        }

        return "redirect:intoGroup";
    }

    /**
     * 用户表的用户包括医生，护士，药师，技师
     *
     * @param planningGroup
     * @param userId
     */
    private void byUser(PlanningGroup planningGroup, Integer userId, Integer groupId,
                        Date time) {
        List<Patient> apothecary= patientService.selectPatientByUser(userId);


        System.out.println(userId);
        for (Patient p:apothecary) {
            System.out.println("病人id=" + p.getPatientId());
            planningGroup.setPPatientId(p.getPatientId());
            planningGroup.setPGroupId(groupId);
            planningGroup.setInGroupTime(time);
            planningGroupService.insert(planningGroup);
        }
    }

    /**
     * 查询疾病编码和疾病回显
     * @return
     */
    @ResponseBody
    @RequestMapping("/getDisease")
    public List<Dictionary> getDisease(){
        List<Dictionary> disease= dictionaryService.getDisease();
        return disease;
    }

}
