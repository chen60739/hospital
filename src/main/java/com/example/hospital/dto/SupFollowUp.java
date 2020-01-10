package com.example.hospital.dto;

import com.example.hospital.model.FollowUp;

/**
 * @Author 王斌
 * @data 2020/01/09
 */
public class SupFollowUp extends FollowUp{
    private String dictionaryName;
    private String  groupName;

    public String getDictionaryName() {
        return dictionaryName;
    }

    public void setDictionaryName(String dictionaryName) {
        this.dictionaryName = dictionaryName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "SupFollowUp{" +
                "dictionaryName='" + dictionaryName + '\'' +
                ", groupName='" + groupName + '\'' +
                '}';
    }
}
