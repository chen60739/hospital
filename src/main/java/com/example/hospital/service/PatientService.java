package com.example.hospital.service;
import com.example.hospital.dto.SuperPatient;

import java.text.ParseException;
import java.util.List;

/**
 * @author 李海波
 * @date 2019/12/25
 */
public interface PatientService {

    List<SuperPatient> findPatients(SuperPatient superPatient, String preTime, String sufTime, int group1) throws ParseException;
}