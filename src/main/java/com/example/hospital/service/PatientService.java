package com.example.hospital.service;
import com.example.hospital.dto.SuperPatient;
import com.example.hospital.model.Patient;

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

    void insert(Patient patient);

    List<Patient> selectPatientByDepartment(Integer dId);

    Patient selectById(Integer patientId);
}
