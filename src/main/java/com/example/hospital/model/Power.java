package com.example.hospital.model;

import java.io.Serializable;

/**
 * @author 陈奕璇
 * @date 2019/12/24
 */
public class Power implements Serializable,Cloneable{
    /** 主键 */
    private Integer id ;
    /** 字典里权限id */
    private Integer powerId ;
    /** 用户id */
    private Integer userId ;

    /** 主键 */
    public Integer getId(){
        return this.id;
    }
    /** 主键 */
    public void setId(Integer id){
        this.id = id;
    }
    /** 字典里权限id */
    public Integer getPowerId(){
        return this.powerId;
    }
    /** 字典里权限id */
    public void setPowerId(Integer powerId){
        this.powerId = powerId;
    }
    /** 用户id */
    public Integer getUserId(){
        return this.userId;
    }
    /** 用户id */
    public void setUserId(Integer userId){
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Power{" +
                "id=" + id +
                ", powerId=" + powerId +
                ", userId=" + userId +
                '}';
    }
}

