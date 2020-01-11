package com.example.hospital.model;

import java.io.Serializable;

/**
 * @author 陈奕璇
 * @date 2019/12/24
 */
public class TemplateSet implements Serializable,Cloneable{
    /** 主键 */
    private Integer tempSetId ;
    /** 模板id */
    private Integer tempId ;
    /** 标签id */
    private Integer lableId ;
    /** 键值对-键 */
    private String templableKey ;
    /** 键值对-值 */
    private String templableValue ;

    public Integer getTempSetId() {
        return tempSetId;
    }

    public void setTempSetId(Integer tempSetId) {
        this.tempSetId = tempSetId;
    }

    public Integer getTempId() {
        return tempId;
    }

    public void setTempId(Integer tempId) {
        this.tempId = tempId;
    }

    public Integer getLableId() {
        return lableId;
    }

    public void setLableId(Integer lableId) {
        this.lableId = lableId;
    }

    public String getTemplableKey() {
        return templableKey;
    }

    public void setTemplableKey(String templableKey) {
        this.templableKey = templableKey;
    }

    public String getTemplableValue() {
        return templableValue;
    }

    public void setTemplableValue(String templableValue) {
        this.templableValue = templableValue;
    }

    @Override
    public String toString() {
        return "TemplateSet{" +
                "tempSetId=" + tempSetId +
                ", tempId=" + tempId +
                ", lableId=" + lableId +
                ", templableKey='" + templableKey + '\'' +
                ", templableValue='" + templableValue + '\'' +
                '}';
    }
}

