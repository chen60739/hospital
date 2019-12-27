package com.example.hospital.dto;

import com.example.hospital.model.User;

public class SuperUser extends User {

    private String dictionaryName ;

    public String getDictionaryName() {
        return dictionaryName;
    }

    public void setDictionaryName(String dictionaryName) {
        this.dictionaryName = dictionaryName;
    }
}
