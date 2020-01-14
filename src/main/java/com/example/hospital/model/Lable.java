package com.example.hospital.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

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
    /** 标签创建时间 */
    @JsonFormat(pattern="yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date lableCreateTime ;
    /** 标签创建人id */
    private Integer lableCreateUserId ;
    /** 标签审批状态0：未审批，1：已审批 */
    private Boolean checkState ;
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

    public Date getLableCreateTime() {
        return lableCreateTime;
    }

    public void setLableCreateTime(Date lableCreateTime) {
        this.lableCreateTime = lableCreateTime;
    }

    public Integer getLableCreateUserId() {
        return lableCreateUserId;
    }

    public void setLableCreateUserId(Integer lableCreateUserId) {
        this.lableCreateUserId = lableCreateUserId;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public Boolean getCheckState() {
        return checkState;
    }

    public void setCheckState(Boolean checkState) {
        this.checkState = checkState;
    }

    @Override
    public String toString() {
        return "Lable{" +
                "lableId=" + lableId +
                ", lableName='" + lableName + '\'' +
                ", lableType='" + lableType + '\'' +
                ", lableUpperId=" + lableUpperId +
                ", lableCreateTime=" + lableCreateTime +
                ", lableCreateUserId=" + lableCreateUserId +
                ", checkState=" + checkState +
                ", conditions='" + conditions + '\'' +
                '}';
    }
}

