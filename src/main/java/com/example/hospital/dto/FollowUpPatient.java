package com.example.hospital.dto;

import com.example.hospital.model.Patient;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author 陈奕璇
 * @date 2019/12/28
 */
@Component
public class FollowUpPatient extends Patient {
    /** 随访组名称 */
    private String groupName;
    /** 随访组Id */
    private Integer groupId ;
    /** 入组时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date inGroupTime ;
    /** 随访时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date followTime;
    /** 随访状态0未随访1已随访 */
    private Boolean followState ;
    /** 负责科室名称 */
    private String departmentName ;
    /** 负责科室Id */
    private Integer groupDepartmentId ;
    /** 随访计划主键 */
    private Integer followId ;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Date getInGroupTime() {
        return inGroupTime;
    }

    public void setInGroupTime(Date inGroupTime) {
        this.inGroupTime = inGroupTime;
    }

    public Date getFollowTime() {
        return followTime;
    }

    public void setFollowTime(Date followTime) {
        this.followTime = followTime;
    }

    public Boolean getFollowState() {
        return followState;
    }

    public void setFollowState(Boolean followState) {
        this.followState = followState;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getGroupDepartmentId() {
        return groupDepartmentId;
    }

    public void setGroupDepartmentId(Integer groupDepartmentId) {
        this.groupDepartmentId = groupDepartmentId;
    }

    public Integer getFollowId() {
        return followId;
    }

    public void setFollowId(Integer followId) {
        this.followId = followId;
    }

    @Override
    public String toString() {
        return "FollowUpPatient{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", inGroupTime=" + inGroupTime +
                ", followTime=" + followTime +
                ", followState=" + followState +
                ", departmentName='" + departmentName + '\'' +
                ", groupDepartmentId=" + groupDepartmentId +
                ", followId=" + followId +
                '}';
    }
}
