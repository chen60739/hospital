package com.example.hospital.controller;

import com.example.hospital.dto.SupGroupUserRole;
import com.example.hospital.dto.SuperUser;
import com.example.hospital.model.Dictionary;
import com.example.hospital.model.GroupUserRole;
import com.example.hospital.model.User;
import com.example.hospital.service.GroupUserRoleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * @Author 王斌
 * @data 2020/01/05
 */
@RestController
public class GroupUserRoleController {
    @Resource
    GroupUserRoleService groupUserRoleService;

    /**
     * 查询所有用户权限
     * @param occupationId
     * @param groupId
     * @return
     */
    @RequestMapping("findAllUser")
    public List<SupGroupUserRole> findAllUser(String occupationId,Integer groupId){
        List<SupGroupUserRole> list = groupUserRoleService.findAllGroupUser(occupationId,groupId);
       for (SupGroupUserRole sup:list ) {
            String name = "";
            String role="";
            String[] split = sup.getGroupUserId().split(",");
            String[] split1 = sup.getGroupRoleId().split(",");
            for (String s:split){
                User userName = groupUserRoleService.findNameById(s);
                String aa=userName.getUserName();
                name+=aa+",";
            }
            String substring = name.substring(0, name.length() - 1);
            sup.setGroupUserId(substring);
            for (String s1:split1){
                Dictionary groupRoleName = groupUserRoleService.findGroupRoleName(s1);
                String bb=groupRoleName.getDictionaryName();
                role+=bb+",";
            }
            String substring1 = role.substring(0, role.length() - 1);
            sup.setGroupRoleId(substring1);
        }
        return list;
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @RequestMapping("removeById1")
    public String  removeById1(String ids){
        String substring = ids.substring(0, ids.length() - 1);
        String[] split = substring.split(",");
        try{
            for (int i=0;i<split.length;i++){
                groupUserRoleService.removeById(split[i]);
            }
            return "success";
        }catch (NumberFormatException e){
            e.printStackTrace();
            return "error";
        }

    }

    /**
     * 根据科室id查询 姓名 --根据name 筛选
     * @param departmentId
     * @param userName
     * @return
     */
    @RequestMapping("findNameByDepartmentId")
    public List<SupGroupUserRole> findNameByDepartmentId(Integer departmentId, String userName){
        return groupUserRoleService.findNameByDepartmentId(departmentId,userName);
    }

    /**
     * 修改用户--修改权限
     * @param groupUserId
     * @param id
     * @param groupRoleId
     * @return
     */
    @RequestMapping("changeGroupUser")
    public HashMap<String,Object> changeGroupUser(String groupUserId, Integer id, String groupRoleId){
        String substring =groupUserId.substring(0,groupUserId.length()-1);
        String substring1 =groupRoleId.substring(0,groupRoleId.length()-1);
        return groupUserRoleService.changeGroupUserRole(substring,id,substring1);
    }

    /**
     * 新增用户权限
     * @param groupUserRole
     * @return
     */
    @RequestMapping("saveGroupUserRole")
    public int saveGroupUserRole(GroupUserRole groupUserRole){
        return groupUserRoleService.saveGroupUserRole(groupUserRole);
    }

}
