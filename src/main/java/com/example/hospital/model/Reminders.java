package com.example.hospital.model;

import java.io.Serializable;

/**
 * @author 陈奕璇
 * @date 2019/12/24
 */
public class Reminders implements Serializable,Cloneable{
    /** 主键 */
    private Integer remId ;
    /** 提醒方式id */
    private Integer remindersId ;
    /** 字典id */
    private Integer remindersDictionaryId ;
    /** 职业id */
    private Integer remindersOccupationId ;

    /** 主键 */
    public Integer getRemId(){
        return this.remId;
    }
    /** 主键 */
    public void setRemId(Integer remId){
        this.remId = remId;
    }
    /** 提醒方式id */
    public Integer getRemindersId(){
        return this.remindersId;
    }
    /** 提醒方式id */
    public void setRemindersId(Integer remindersId){
        this.remindersId = remindersId;
    }
    /** 字典id */
    public Integer getRemindersDictionaryId(){
        return this.remindersDictionaryId;
    }
    /** 字典id */
    public void setRemindersDictionaryId(Integer remindersDictionaryId){
        this.remindersDictionaryId = remindersDictionaryId;
    }
    /** 职业id */
    public Integer getRemindersOccupationId(){
        return this.remindersOccupationId;
    }
    /** 职业id */
    public void setRemindersOccupationId(Integer remindersOccupationId){
        this.remindersOccupationId = remindersOccupationId;
    }

    @Override
    public String toString() {
        return "Reminders{" +
                "remId=" + remId +
                ", remindersId=" + remindersId +
                ", remindersDictionaryId=" + remindersDictionaryId +
                ", remindersOccupationId=" + remindersOccupationId +
                '}';
    }
}
