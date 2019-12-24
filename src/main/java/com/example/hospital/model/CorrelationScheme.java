package com.example.hospital.model;

import java.io.Serializable;

/**
 * @author 陈奕璇
 * @date 2019/12/24
 */
public class CorrelationScheme implements Serializable,Cloneable{
    /** 主键 */
    private Integer csId ;
    /** 方案id */
    private Integer programmeId ;
    /** 患者id */
    private Integer patId ;

    /** 主键 */
    public Integer getCsId(){
        return this.csId;
    }
    /** 主键 */
    public void setCsId(Integer csId){
        this.csId = csId;
    }
    /** 方案id */
    public Integer getProgrammeId(){
        return this.programmeId;
    }
    /** 方案id */
    public void setProgrammeId(Integer programmeId){
        this.programmeId = programmeId;
    }
    /** 患者id */
    public Integer getPatId(){
        return this.patId;
    }
    /** 患者id */
    public void setPatId(Integer patId){
        this.patId = patId;
    }

    @Override
    public String toString() {
        return "CorrelationScheme{" +
                "csId=" + csId +
                ", programmeId=" + programmeId +
                ", patId=" + patId +
                '}';
    }
}

