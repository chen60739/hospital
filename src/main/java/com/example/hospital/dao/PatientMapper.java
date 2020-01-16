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

    /**
     * 查询科室下病人id
     * @param dId
     * @return
     */
    List<Patient> selectPatientByDepartment(@Param("dId")Integer dId);

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
    List<Patient> selectPatientByDiseaseCode(@Param("code1") String code1,@Param("code2")String code2);

    /**
     * 根据疾病名称查询病人id
     * @param diseaseName
     * @return
     */
    List<Patient> selectPatientByDiseaseName(@Param("diseaseName")String diseaseName);


}