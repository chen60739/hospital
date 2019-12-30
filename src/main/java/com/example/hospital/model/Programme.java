package com.example.hospital.model;

import java.io.Serializable;

/**
 * @author 陈奕璇
 * @date 2019/12/24
 */
public class Programme implements Serializable,Cloneable{
    /** 主键 */
    private Integer programmeId ;
    /** 治疗 */
    private String treatment ;
    /** 手术 */
    private String operation ;
    /** 通知 */
    private String notice ;
    /** 科室id */
    private Integer departmentId ;
    /** 方案名称*/
    private String programmeName ;

    /** 主键 */
    public Integer getProgrammeId(){
        return this.programmeId;
    }
    /** 主键 */
    public void setProgrammeId(Integer programmeId){
        this.programmeId = programmeId;
    }
    /** 用药id */

    public String getProgrammeName() {
        return programmeName;
    }

    public void setProgrammeName(String programmeName) {
        this.programmeName = programmeName;
    }

    /** 治疗 */
    public String getTreatment(){
        return this.treatment;
    }
    /** 治疗 */
    public void setTreatment(String treatment){
        this.treatment = treatment;
    }
    /** 手术 */
    public String getOperation(){
        return this.operation;
    }
    /** 手术 */
    public void setOperation(String operation){
        this.operation = operation;
    }
    /** 通知 */
    public String getNotice(){
        return this.notice;
    }
    /** 通知 */
    public void setNotice(String notice){
        this.notice = notice;
    }
    /** 科室id */
    public Integer getDepartmentId(){
        return this.departmentId;
    }
    /** 科室id */
    public void setDepartmentId(Integer departmentId){
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "Programme{" +
                "programmeId=" + programmeId +
                ", treatment='" + treatment + '\'' +
                ", operation='" + operation + '\'' +
                ", notice='" + notice + '\'' +
                ", departmentId=" + departmentId +
                ", programmeName=" + programmeName +
                '}';
    }
}

