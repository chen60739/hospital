package com.example.hospital.controller;


import com.example.hospital.dto.SuperPatient;
import com.example.hospital.service.PatientService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.ParseException;
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
        System.out.println("=性别");
        List<SuperPatient> list=patientService.findPatients(superPatient,preTime,sufTime,groupId);
        return list;
    }
}
