package com.example.hospital.dto;

import com.example.hospital.model.Template;

/**
 * @author 陈奕璇
 * @date 2020/01/08
 */
public class TemplateOverView extends Template {
    private String groupName;
    private String peopleName;
    private String groupDepartmentId;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupDepartmentId() {
        return groupDepartmentId;
    }

    public void setGroupDepartmentId(String groupDepartmentId) {
        this.groupDepartmentId = groupDepartmentId;
    }

    public String getPeopleName() {
        return peopleName;
    }

    public void setPeopleName(String peopleName) {
        this.peopleName = peopleName;
    }

    @Override
    public String toString() {
        return "TemplateOverView{" +
                "groupName='" + groupName + '\'' +
                ", peopleName='" + peopleName + '\'' +
                ", groupDepartmentId='" + groupDepartmentId + '\'' +
                '}';
    }
}
