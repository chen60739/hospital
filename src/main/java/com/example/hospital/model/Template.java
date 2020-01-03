package com.example.hospital.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 陈奕璇
 * @date 2019/12/24
 */
public class Template implements Serializable,Cloneable{
    /** 主键id */
    private Integer templateId ;
    /** 模板名称 */
    private String templateName ;
    /** 更新时间 */
    @JsonFormat(pattern="yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updateTime ;
    /** 创建时间 */
    @JsonFormat(pattern="yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date templateSettingCreateTime ;
    /** 更新人 */
    private Integer updatePeople ;
    /** 创建人 */
    private Integer createPeople ;
    /** 版本号 */
    private Integer templateSettingVersion ;
    /** 状态  0当前版本 1未发布  2历史版本 */
    private Integer templateSettingState ;

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getTemplateSettingCreateTime() {
        return templateSettingCreateTime;
    }

    public void setTemplateSettingCreateTime(Date templateSettingCreateTime) {
        this.templateSettingCreateTime = templateSettingCreateTime;
    }

    public Integer getUpdatePeople() {
        return updatePeople;
    }

    public void setUpdatePeople(Integer updatePeople) {
        this.updatePeople = updatePeople;
    }

    public Integer getCreatePeople() {
        return createPeople;
    }

    public void setCreatePeople(Integer createPeople) {
        this.createPeople = createPeople;
    }

    public Integer getTemplateSettingVersion() {
        return templateSettingVersion;
    }

    public void setTemplateSettingVersion(Integer templateSettingVersion) {
        this.templateSettingVersion = templateSettingVersion;
    }

    public Integer getTemplateSettingState() {
        return templateSettingState;
    }

    public void setTemplateSettingState(Integer templateSettingState) {
        this.templateSettingState = templateSettingState;
    }

    @Override
    public String toString() {
        return "Template{" +
                "templateId=" + templateId +
                ", templateName='" + templateName +
                ", updateTime=" + updateTime +
                ", templateSettingCreateTime=" + templateSettingCreateTime +
                ", updatePeople=" + updatePeople +
                ", createPeople=" + createPeople +
                ", templateSettingVersion=" + templateSettingVersion +
                ", templateSettingState=" + templateSettingState +
                '}';
    }
}

