package com.example.hospital.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 陈奕璇
 * @date 2019/12/24
 */
public class FollowUp implements Serializable,Cloneable{
    /** 主键 */
    private Integer followId ;
    /** 随访时间 */
    private Date followTime ;
    /** 随访组id */
    private Integer followGroupId ;
    /** 科室id */
    private Integer followDepartmentId ;
    /** 随访状态0未随访1已随访 */
    private Boolean followState ;

    /** 主键 */
    public Integer getFollowId(){
        return this.followId;
    }
    /** 主键 */
    public void setFollowId(Integer followId){
        this.followId = followId;
    }
    /** 随访时间 */
    public Date getFollowTime(){
        return this.followTime;
    }
    /** 随访时间 */
    public void setFollowTime(Date followTime){
        this.followTime = followTime;
    }
    /** 随访组id */
    public Integer getFollowGroupId(){
        return this.followGroupId;
    }
    /** 随访组id */
    public void setFollowGroupId(Integer followGroupId){
        this.followGroupId = followGroupId;
    }
    /** 科室id */
    public Integer getFollowDepartmentId(){
        return this.followDepartmentId;
    }
    /** 科室id */
    public void setFollowDepartmentId(Integer followDepartmentId){
        this.followDepartmentId = followDepartmentId;
    }
    /** 随访状态0未随访1已随访 */
    public Boolean getFollowState(){
        return this.followState;
    }
    /** 随访状态0未随访1已随访 */
    public void setFollowState(Boolean followState){
        this.followState = followState;
    }

    @Override
    public String toString() {
        return "FollowUp{" +
                "followId=" + followId +
                ", followTime=" + followTime +
                ", followGroupId=" + followGroupId +
                ", followDepartmentId=" + followDepartmentId +
                ", followState=" + followState +
                '}';
    }
}

