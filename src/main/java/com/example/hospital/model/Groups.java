package com.example.hospital.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 陈奕璇
 * @date 2019/12/24
 */
public class Groups implements Serializable,Cloneable{
    /** 主键 */
    private Integer groupId ;
    /** 小组名称 */
    private String groupName ;
    /** 负责人 */
    private String groupPrincipal ;
    /** 小组负责医院 */
    private Integer groupHospitalId ;
    /** 负责科室 */
    private Integer groupDepartmentId ;
    /** 级别 */
    private Integer groupRankId ;
    /** 电话 */
    private String groupPhone ;
    /** 状态 */
    private Boolean groupState ;
    /** 开始时间 */

    @JsonFormat(pattern="yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date groupStartTime ;
    /** 结束时间 */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date groupEndTime ;
    /** 课题编号 */
    private String groupNum ;
    /** 患者数量 */
    private Integer patientNum ;
    /** 0 对照组 1实验组 */
    private Boolean controlGroup ;
    /** 背景 */
    private String background ;
    /** 是否删除 */
    private Boolean isDel ;

    /** 主键 */
    public Integer getGroupId(){
        return this.groupId;
    }
    /** 主键 */
    public void setGroupId(Integer groupId){
        this.groupId = groupId;
    }
    /** 小组名称 */
    public String getGroupName(){
        return this.groupName;
    }
    /** 小组名称 */
    public void setGroupName(String groupName){
        this.groupName = groupName;
    }
    /** 负责人 */
    public String getGroupPrincipal(){
        return this.groupPrincipal;
    }
    /** 负责人 */
    public void setGroupPrincipal(String groupPrincipal){
        this.groupPrincipal = groupPrincipal;
    }
    /** 小组负责医院 */
    public Integer getGroupHospitalId(){
        return this.groupHospitalId;
    }
    /** 小组负责医院 */
    public void setGroupHospitalId(Integer groupHospitalId){
        this.groupHospitalId = groupHospitalId;
    }
    /** 负责科室 */
    public Integer getGroupDepartmentId(){
        return this.groupDepartmentId;
    }
    /** 负责科室 */
    public void setGroupDepartmentId(Integer groupDepartmentId){
        this.groupDepartmentId = groupDepartmentId;
    }
    /** 级别 */
    public Integer getGroupRankId(){
        return this.groupRankId;
    }
    /** 级别 */
    public void setGroupRankId(Integer groupRankId){
        this.groupRankId = groupRankId;
    }
    /** 电话 */
    public String getGroupPhone(){
        return this.groupPhone;
    }
    /** 电话 */
    public void setGroupPhone(String groupPhone){
        this.groupPhone = groupPhone;
    }
    /** 状态 */
    public Boolean getGroupState(){
        return this.groupState;
    }
    /** 状态 */
    public void setGroupState(Boolean groupState){
        this.groupState = groupState;
    }
    /** 开始时间 */
    public Date getGroupStartTime(){
        return this.groupStartTime;
    }
    /** 开始时间 */
    public void setGroupStartTime(Date groupStartTime){
        this.groupStartTime = groupStartTime;
    }
    /** 结束时间 */
    public Date getGroupEndTime(){
        return this.groupEndTime;
    }
    /** 结束时间 */
    public void setGroupEndTime(Date groupEndTime){
        this.groupEndTime = groupEndTime;
    }
    /** 课题编号 */
    public String getGroupNum(){
        return this.groupNum;
    }
    /** 课题编号 */
    public void setGroupNum(String groupNum){
        this.groupNum = groupNum;
    }
    /** 患者数量 */
    public Integer getPatientNum(){
        return this.patientNum;
    }
    /** 患者数量 */
    public void setPatientNum(Integer patientNum){
        this.patientNum = patientNum;
    }
    /** 0 对照组 1实验组 */
    public Boolean getControlGroup(){
        return this.controlGroup;
    }
    /** 0 对照组 1实验组 */
    public void setControlGroup(Boolean controlGroup){
        this.controlGroup = controlGroup;
    }
    /** 背景 */
    public String getBackground(){
        return this.background;
    }
    /** 背景 */
    public void setBackground(String background){
        this.background = background;
    }
    /** 是否删除 */
    public Boolean getIsDel(){
        return this.isDel;
    }
    /** 是否删除 */
    public void setIsDel(Boolean isDel){
        this.isDel = isDel;
    }

    @Override
    public String toString() {
        return "Groups{" +
                "groupId=" + groupId +
                ", groupName='" + groupName + '\'' +
                ", groupPrincipal='" + groupPrincipal + '\'' +
                ", groupHospitalId=" + groupHospitalId +
                ", groupDepartmentId=" + groupDepartmentId +
                ", groupRankId=" + groupRankId +
                ", groupPhone='" + groupPhone + '\'' +
                ", groupState=" + groupState +
                ", groupStartTime=" + groupStartTime +
                ", groupEndTime=" + groupEndTime +
                ", groupNum='" + groupNum + '\'' +
                ", patientNum=" + patientNum +
                ", controlGroup=" + controlGroup +
                ", background='" + background + '\'' +
                ", isDel=" + isDel +
                '}';
    }
}

