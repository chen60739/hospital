package com.example.hospital.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 陈奕璇
 * @date 2019/12/24
 */
public class OperativeInformation implements Serializable,Cloneable{
    /** 主键 */
    private Integer operativeId ;
    /** 患者id */
    private Integer patId ;
    /** 手术时间 */
    private Date operativeTime ;
    /** 手术术式 */
    private Integer operativeForm ;
    /** 手术操作者 */
    private Integer operator ;

    /** 主键 */
    public Integer getOperativeId(){
        return this.operativeId;
    }
    /** 主键 */
    public void setOperativeId(Integer operativeId){
        this.operativeId = operativeId;
    }
    /** 患者id */
    public Integer getPatId(){
        return this.patId;
    }
    /** 患者id */
    public void setPatId(Integer patId){
        this.patId = patId;
    }
    /** 手术时间 */
    public Date getOperativeTime(){
        return this.operativeTime;
    }
    /** 手术时间 */
    public void setOperativeTime(Date operativeTime){
        this.operativeTime = operativeTime;
    }
    /** 手术术式 */
    public Integer getOperativeForm(){
        return this.operativeForm;
    }
    /** 手术术式 */
    public void setOperativeForm(Integer operativeForm){
        this.operativeForm = operativeForm;
    }
    /** 手术操作者 */
    public Integer getOperator(){
        return this.operator;
    }
    /** 手术操作者 */
    public void setOperator(Integer operator){
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "OperativeInformation{" +
                "operativeId=" + operativeId +
                ", patId=" + patId +
                ", operativeTime=" + operativeTime +
                ", operativeForm=" + operativeForm +
                ", operator=" + operator +
                '}';
    }
}

