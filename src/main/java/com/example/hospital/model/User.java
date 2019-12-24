package com.example.hospital.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 陈奕璇
 * @date 2019/12/24
 */
public class User implements Serializable,Cloneable{
    /** 主键 */
    private Integer userId ;
    /** 姓名 */
    private String userName ;
    /** 密码 */
    private String userPwd ;
    /** 性别 */
    private Boolean userSex ;
    /** 电话 */
    private String userPhone ;
    /** 邮箱 */
    private String userEmail ;
    /** 科室ID */
    private Integer departmentId ;
    /** 权限表id */
    private Integer roleId ;
    /** 创建时间 */
    private Date createTime ;
    /** 更新时间 */
    private Date modifiedTime ;
    /** 是否删除 */
    private Boolean isDel ;
    /** 等级ID */
    private Integer gradeId ;
    /** 小组ID */
    private Integer groupId ;
    /** 职业id */
    private Integer occupationId ;

    /** 主键 */
    public Integer getUserId(){
        return this.userId;
    }
    /** 主键 */
    public void setUserId(Integer userId){
        this.userId = userId;
    }
    /** 姓名 */
    public String getUserName(){
        return this.userName;
    }
    /** 姓名 */
    public void setUserName(String userName){
        this.userName = userName;
    }
    /** 密码 */
    public String getUserPwd(){
        return this.userPwd;
    }
    /** 密码 */
    public void setUserPwd(String userPwd){
        this.userPwd = userPwd;
    }
    /** 性别 */
    public Boolean getUserSex(){
        return this.userSex;
    }
    /** 性别 */
    public void setUserSex(Boolean userSex){
        this.userSex = userSex;
    }
    /** 电话 */
    public String getUserPhone(){
        return this.userPhone;
    }
    /** 电话 */
    public void setUserPhone(String userPhone){
        this.userPhone = userPhone;
    }
    /** 邮箱 */
    public String getUserEmail(){
        return this.userEmail;
    }
    /** 邮箱 */
    public void setUserEmail(String userEmail){
        this.userEmail = userEmail;
    }
    /** 科室ID */
    public Integer getDepartmentId(){
        return this.departmentId;
    }
    /** 科室ID */
    public void setDepartmentId(Integer departmentId){
        this.departmentId = departmentId;
    }
    /** 权限表id */
    public Integer getRoleId(){
        return this.roleId;
    }
    /** 权限表id */
    public void setRoleId(Integer roleId){
        this.roleId = roleId;
    }
    /** 创建时间 */
    public Date getCreateTime(){
        return this.createTime;
    }
    /** 创建时间 */
    public void setCreateTime(Date createTime){
        this.createTime = createTime;
    }
    /** 更新时间 */
    public Date getModifiedTime(){
        return this.modifiedTime;
    }
    /** 更新时间 */
    public void setModifiedTime(Date modifiedTime){
        this.modifiedTime = modifiedTime;
    }
    /** 是否删除 */
    public Boolean getIsDel(){
        return this.isDel;
    }
    /** 是否删除 */
    public void setIsDel(Boolean isDel){
        this.isDel = isDel;
    }
    /** 等级ID */
    public Integer getGradeId(){
        return this.gradeId;
    }
    /** 等级ID */
    public void setGradeId(Integer gradeId){
        this.gradeId = gradeId;
    }
    /** 小组ID */
    public Integer getGroupId(){
        return this.groupId;
    }
    /** 小组ID */
    public void setGroupId(Integer groupId){
        this.groupId = groupId;
    }
    /** 职业id */
    public Integer getOccupationId(){
        return this.occupationId;
    }
    /** 职业id */
    public void setOccupationId(Integer occupationId){
        this.occupationId = occupationId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userSex=" + userSex +
                ", userPhone='" + userPhone + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", departmentId=" + departmentId +
                ", roleId=" + roleId +
                ", createTime=" + createTime +
                ", modifiedTime=" + modifiedTime +
                ", isDel=" + isDel +
                ", gradeId=" + gradeId +
                ", groupId=" + groupId +
                ", occupationId=" + occupationId +
                '}';
    }
}
