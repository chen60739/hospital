package com.example.hospital.dto;

import com.example.hospital.model.GroupUserRole;
import com.example.hospital.model.SelectRole;

/**
 * @Author 王斌
 * @data 2020/01/05
 */
public class SupGroupUserRole extends GroupUserRole{
    private Integer departmentid;
    private String userName;
    private Integer userId;
    private String d1 ;
    private String d2 ;
    private String d3 ;
    private SelectRole selectRole;

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getD1() {
        return d1;
    }

    public void setD1(String d1) {
        this.d1 = d1;
    }

    public String getD2() {
        return d2;
    }

    public void setD2(String d2) {
        this.d2 = d2;
    }

    public String getD3() {
        return d3;
    }

    public void setD3(String d3) {
        this.d3 = d3;
    }

    public SelectRole getSelectRole() {
        return selectRole;
    }

    public void setSelectRole(SelectRole selectRole) {
        this.selectRole = selectRole;
    }

    @Override
    public String toString() {
        return "SupGroupUserRole{" +
                "departmentid=" + departmentid +
                ", userName='" + userName + '\'' +
                ", userId=" + userId +
                ", d1='" + d1 + '\'' +
                ", d2='" + d2 + '\'' +
                ", d3='" + d3 + '\'' +
                ", selectRole=" + selectRole +
                '}';
    }
}
