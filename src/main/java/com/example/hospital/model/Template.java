package com.example.hospital.model;

import java.io.Serializable;

/**
 * @author 陈奕璇
 * @date 2019/12/24
 */
public class Template implements Serializable,Cloneable{
    /** 主键 */
    private Integer templateId ;
    /** 模板的值 */
    private String templateValue ;
    /** 标签id */
    private Integer lId ;
    /** 模板id */
    private Integer templateNameId ;

    /** 主键 */
    public Integer getTemplateId(){
        return this.templateId;
    }
    /** 主键 */
    public void setTemplateId(Integer templateId){
        this.templateId = templateId;
    }
    /** 模板的值 */
    public String getTemplateValue(){
        return this.templateValue;
    }
    /** 模板的值 */
    public void setTemplateValue(String templateValue){
        this.templateValue = templateValue;
    }
    /** 标签id */
    public Integer getLId(){
        return this.lId;
    }
    /** 标签id */
    public void setLId(Integer lId){
        this.lId = lId;
    }
    /** 模板id */
    public Integer getTemplateNameId(){
        return this.templateNameId;
    }
    /** 模板id */
    public void setTemplateNameId(Integer templateNameId){
        this.templateNameId = templateNameId;
    }

    @Override
    public String toString() {
        return "Template{" +
                "templateId=" + templateId +
                ", templateValue='" + templateValue + '\'' +
                ", lId=" + lId +
                ", templateNameId=" + templateNameId +
                '}';
    }
}

