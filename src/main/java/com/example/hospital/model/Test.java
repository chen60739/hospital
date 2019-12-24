package com.example.hospital.model;

import java.io.Serializable;

/**
 * @author 陈奕璇
 * @date 2019/12/24
 */
public class Test implements Serializable,Cloneable{
    /** 主键 */
    private Integer tId ;
    /** 检验id */
    private Integer testId ;
    /** 字典检验id */
    private Integer testDictionaryId ;

    /** 主键 */
    public Integer getTId(){
        return this.tId;
    }
    /** 主键 */
    public void setTId(Integer tId){
        this.tId = tId;
    }
    /** 检验id */
    public Integer getTestId(){
        return this.testId;
    }
    /** 检验id */
    public void setTestId(Integer testId){
        this.testId = testId;
    }
    /** 字典检验id */
    public Integer getTestDictionaryId(){
        return this.testDictionaryId;
    }
    /** 字典检验id */
    public void setTestDictionaryId(Integer testDictionaryId){
        this.testDictionaryId = testDictionaryId;
    }

    @Override
    public String toString() {
        return "Test{" +
                "tId=" + tId +
                ", testId=" + testId +
                ", testDictionaryId=" + testDictionaryId +
                '}';
    }
}

