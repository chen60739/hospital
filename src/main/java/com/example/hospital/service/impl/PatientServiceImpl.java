package com.example.hospital.service.impl;


import com.example.hospital.dao.PatientMapper;
import com.example.hospital.dto.SuperPatient;
import com.example.hospital.model.Patient;
import com.example.hospital.service.PatientService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.List;


/**
 * @author 李海波
 * @date 2019/12/25
 */
@Service
public class PatientServiceImpl implements PatientService {
    @Resource
   private PatientMapper patientMapper;
    @Override
    public List<SuperPatient> findPatients(SuperPatient superPatient, String preTime, String sufTime, int group1) throws ParseException {
        String time1=null;
        String time2=null;
        if( !"".equals(preTime)&& "".equals(sufTime)){
             time1 = preTime;
        }else if("".equals(preTime) &&!"".equals(sufTime)){
             time2 = sufTime;
        }else if(!"".equals(sufTime) && !"".equals(preTime)){
            time1 = preTime;
            time2 = sufTime;
        }
        List<SuperPatient> list=patientMapper.selectPatientsByGroupId(group1,superPatient,time1,time2);
        for (SuperPatient l:list) {
            String hospitalizationNumber = l.getHospitalizationNumber();
           //对门诊号和住院号进行拼接
            if(hospitalizationNumber!=null){
                String outpatientService = l.getOutpatientService()+"/"+hospitalizationNumber;
                l.setOutpatientService(outpatientService);
            }
        }
        return list;
    }

    @Override
    public int delById(String ids) {
        return patientMapper.deleteById(ids);
    }

    @Override
    public Patient selectById(Integer patientId) {
        Patient patient = patientMapper.selectByPrimaryKey(patientId);
        return patient;
    }

    @Override
    public void insert(Patient patient) {
        patientMapper.insert(patient);
    }

    /**
     * 查询科室下病人的id
     * @param dId
     * @return
     */
    @Override
    public List<Patient> selectPatientByDepartment(Integer dId) {
        return patientMapper.selectPatientByDepartment(dId);
    }

    /**
     * 查询user下的病人·
     * @param leadOff
     * @return
     */
    @Override
    public List<Patient> selectPatientByUser(Integer leadOff) {
        return patientMapper.selectPatientByUser(leadOff);
    }

    /**
     * 根据疾病编码查询病人id
     * @param code1
     * @param code2
     * @return
     */
    @Override
    public List<Patient> selectPatientByDiseaseCode(String code1, String code2) {
        return patientMapper.selectPatientByDiseaseCode(code1,code2);
    }

    /**
     * 根据疾病名称查询病人id
     * @param diseaseName
     * @return
     */
    @Override
    public List<Patient> selectPatientByDiseaseName(String diseaseName) {
        return patientMapper.selectPatientByDiseaseName(diseaseName);
    }


}
