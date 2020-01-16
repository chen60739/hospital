package com.example.hospital.service;
import com.example.hospital.dto.SuperPatient;
import com.example.hospital.model.Patient;
import org.apache.ibatis.annotations.Param;

import java.text.ParseException;
import java.util.List;

/**
 * @author 李海波
 * @date 2019/12/25
 */
public interface PatientService {

    List<SuperPatient> findPatients(SuperPatient superPatient, String preTime, String sufTime, int group1) throws ParseException;

    //批量删除
    int delById(String ids);

    void insert(Patient patient, Integer groupId);

    Patient selectById(Integer patientId);

    /**
     * 查询科室下的病人id
     * @param dId
     * @return
     */
    List<Patient> selectPatientByDepartment(Integer dId);

    /**
     * 查询user下的病人id
     * @return
     */
    List<Patient> selectPatientByUser(Integer leadOff);

    /**
     * 根据疾病编码查询病人id
     * @param code1
     * @param code2
     * @return
     */
    List<Patient> selectPatientByDiseaseCode(String code1,String code2);

    /**
     * 根据疾病名称查询病人id
     * @param diseaseName
     * @return
     */
    List<Patient> selectPatientByDiseaseName(String diseaseName);


}
