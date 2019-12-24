package com.example.hospital.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 陈奕璇
 * @date 2019/12/24
 */
public class Reviewers implements Serializable,Cloneable{
    /** 主键 */
    private Integer checkedId ;
    /** 质疑者 id */
    private Integer doubtersId ;
    /** 复核者id */
    private Integer reviewerId ;
    /** 复核时间 */
    private Date reviewerTime ;
    /** 数据项id */
    private Integer dataItem ;
    /** 数据项的值 */
    private String dataValue ;
    /** 提出时间 */
    private Date reviewerProposeTime ;

    /** 主键 */
    public Integer getCheckedId(){
        return this.checkedId;
    }
    /** 主键 */
    public void setCheckedId(Integer checkedId){
        this.checkedId = checkedId;
    }
    /** 质疑者 id */
    public Integer getDoubtersId(){
        return this.doubtersId;
    }
    /** 质疑者 id */
    public void setDoubtersId(Integer doubtersId){
        this.doubtersId = doubtersId;
    }
    /** 复核者id */
    public Integer getReviewerId(){
        return this.reviewerId;
    }
    /** 复核者id */
    public void setReviewerId(Integer reviewerId){
        this.reviewerId = reviewerId;
    }
    /** 复核时间 */
    public Date getReviewerTime(){
        return this.reviewerTime;
    }
    /** 复核时间 */
    public void setReviewerTime(Date reviewerTime){
        this.reviewerTime = reviewerTime;
    }
    /** 数据项id */
    public Integer getDataItem(){
        return this.dataItem;
    }
    /** 数据项id */
    public void setDataItem(Integer dataItem){
        this.dataItem = dataItem;
    }
    /** 数据项的值 */
    public String getDataValue(){
        return this.dataValue;
    }
    /** 数据项的值 */
    public void setDataValue(String dataValue){
        this.dataValue = dataValue;
    }
    /** 提出时间 */
    public Date getReviewerProposeTime(){
        return this.reviewerProposeTime;
    }
    /** 提出时间 */
    public void setReviewerProposeTime(Date reviewerProposeTime){
        this.reviewerProposeTime = reviewerProposeTime;
    }

    @Override
    public String toString() {
        return "Reviewers{" +
                "checkedId=" + checkedId +
                ", doubtersId=" + doubtersId +
                ", reviewerId=" + reviewerId +
                ", reviewerTime=" + reviewerTime +
                ", dataItem=" + dataItem +
                ", dataValue='" + dataValue + '\'' +
                ", reviewerProposeTime=" + reviewerProposeTime +
                '}';
    }
}
