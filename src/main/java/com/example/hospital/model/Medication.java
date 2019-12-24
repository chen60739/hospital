package com.example.hospital.model;

import java.io.Serializable;

/**
 * @author 陈奕璇
 * @date 2019/12/24
 */
public class Medication implements Serializable,Cloneable{
    /** 主键 */
    private Integer mId ;
    /** 用药 */
    private Integer medicationId ;
    /** 字典用药id */
    private Integer medicationDictionaryId ;

    /** 主键 */
    public Integer getMId(){
        return this.mId;
    }
    /** 主键 */
    public void setMId(Integer mId){
        this.mId = mId;
    }
    /** 用药 */
    public Integer getMedicationId(){
        return this.medicationId;
    }
    /** 用药 */
    public void setMedicationId(Integer medicationId){
        this.medicationId = medicationId;
    }
    /** 字典用药id */
    public Integer getMedicationDictionaryId(){
        return this.medicationDictionaryId;
    }
    /** 字典用药id */
    public void setMedicationDictionaryId(Integer medicationDictionaryId){
        this.medicationDictionaryId = medicationDictionaryId;
    }

    @Override
    public String toString() {
        return "Medication{" +
                "mId=" + mId +
                ", medicationId=" + medicationId +
                ", medicationDictionaryId=" + medicationDictionaryId +
                '}';
    }
}

