package com.example.hospital.model;

import java.io.Serializable;

/**
 * @author 陈奕璇
 * @date 2019/12/24
 */
public class Lable implements Serializable,Cloneable{
    /** 标签id */
    private Integer lableId ;
    /** 标签名字 */
    private String lableName ;
    /** 标签属性 */
    private String lableType ;
    /** 限制条件  正在建设中 */
    private String conditions ;

    /** 标签id */
    public Integer getLableId(){
        return this.lableId;
    }
    /** 标签id */
    public void setLableId(Integer lableId){
        this.lableId = lableId;
    }
    /** 标签名字 */
    public String getLableName(){
        return this.lableName;
    }
    /** 标签名字 */
    public void setLableName(String lableName){
        this.lableName = lableName;
    }
    /** 标签属性 */
    public String getLableType(){
        return this.lableType;
    }
    /** 标签属性 */
    public void setLableType(String lableType){
        this.lableType = lableType;
    }
    /** 限制条件  正在建设中 */
    public String getConditions(){
        return this.conditions;
    }
    /** 限制条件  正在建设中 */
    public void setConditions(String conditions){
        this.conditions = conditions;
    }

    @Override
    public String toString() {
        return "Lable{" +
                "lableId=" + lableId +
                ", lableName='" + lableName + '\'' +
                ", lableType='" + lableType + '\'' +
                ", conditions='" + conditions + '\'' +
                '}';
    }
}

