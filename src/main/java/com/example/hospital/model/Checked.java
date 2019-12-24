package com.example.hospital.model;

import java.io.Serializable;

/**
 * @author 陈奕璇
 * @date 2019/12/24
 */
public class Checked implements Serializable,Cloneable{
    /** 主键 */
    private Integer cId ;
    /** 检查id */
    private Integer checkedId ;
    /** 字典检查id */
    private Integer checkedDictionaryId ;

    /** 主键 */
    public Integer getCId(){
        return this.cId;
    }
    /** 主键 */
    public void setCId(Integer cId){
        this.cId = cId;
    }
    /** 检查id */
    public Integer getCheckedId(){
        return this.checkedId;
    }
    /** 检查id */
    public void setCheckedId(Integer checkedId){
        this.checkedId = checkedId;
    }
    /** 字典检查id */
    public Integer getCheckedDictionaryId(){
        return this.checkedDictionaryId;
    }
    /** 字典检查id */
    public void setCheckedDictionaryId(Integer checkedDictionaryId){
        this.checkedDictionaryId = checkedDictionaryId;
    }

    @Override
    public String toString() {
        return "Checked{" +
                "cId=" + cId +
                ", checkedId=" + checkedId +
                ", checkedDictionaryId=" + checkedDictionaryId +
                '}';
    }
}

