package com.example.hospital.dao;

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
     * 查询所有模板
     * @return
     * @param
     */
    List<Template> selectAll(Integer departmentId);

    int setRange(@Param("tempId") Integer tempId, @Param("departmentIds") String departmentIds);

    int changeTemplateState(Integer tempId);

    int delTemplate(Integer tempId);
}