package com.example.hospital.dao;

import com.example.hospital.dto.FollowUpPatient;
import com.example.hospital.dto.SuperPatient;
import com.example.hospital.model.Patient;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PatientMapper {
    int deleteByPrimaryKey(Integer patientId);

    int insert(Patient record);

    int insertSelective(Patient record);

    Patient selectByPrimaryKey(Integer patientId);

    int updateByPrimaryKeySelective(Patient record);

    int updateByPrimaryKey(Patient record);

    List selectPatientsByGroupId(@Param("group1") int group1, @Param("superPatient") SuperPatient superPatient, @Param("time1") String time1, @Param("time2") String time2);

    /**
     * 随访进度管理页面查询语句
     * @return 随访管理对象
     * @param followUpPatient
     * @param startDate
     * @param endDate
     */
    List<FollowUpPatient> followUpManagementData(@Param("followUpPatient")FollowUpPatient followUpPatient,
                                                 @Param("startDate") String startDate,
                                                 @Param("endDate") String endDate);

    int deleteById(@Param("ids")  String ids);

    List<Patient> selectPatient(@Param("dId")Integer dId);
}