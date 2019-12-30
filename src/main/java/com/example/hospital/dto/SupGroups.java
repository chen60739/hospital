package com.example.hospital.dto;

import com.example.hospital.model.Groups;
/**
 *@Author 王斌
 *@data 2019/12/26
 */
public class SupGroups extends Groups{
    private String dictionaryName;

    public String getDictionaryName() {
        return dictionaryName;
    }

    public void setDictionaryName(String dictionaryName) {
        this.dictionaryName = dictionaryName;
    }

    @Override
    public String toString() {
        return "SupGroups{" +
                "dictionaryName='" + dictionaryName + '\'' +
                '}';
    }
}
