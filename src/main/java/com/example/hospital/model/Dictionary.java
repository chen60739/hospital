package com.example.hospital.model;

import java.io.Serializable;

/**
 * @author 陈奕璇
 * @date 2019/12/24
 */
public class Dictionary implements Serializable,Cloneable{
    /** 字典id */
    private Integer dictionaryId ;
    /** 字典名称 */
    private String dictionaryName ;
    /** 字典上级id */
    private Integer oneId ;
    /** 字典二级id */
    private Integer twoId ;

    /** 字典id */
    public Integer getDictionaryId(){
        return this.dictionaryId;
    }
    /** 字典id */
    public void setDictionaryId(Integer dictionaryId){
        this.dictionaryId = dictionaryId;
    }
    /** 字典名称 */
    public String getDictionaryName(){
        return this.dictionaryName;
    }
    /** 字典名称 */
    public void setDictionaryName(String dictionaryName){
        this.dictionaryName = dictionaryName;
    }
    /** 字典上级id */
    public Integer getOneId(){
        return this.oneId;
    }
    /** 字典上级id */
    public void setOneId(Integer oneId){
        this.oneId = oneId;
    }
    /** 字典二级id */
    public Integer getTwoId(){
        return this.twoId;
    }
    /** 字典二级id */
    public void setTwoId(Integer twoId){
        this.twoId = twoId;
    }

    @Override
    public String toString() {
        return "Dictionary{" +
                "dictionaryId=" + dictionaryId +
                ", dictionaryName='" + dictionaryName + '\'' +
                ", oneId=" + oneId +
                ", twoId=" + twoId +
                '}';
    }
}

