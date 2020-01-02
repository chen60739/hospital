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
    /** 标签父级id */
    private Integer lableUpperId ;
    /** 限制条件  正在建设中 */
    private String conditions ;


    public Integer getLableId() {
        return lableId;
    }

    public void setLableId(Integer lableId) {
        this.lableId = lableId;
    }

    public String getLableName() {
        return lableName;
    }

    public void setLableName(String lableName) {
        this.lableName = lableName;
    }

    public String getLableType() {
        return lableType;
    }

    public void setLableType(String lableType) {
        this.lableType = lableType;
    }

    public Integer getLableUpperId() {
        return lableUpperId;
    }

    public void setLableUpperId(Integer lableUpperId) {
        this.lableUpperId = lableUpperId;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    @Override
    public String toString() {
        return "Lable{" +
                "lableId=" + lableId +
                ", lableName='" + lableName + '\'' +
                ", lableType='" + lableType + '\'' +
                ", lableUpperId=" + lableUpperId +
                ", conditions='" + conditions + '\'' +
                '}';
    }
}

