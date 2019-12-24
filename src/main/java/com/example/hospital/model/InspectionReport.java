package com.example.hospital.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 陈奕璇
 * @date 2019/12/24
 */
public class InspectionReport implements Serializable,Cloneable{
    /** 主键 */
    private Integer inspectionId ;
    /** 患者id */
    private Integer patId ;
    /** 检查内容 */
    private String inspectionContent ;
    /** 检查时间 */
    private Date inspectionTime ;
    /** 检查人id */
    private Integer examiner ;

    /** 主键 */
    public Integer getInspectionId(){
        return this.inspectionId;
    }
    /** 主键 */
    public void setInspectionId(Integer inspectionId){
        this.inspectionId = inspectionId;
    }
    /** 患者id */
    public Integer getPatId(){
        return this.patId;
    }
    /** 患者id */
    public void setPatId(Integer patId){
        this.patId = patId;
    }
    /** 检查内容 */
    public String getInspectionContent(){
        return this.inspectionContent;
    }
    /** 检查内容 */
    public void setInspectionContent(String inspectionContent){
        this.inspectionContent = inspectionContent;
    }
    /** 检查时间 */
    public Date getInspectionTime(){
        return this.inspectionTime;
    }
    /** 检查时间 */
    public void setInspectionTime(Date inspectionTime){
        this.inspectionTime = inspectionTime;
    }
    /** 检查人id */
    public Integer getExaminer(){
        return this.examiner;
    }
    /** 检查人id */
    public void setExaminer(Integer examiner){
        this.examiner = examiner;
    }

    @Override
    public String toString() {
        return "InspectionReport{" +
                "inspectionId=" + inspectionId +
                ", patId=" + patId +
                ", inspectionContent='" + inspectionContent + '\'' +
                ", inspectionTime=" + inspectionTime +
                ", examiner=" + examiner +
                '}';
    }
}

