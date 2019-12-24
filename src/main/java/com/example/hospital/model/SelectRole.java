package com.example.hospital.model;

import java.io.Serializable;

/**
 * @author 陈奕璇
 * @date 2019/12/24
 */
public class SelectRole implements Serializable,Cloneable{
    /** 主键 */
    private Integer selectRoleId ;
    /** 权限 */
    private Integer roleId ;
    /** 权限名称 */
    private String menuName ;
    /** 权限路径 */
    private String menu ;

    /** 主键 */
    public Integer getSelectRoleId(){
        return this.selectRoleId;
    }
    /** 主键 */
    public void setSelectRoleId(Integer selectRoleId){
        this.selectRoleId = selectRoleId;
    }
    /** 权限 */
    public Integer getRoleId(){
        return this.roleId;
    }
    /** 权限 */
    public void setRoleId(Integer roleId){
        this.roleId = roleId;
    }
    /** 权限名称 */
    public String getMenuName(){
        return this.menuName;
    }
    /** 权限名称 */
    public void setMenuName(String menuName){
        this.menuName = menuName;
    }
    /** 权限路径 */
    public String getMenu(){
        return this.menu;
    }
    /** 权限路径 */
    public void setMenu(String menu){
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "SelectRole{" +
                "selectRoleId=" + selectRoleId +
                ", roleId=" + roleId +
                ", menuName='" + menuName + '\'' +
                ", menu='" + menu + '\'' +
                '}';
    }
}

