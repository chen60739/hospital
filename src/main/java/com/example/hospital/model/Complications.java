package com.example.hospital.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 陈奕璇
 * @date 2019/12/24
 */
public class Complications implements Serializable,Cloneable{
    /** 主键 */
    private Integer complicationsId ;
    /** 患者id */
    private Integer patId ;
    /** 并发症名称 */
    private Integer complicationsNameId ;
    /** 看病时间 */
    private Date visitingTime ;
    /** 用户id  (职业医生) */
    private Integer visitingDoctor ;

    /** 主键 */
    public Integer getComplicationsId(){
        return this.complicationsId;
    }
    /** 主键 */
    public void setComplicationsId(Integer complicationsId){
        this.complicationsId = complicationsId;
    }
    /** 患者id */
    public Integer getPatId(){
        return this.patId;
    }
    /** 患者id */
    public void setPatId(Integer patId){
        this.patId = patId;
    }
    /** 并发症名称 */
    public Integer getComplicationsNameId(){
        return this.complicationsNameId;
    }
    /** 并发症名称 */
    public void setComplicationsNameId(Integer complicationsNameId){
        this.complicationsNameId = complicationsNameId;
    }
    /** 看病时间 */
    public Date getVisitingTime(){
        return this.visitingTime;
    }
    /** 看病时间 */
    public void setVisitingTime(Date visitingTime){
        this.visitingTime = visitingTime;
    }
    /** 用户id  (职业医生) */
    public Integer getVisitingDoctor(){
        return this.visitingDoctor;
    }
    /** 用户id  (职业医生) */
    public void setVisitingDoctor(Integer visitingDoctor){
        this.visitingDoctor = visitingDoctor;
    }

    @Override
    public String toString() {
        return "Complications{" +
                "complicationsId=" + complicationsId +
                ", patId=" + patId +
                ", complicationsNameId=" + complicationsNameId +
                ", visitingTime=" + visitingTime +
                ", visitingDoctor=" + visitingDoctor +
                '}';
    }
}

