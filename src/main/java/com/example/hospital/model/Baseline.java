package com.example.hospital.model;

import java.io.Serializable;

/**
 * @author 陈奕璇
 * @date 2019/12/24
 */
public class Baseline implements Serializable,Cloneable{
    /** 基线id */
    private Integer baselineId ;
    /** 随访规则id */
    private Integer ruleId ;
    /** 患者id */
    private Integer baselinePatId ;

    /** 基线id */
    public Integer getBaselineId(){
        return this.baselineId;
    }
    /** 基线id */
    public void setBaselineId(Integer baselineId){
        this.baselineId = baselineId;
    }
    /** 随访规则id */
    public Integer getRuleId(){
        return this.ruleId;
    }
    /** 随访规则id */
    public void setRuleId(Integer ruleId){
        this.ruleId = ruleId;
    }
    /** 患者id */
    public Integer getBaselinePatId(){
        return this.baselinePatId;
    }
    /** 患者id */
    public void setBaselinePatId(Integer baselinePatId){
        this.baselinePatId = baselinePatId;
    }

    @Override
    public String toString() {
        return "Baseline{" +
                "baselineId=" + baselineId +
                ", ruleId=" + ruleId +
                ", baselinePatId=" + baselinePatId +
                '}';
    }
}

