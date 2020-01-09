package com.example.hospital.dao;

import com.example.hospital.dto.TemplateOverView;
import com.example.hospital.model.Template;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TemplateMapper {
    int deleteByPrimaryKey(Integer templateSettingId);

    int insert(Template record);

    int insertSelective(Template record);

    Template selectByPrimaryKey(Integer templateSettingId);

    int updateByPrimaryKeySelective(Template record);

    int updateByPrimaryKey(Template record);

    /**
     * 查询当前小组所选模板
     * @return
     * @param
     * @param groupId
     */
    List<Template> selectAll(Integer groupId);

    int setRange(@Param("tempId") Integer tempId, @Param("departmentIds") String departmentIds);

    int changeTemplateState(Integer tempId);

    int delTemplate(Integer tempId);

    List<Template> getTemplate(Integer departmentId);

    /**
     * 模板总览列表查询
     * @return
     * @param groupName 随访组名称
     * @param startTime 创建时间开始
     * @param endTime 创建时间结束
     * @param tempName 模板名称
     * @param createPeople 创建人
     */
    List<TemplateOverView> templateOverviewData(@Param("groupName") String groupName,
                                                @Param("startTime") String startTime,
                                                @Param("endTime") String endTime,
                                                @Param("tempName") String tempName,
                                                @Param("createPeople") String createPeople);
}