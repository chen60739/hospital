package com.example.hospital.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 陈奕璇
 * @date 2019/12/24
 */
public class FollowUpRule implements Serializable,Cloneable{
    /** 主键 */
    private Integer ruleId ;
    /** 基准事件id */
    private Integer benchmarkEvent ;
    /** 0 本院 ，  1 本科室 */
    private Boolean isInHospital ;
    /** 0 首次  1 末次 */
    private Boolean isFirst ;
    /** 0  本就诊， 1  任意就诊 */
    private Boolean thatVisit ;
    /** 起始时间 */
    private Date beginTime ;
    /** 间隔时间 */
    private Date intervalTime ;
    /** 持续次数 */
    private Integer baselineCount ;
    /** 提前通知天数 */
    private Integer advanceNotice ;
    /** 选择模板表id */
    private Integer ruleTemplateId ;
    /** 提醒方式表id */
    private Integer ruleRemindersId ;
    /** 节假日是否排期 0 否 1是 */
    private Boolean isScheduling ;
    /** 0 提前   1  延后 */
    private Boolean isPostpone ;

    /** 主键 */
    public Integer getRuleId(){
        return this.ruleId;
    }
    /** 主键 */
    public void setRuleId(Integer ruleId){
        this.ruleId = ruleId;
    }
    /** 基准事件id */
    public Integer getBenchmarkEvent(){
        return this.benchmarkEvent;
    }
    /** 基准事件id */
    public void setBenchmarkEvent(Integer benchmarkEvent){
        this.benchmarkEvent = benchmarkEvent;
    }
    /** 0 本院 ，  1 本科室 */
    public Boolean getIsInHospital(){
        return this.isInHospital;
    }
    /** 0 本院 ，  1 本科室 */
    public void setIsInHospital(Boolean isInHospital){
        this.isInHospital = isInHospital;
    }
    /** 0 首次  1 末次 */
    public Boolean getIsFirst(){
        return this.isFirst;
    }
    /** 0 首次  1 末次 */
    public void setIsFirst(Boolean isFirst){
        this.isFirst = isFirst;
    }
    /** 0  本就诊， 1  任意就诊 */
    public Boolean getThatVisit(){
        return this.thatVisit;
    }
    /** 0  本就诊， 1  任意就诊 */
    public void setThatVisit(Boolean thatVisit){
        this.thatVisit = thatVisit;
    }
    /** 起始时间 */
    public Date getBeginTime(){
        return this.beginTime;
    }
    /** 起始时间 */
    public void setBeginTime(Date beginTime){
        this.beginTime = beginTime;
    }
    /** 间隔时间 */
    public Date getIntervalTime(){
        return this.intervalTime;
    }
    /** 间隔时间 */
    public void setIntervalTime(Date intervalTime){
        this.intervalTime = intervalTime;
    }
    /** 持续次数 */
    public Integer getBaselineCount(){
        return this.baselineCount;
    }
    /** 持续次数 */
    public void setBaselineCount(Integer baselineCount){
        this.baselineCount = baselineCount;
    }
    /** 提前通知天数 */
    public Integer getAdvanceNotice(){
        return this.advanceNotice;
    }
    /** 提前通知天数 */
    public void setAdvanceNotice(Integer advanceNotice){
        this.advanceNotice = advanceNotice;
    }
    /** 选择模板表id */
    public Integer getRuleTemplateId(){
        return this.ruleTemplateId;
    }
    /** 选择模板表id */
    public void setRuleTemplateId(Integer ruleTemplateId){
        this.ruleTemplateId = ruleTemplateId;
    }
    /** 提醒方式表id */
    public Integer getRuleRemindersId(){
        return this.ruleRemindersId;
    }
    /** 提醒方式表id */
    public void setRuleRemindersId(Integer ruleRemindersId){
        this.ruleRemindersId = ruleRemindersId;
    }
    /** 节假日是否排期 0 否 1是 */
    public Boolean getIsScheduling(){
        return this.isScheduling;
    }
    /** 节假日是否排期 0 否 1是 */
    public void setIsScheduling(Boolean isScheduling){
        this.isScheduling = isScheduling;
    }
    /** 0 提前   1  延后 */
    public Boolean getIsPostpone(){
        return this.isPostpone;
    }
    /** 0 提前   1  延后 */
    public void setIsPostpone(Boolean isPostpone){
        this.isPostpone = isPostpone;
    }

    @Override
    public String toString() {
        return "FollowUpRule{" +
                "ruleId=" + ruleId +
                ", benchmarkEvent=" + benchmarkEvent +
                ", isInHospital=" + isInHospital +
                ", isFirst=" + isFirst +
                ", thatVisit=" + thatVisit +
                ", beginTime=" + beginTime +
                ", intervalTime=" + intervalTime +
                ", baselineCount=" + baselineCount +
                ", advanceNotice=" + advanceNotice +
                ", ruleTemplateId=" + ruleTemplateId +
                ", ruleRemindersId=" + ruleRemindersId +
                ", isScheduling=" + isScheduling +
                ", isPostpone=" + isPostpone +
                '}';
    }
}

