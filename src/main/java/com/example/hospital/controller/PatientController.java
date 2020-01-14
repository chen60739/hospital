package com.example.hospital.controller;


import com.example.hospital.dto.SuperPatient;
import com.example.hospital.model.Patient;
import com.example.hospital.service.PatientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author 李海波
 * @date 2019/12/25
 */
@Controller
public class PatientController {
    @Resource
    private PatientService patientService;



    @RequestMapping("/findPatients")
    @ResponseBody
    public List<SuperPatient> findPatients(SuperPatient superPatient,String preTime,String sufTime,Integer groupId) throws ParseException {
        List<SuperPatient> list=patientService.findPatients(superPatient,preTime,sufTime,groupId);
        return list;
    }
    //患者批量删除
    @RequestMapping("/delById")
    @ResponseBody
    public String  removeById(String ids){
        String substring = ids.substring(0, ids.length() - 1);
        String[] split = substring.split(",");
        try{
            for (int i=0;i<split.length;i++){
                patientService.delById(split[i]);
            }
            return "success";
        }catch (NumberFormatException e){
            e.printStackTrace();
            return "error";
        }

    }

    /**
     * 添加新的患者
     * @param outpatientService2
     * @param pName
     * @param Number
     * @param birthday
     * @param sex
     * @param groupId
     * @param model
     * @return
     * @throws ParseException
     */
    @RequestMapping("/patientAdd")
    public  String patientAdd(String outpatientService2, String pName, String Number, String birthday,Integer sex, Integer groupId, Model model) throws ParseException {
            System.out.println("进入患者添加方法中");
            Patient patient=new Patient();
            patient.setPatientName(pName);
            patient.setOutpatientService(outpatientService2);
            patient.setHospitalizationNumber(Number);
            patient.setPatientSex(sex);
            patient.setIsDel(false);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date patientBirthday = sdf.parse(birthday);
        patient.setPatientBirthday(patientBirthday);
        patientService.insert(patient,groupId);
        model.addAttribute("groupId",groupId);
        return "group_one";
    }

    @RequestMapping("/patient")
    public String patient(@RequestParam("patientId") Integer patientId,
                          @RequestParam("groupId") Integer groupId,
                          Model model){
        Patient p = patientService.selectById(patientId);
        model.addAttribute("patient",p);
        model.addAttribute("groupId",groupId);
        return "patient";
    }
}
