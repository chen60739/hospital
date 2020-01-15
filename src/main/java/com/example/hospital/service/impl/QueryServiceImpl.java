package com.example.hospital.service.impl;

import com.example.hospital.dao.*;
import com.example.hospital.dto.SuperFollow;
import com.example.hospital.dto.SuperProgramme;
import com.example.hospital.model.*;
import com.example.hospital.service.QueryService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author 周津锐
 * @date 2019/12/24
 */
@Service
public class QueryServiceImpl implements QueryService {
    @Resource
    DictionaryMapper dictionaryMapper;
    @Resource
    MedicationMapper medicationMapper;
    @Resource
    TestMapper testMapper;
    @Resource
    CheckedMapper checkedMapper;
    @Resource
    ProgrammeMapper programmeMapper;
    @Resource
    FollowUpRuleMapper followUpRuleMapper;
    @Resource
    SelectTemplateMapper selectTemplateMapper;
    @Resource
    RemindersMapper remindersMapper;
    @Resource
    GradeMapper gradeMapper;

    @Override
    public List<Grade> findGrade(Integer gradeId) {
        return gradeMapper.selectByGradeGid(gradeId);
    }

    @Override
    public int removeFollowByRuleId(Integer selectRuleId) {
        return selectTemplateMapper.deleteByFollowUpRuleId(selectRuleId);
    }

    @Override
    public int changeFollowRule(FollowUpRule followUpRule) {
        return followUpRuleMapper.updateFollowRuleByid(followUpRule);
    }

    @Override
    public int removeByRemindersId(Integer remindersId) {
        return remindersMapper.deleteByRemindersId(remindersId);
    }

    @Override
    public int addFollowUpRule(FollowUpRule followUpRule) {
        return followUpRuleMapper.insertFollowUpRule(followUpRule);
    }

    @Override
    public int addFollowTemplate(SelectTemplate selectTemplate) {
        return selectTemplateMapper.insertFollowTemplate(selectTemplate);
    }

    @Override
    public int addReminders(Reminders reminders) {
        return remindersMapper.insertReminders(reminders);
    }

    @Override
    public List<SuperFollow> findAllFollow(Integer upGroupId) {
        return followUpRuleMapper.selectAllFollow(upGroupId);
    }

    @Override
    public List<Dictionary> findVisit() {
        return dictionaryMapper.selectVisit();
    }

    @Override
    public Programme getByProgrammeName(String programmeName) {
        return programmeMapper.selectProgrammeName(programmeName);
    }

    @Override
    public List<Dictionary> findProgramme() {
        return dictionaryMapper.selectProgramme();
    }

    @Override
    public List<SuperProgramme> findProgrammeByDepartment(Integer departmentId) {
        return programmeMapper.selectProgrammeByDepartment(departmentId);
    }


    @Override
    public List<Medication> findMedication(Integer medicationId) {
        return medicationMapper.selectMedication(medicationId); }

    @Override
    public List<Test> findTest(Integer testId) {
        return testMapper.selectTest(testId);
    }

    @Override
    public List<Checked> findChecked(Integer checkedId) {
        return checkedMapper.selectChecked(checkedId);
    }

    @Override
    public int addMedication(Medication medication) {
        return medicationMapper.insertMedication(medication);
    }

    @Override
    public int removeMedication(Integer medicationId) {
        return medicationMapper.deleteMedication(medicationId);
    }

    @Override
    public int addTest(Test test) {
        return testMapper.insertTest(test);
    }

    @Override
    public int removeTest(Integer testId) {
        return testMapper.deleteTest(testId);
    }

    @Override
    public int addChecked(Checked checked) {
        return checkedMapper.insertChecked(checked);
    }

    @Override
    public int removeChecked(Integer checkedId) {
        return checkedMapper.deleteChecked(checkedId);
    }

    @Override
    public int addProgramme(Programme Programme) {
        return programmeMapper.insertProgramme(Programme);
    }

    @Override
    public int changeProgramme(Programme programme) {
        return programmeMapper.updateProgramme(programme);
    }
}
