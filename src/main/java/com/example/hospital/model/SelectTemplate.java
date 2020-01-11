package com.example.hospital.model;

import java.io.Serializable;

/**
 * @author 陈奕璇
 * @date 2019/12/24
 */
public class SelectTemplate implements Serializable,Cloneable{
    /** 主键 */
    private Integer stId ;
    /** 随访规则id */
    private Integer selectRuleId ;
    /** 模板id */
    private Integer templateId ;
    /** 主键 */
    public Integer getStId(){
        return this.stId;
    }
    /** 主键 */
    public void setStId(Integer stId){
        this.stId = stId;
    }
    /** 随访规则id */
    public Integer getSelectRuleId(){
        return this.selectRuleId;
    }
    /** 随访规则id */
    public void setSelectRuleId(Integer selectRuleId){
        this.selectRuleId = selectRuleId;
    }
    /** 模板id */
    public Integer getTemplateId(){
        return this.templateId;
    }
    /** 模板id */
    public void setTemplateId(Integer templateId){
        this.templateId = templateId;
    }

    @Override
    public String toString() {
        return "SelectTemplate{" +
                "stId=" + stId +
                ", selectRuleId=" + selectRuleId +
                ", templateId=" + templateId +
                '}';
    }
}
