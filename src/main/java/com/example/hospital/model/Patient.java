package com.example.hospital.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 陈奕璇
 * @date 2019/12/24
 */
public class  Patient implements Serializable,Cloneable{
    /** 患者id */
    private Integer patientId ;
    /** 姓名 */
    private String patientName ;
    /** 性别 */
    private Integer patientSex ;
    /** 出生日期 */
    @JsonFormat(pattern="yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date patientBirthday ;
    /** 民族0其他1汉族 */
    private Integer nationId ;
    /** 门诊号 */
    private String outpatientService ;
    /** 住院号 */
    private String hospitalizationNumber ;
    /** 疾病名称 */
    private String diseaseName ;
    /** 疾病编码集 */
    private String disease ;
    /** 临床结果集 */
    private String resultLevel ;
    /** 是否删除 */
    private Boolean isDel ;

    /** 负责人*/
    private Integer leadOff;
    /** 科室ID */
    private Integer departmentId ;

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getLeadOff() {
        return leadOff;
    }

    public void setLeadOff(Integer leadOff) {
        this.leadOff = leadOff;
    }

    /** 患者id */
    public Integer getPatientId(){
        return this.patientId;
    }
    /** 患者id */
    public void setPatientId(Integer patientId){
        this.patientId = patientId;
    }
    /** 姓名 */
    public String getPatientName(){
        return this.patientName;
    }
    /** 姓名 */
    public void setPatientName(String patientName){
        this.patientName = patientName==""?null:patientName;
    }
    /** 性别 */
    public Integer getPatientSex() { return patientSex; }
    /** 性别 */
    public void setPatientSex(Integer patientSex) { this.patientSex = patientSex; }
    /** 出生日期 */
    public Date getPatientBirthday(){
        return this.patientBirthday;
    }
    /** 出生日期 */
    public void setPatientBirthday(Date patientBirthday){
        this.patientBirthday = patientBirthday;
    }
    /** 民族0其他1汉族 */
    public Integer getNationId(){
        return this.nationId;
    }
    /** 民族0其他1汉族 */
    public void setNationId(Integer nationId){
        this.nationId = nationId;
    }
    /** 门诊号 */
    public String getOutpatientService() {
        return outpatientService;
    }
    /** 门诊号 */
    public void setOutpatientService(String outpatientService) {
        this.outpatientService = outpatientService == "" ? null : outpatientService;
    }
    /** 住院号 */
    public String getHospitalizationNumber() {
        return hospitalizationNumber;
    }
    /** 住院号 */
    public void setHospitalizationNumber(String hospitalizationNumber) {
        this.hospitalizationNumber = hospitalizationNumber == "" ? null : hospitalizationNumber;
    }
    /** 疾病名称 */
    public String getDiseaseName(){
        return this.diseaseName;
    }
    /** 疾病名称 */
    public void setDiseaseName(String diseaseName){
        this.diseaseName = diseaseName;
    }
    /** 疾病编码集 */
    public String getDisease(){
        return this.disease;
    }
    /** 疾病编码集 */
    public void setDisease(String disease){
        this.disease = disease;
    }
    /** 临床结果集 */
    public String getResultLevel(){
        return this.resultLevel;
    }
    /** 临床结果集 */
    public void setResultLevel(String resultLevel){
        this.resultLevel = resultLevel;
    }
    /** 是否删除 */
    public Boolean getIsDel(){
        return this.isDel;
    }
    /** 是否删除 */
    public void setIsDel(Boolean isDel){
        this.isDel = isDel;
    }
    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", patientName='" + patientName + '\'' +
                ", patientSex=" + patientSex +
                ", patientBirthday=" + patientBirthday +
                ", nationId=" + nationId +
                ", outpatientService='" + outpatientService + '\'' +
                ", hospitalizationNumber='" + hospitalizationNumber + '\'' +
                ", diseaseName='" + diseaseName + '\'' +
                ", disease='" + disease + '\'' +
                ", resultLevel='" + resultLevel + '\'' +
                ", isDel=" + isDel +
                '}';
    }
}

