package com.example.hospital.dto;

import com.example.hospital.model.SelectRole;
import com.example.hospital.model.User;

public class SuperUser extends User {

    private String dictionaryName ;
    private String d1 ;
    private String d2 ;
    private String d3 ;
    private SelectRole selectRole;

    public String getDictionaryName() {
        return dictionaryName;
    }

    public void setDictionaryName(String dictionaryName) {
        this.dictionaryName = dictionaryName;
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
        return "SuperUser{" +
                "dictionaryName='" + dictionaryName + '\'' +
                ", d1='" + d1 + '\'' +
                ", d2='" + d2 + '\'' +
                ", d3='" + d3 + '\'' +
                ", selectRole=" + selectRole +
                '}';
    }
}
