package com.example.hospital.model;

/**
 * @Author 王斌
 * @data 2020/01/04
 */
public class GroupUserRole {
    private Integer id;
    /** 组用户id */
    private String groupUserId;
    /** 组权限id */
    private String groupRoleId;
    /** 组id */
    private String groupId;
    /** 组角色id */
    private Integer groupOccupationId;
    /** 组等级id */
    private Integer gradeId;
    /** 是否删除 */
    private Boolean isDel ;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGroupUserId() {
        return groupUserId;
    }

    public void setGroupUserId(String groupUserId) {
        this.groupUserId = groupUserId;
    }

    public String getGroupRoleId() {
        return groupRoleId;
    }

    public void setGroupRoleId(String groupRoleId) {
        this.groupRoleId = groupRoleId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Integer getGroupOccupationId() {
        return groupOccupationId;
    }

    public void setGroupOccupationId(Integer groupOccupationId) {
        this.groupOccupationId = groupOccupationId;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public Boolean getDel() {
        return isDel;
    }

    public void setDel(Boolean del) {
        isDel = del;
    }

    public GroupUserRole(Integer id, String groupUserId, String groupRoleId, String groupId, Integer groupOccupationId, Integer gradeId, Boolean isDel) {
        this.id = id;
        this.groupUserId = groupUserId;
        this.groupRoleId = groupRoleId;
        this.groupId = groupId;
        this.groupOccupationId = groupOccupationId;
        this.gradeId = gradeId;
        this.isDel = isDel;
    }

    public GroupUserRole() {
    }

    @Override
    public String toString() {
        return "GroupUserRole{" +
                "id=" + id +
                ", groupUserId='" + groupUserId + '\'' +
                ", groupRoleId='" + groupRoleId + '\'' +
                ", groupId='" + groupId + '\'' +
                ", groupOccupationId=" + groupOccupationId +
                ", gradeId=" + gradeId +
                ", isDel=" + isDel +
                '}';
    }
}
