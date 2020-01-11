package com.example.hospital.service;

import com.example.hospital.dto.SuperFollow;
import com.example.hospital.dto.SuperProgramme;
import com.example.hospital.model.*;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 周津锐
 * @date 2019/12/24
 */
public interface QueryService {
    int removeFollowByRuleId(Integer selectRuleId);
    int changeFollowRule(FollowUpRule followUpRule);
    int removeByRemindersId(Integer remindersId);
    /**
     * 添加随访规则
     * @param followUpRule
     * @return
     */
    int addFollowUpRule(FollowUpRule followUpRule);
    /**
     * 添加随访规则下的模板
     * @param selectTemplate
     * @return
     */
    int addFollowTemplate(SelectTemplate selectTemplate);
    /**
     * 添加随访规则下的提醒方式
     * @param reminders
     * @return
     */
    int addReminders(Reminders reminders);
    /**
     * 查询所有随访计划
     * @return
     */
    List<SuperFollow> findAllFollow();
    /**
     * 查询提醒方式
     * @return
     */
    List<Dictionary> findVisit();
    /**
     * 方案名查重
     * @param programmeName
     * @return
     */
    Programme getByProgrammeName(String programmeName);
    /**
     * 查询字典里方案信息
     * @return
     */
    List<Dictionary> findProgramme();
    /**
     * 查询科室下面的方案
     * @param departmentId
     * @return
     */
    List<SuperProgramme> findProgrammeByDepartment(Integer departmentId);
    /**
     * 查询方案里用的药品
     * @param medicationId
     * @return
     */
    List<Medication> findMedication(Integer medicationId);
    /**
     * 查询方案里的检验项
     * @param testId
     * @return
     */
    List<Test> findTest(Integer testId);
    /**
     * 查询方案里的检查项
     * @param checkedId
     * @return
     */
    List<Checked> findChecked(Integer checkedId);
    /**
     * 添加和删除方案里的 药品，检查和检验
     * @param medication
     * @return
     */
    int addMedication(Medication medication);
    int removeMedication(Integer medicationId);
    int addTest(Test test);
    int removeTest(Integer testId);
    int addChecked(Checked checked);
    int removeChecked(Integer checkedId);

    /**
     * 添加和修改方案
     * @param programme
     * @return
     */
    int addProgramme(Programme programme);
    int changeProgramme(Programme programme);


}
