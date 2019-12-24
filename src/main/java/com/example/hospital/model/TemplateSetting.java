package com.example.hospital.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 陈奕璇
 * @date 2019/12/24
 */
public class TemplateSetting implements Serializable,Cloneable{
    /** 主键id */
    private Integer templateSettingId ;
    /** 模板id */
    private Integer tId ;
    /** 更新时间 */
    private Date updateTime ;
    /** 创建时间 */
    private Date templateSettingCreateTime ;
    /** 更新人 */
    private Integer updatePeople ;
    /** 创建人 */
    private Integer createPeople ;
    /** 版本号 */
    private Integer templateSettingVersion ;
    /** 状态  0当前版本 1未发布  2历史版本 */
    private Boolean templateSettingState ;
    /** 模板名称 */
    private String templateName ;

    /** 主键id */
    public Integer getTemplateSettingId(){
        return this.templateSettingId;
    }
    /** 主键id */
    public void setTemplateSettingId(Integer templateSettingId){
        this.templateSettingId = templateSettingId;
    }
    /** 模板id */
    public Integer getTId(){
        return this.tId;
    }
    /** 模板id */
    public void setTId(Integer tId){
        this.tId = tId;
    }
    /** 更新时间 */
    public Date getUpdateTime(){
        return this.updateTime;
    }
    /** 更新时间 */
    public void setUpdateTime(Date updateTime){
        this.updateTime = updateTime;
    }
    /** 创建时间 */
    public Date getTemplateSettingCreateTime(){
        return this.templateSettingCreateTime;
    }
    /** 创建时间 */
    public void setTemplateSettingCreateTime(Date templateSettingCreateTime){
        this.templateSettingCreateTime = templateSettingCreateTime;
    }
    /** 更新人 */
    public Integer getUpdatePeople(){
        return this.updatePeople;
    }
    /** 更新人 */
    public void setUpdatePeople(Integer updatePeople){
        this.updatePeople = updatePeople;
    }
    /** 创建人 */
    public Integer getCreatePeople(){
        return this.createPeople;
    }
    /** 创建人 */
    public void setCreatePeople(Integer createPeople){
        this.createPeople = createPeople;
    }
    /** 版本号 */
    public Integer getTemplateSettingVersion(){
        return this.templateSettingVersion;
    }
    /** 版本号 */
    public void setTemplateSettingVersion(Integer templateSettingVersion){
        this.templateSettingVersion = templateSettingVersion;
    }
    /** 状态  0当前版本 1未发布  2历史版本 */
    public Boolean getTemplateSettingState(){
        return this.templateSettingState;
    }
    /** 状态  0当前版本 1未发布  2历史版本 */
    public void setTemplateSettingState(Boolean templateSettingState){
        this.templateSettingState = templateSettingState;
    }
    /** 模板名称 */
    public String getTemplateName(){
        return this.templateName;
    }
    /** 模板名称 */
    public void setTemplateName(String templateName){
        this.templateName = templateName;
    }

    @Override
    public String toString() {
        return "TemplateSetting{" +
                "templateSettingId=" + templateSettingId +
                ", tId=" + tId +
                ", updateTime=" + updateTime +
                ", templateSettingCreateTime=" + templateSettingCreateTime +
                ", updatePeople=" + updatePeople +
                ", createPeople=" + createPeople +
                ", templateSettingVersion=" + templateSettingVersion +
                ", templateSettingState=" + templateSettingState +
                ", templateName='" + templateName + '\'' +
                '}';
    }
}

