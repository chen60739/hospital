package com.example.hospital.dto;

import com.example.hospital.model.Lable;

/**
 * @author 陈奕璇
 * @date 2020/01/14
 */
public class LablePro extends Lable {
    /** 创建人姓名 */
    private String userName;
    /** 科室名 */
    private String department;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "LablePro{" +
                "userName='" + userName + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
