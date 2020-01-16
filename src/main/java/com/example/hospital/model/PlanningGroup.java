package com.example.hospital.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 陈奕璇
 * @date 2019/12/24
 */
public class PlanningGroup implements Serializable,Cloneable{
    /** 主键 */
    private Integer planningId ;
    /** 小组id */
    private Integer pGroupId ;
    /** 患者id */
    private Integer pPatientId ;
    /** 入组时间 */
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date inGroupTime ;

    /** 主键 */
    public Integer getPlanningId(){
        return this.planningId;
    }
    /** 主键 */
    public void setPlanningId(Integer planningId){
        this.planningId = planningId;
    }
    /** 小组id */
    public Integer getPGroupId(){
        return this.pGroupId;
    }
    /** 小组id */
    public void setPGroupId(Integer pGroupId){
        this.pGroupId = pGroupId;
    }
    /** 患者id */
    public Integer getPPatientId(){
        return this.pPatientId;
    }
    /** 患者id */
    public void setPPatientId(Integer pPatientId){
        this.pPatientId = pPatientId;
    }
    /** 入组时间 */
    public Date getInGroupTime(){
        return this.inGroupTime;
    }
    /** 入组时间 */
    public void setInGroupTime(Date inGroupTime){
        this.inGroupTime = inGroupTime;
    }

    @Override
    public String toString() {
        return "PlanningGroup{" +
                "planningId=" + planningId +
                ", pGroupId=" + pGroupId +
                ", pPatientId=" + pPatientId +
                ", inGroupTime=" + inGroupTime +
                '}';
    }
}

