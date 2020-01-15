package com.example.hospital.controller;

import com.example.hospital.dto.SuperFollow;
import com.example.hospital.dto.SuperProgramme;
import com.example.hospital.model.*;
import com.example.hospital.service.QueryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author 周津锐
 * @date 2019/12/24
 */
@Controller
public class QueryController {
    @Resource
    QueryService queryService;

    @RequestMapping("/showPower")
    @ResponseBody
    public List<Grade> showPower(Integer gradeId){
        List<Grade> grades=queryService.findGrade(gradeId);
        return grades;
    }

    @RequestMapping("/findRemind")
    @ResponseBody
    public List<Dictionary> findRemind(){
        List<Dictionary> remind = queryService.findVisit();
        return remind;
    }

    @RequestMapping("/findAllFollow")
    @ResponseBody
    public List<SuperFollow> findAllFollow(Integer upGroupId){
        List<SuperFollow> followList=  queryService.findAllFollow(upGroupId);
        System.err.println(followList);
        return followList;
    }

    @RequestMapping("/saveFollowUpRule")
    @ResponseBody
    public Integer saveFollowUpRule(FollowUpRule followUpRule ,String tamplateId,String remindersDictionaryId,String remindersOccupationId){
        if(followUpRule.getRuleId()==null|| "".equals(followUpRule.getRuleId())){
            queryService.addFollowUpRule(followUpRule);
        }else {
            queryService.changeFollowRule(followUpRule);
            queryService.removeByRemindersId(followUpRule.getRuleId());
            queryService.removeFollowByRuleId(followUpRule.getRuleId());
        }
        String[] tid=tamplateId.split(",",-1);
        String[] rdid=remindersDictionaryId.split(",",-1);
        String[] roid=remindersOccupationId.split(",",-1);
        SelectTemplate st = new SelectTemplate();
        for (int i = 0; i <tid.length ; i++) {
            Integer t=Integer.valueOf(tid[i]);
            st.setSelectRuleId(followUpRule.getRuleId());
            st.setTemplateId(t);
            queryService.addFollowTemplate(st);
        }
        Reminders reminders = new Reminders();
        for (int i = 0; i <rdid.length ; i++) {
            Integer rd = Integer.valueOf(rdid[i]);
            Integer ro = Integer.valueOf(roid[i]);
            reminders.setRemindersId(followUpRule.getRuleId());
            reminders.setRemindersDictionaryId(rd);
            reminders.setRemindersOccupationId(ro);
            queryService.addReminders(reminders);
        }
        return 1;
    }


    @RequestMapping("/findPlan")
    @ResponseBody
    public List<Dictionary> findPlan(){
        List<Dictionary> plans = queryService.findProgramme();
        return plans;
    }

    @RequestMapping("/findAllProgramme")
    @ResponseBody
    public List<SuperProgramme> findAllProgramme(Integer departmentId){
        List<SuperProgramme> programmeList = queryService.findProgrammeByDepartment(departmentId);
        for (int i = 0; i <programmeList.size() ; i++) {
            List<Medication> medicationList = queryService.findMedication(programmeList.get(i).getProgrammeId());
            List<Test> testList = queryService.findTest(programmeList.get(i).getProgrammeId());
            List<Checked> checkedList = queryService.findChecked(programmeList.get(i).getProgrammeId());
            if(medicationList!=null){ programmeList.get(i).setMedicationList(medicationList); }
            if(testList!=null){  programmeList.get(i).setTestList(testList); }
            if(checkedList!=null){ programmeList.get(i).setCheckedList(checkedList); }
        }
        return programmeList;
    }

    @RequestMapping("/savePlan")
    public String savePlan(Programme Programme, Integer[] medicationDictionaryId,
                           Integer[] testDictionaryId,Integer [] checkedDictionaryId){
        Integer pid = Programme.getProgrammeId();
        Medication m = new Medication();
        Checked c = new Checked();
        Test t =new Test();
        if(!"".equals(pid) && pid!=null){
            queryService.changeProgramme(Programme);
            queryService.removeMedication(pid);
            queryService.removeTest(pid);
            queryService.removeChecked(pid);
        }else{ queryService.addProgramme(Programme); }
        Integer ProgrammeId=Programme.getProgrammeId();
        for (Integer integer : medicationDictionaryId) {
            m.setMedicationId(ProgrammeId);
            m.setMedicationDictionaryId(integer);
            queryService.addMedication(m);
        }
        for (Integer integer : testDictionaryId) {
            t.setTestId(ProgrammeId);
            t.setTestDictionaryId(integer);
            queryService.addTest(t);
        }
        for (Integer integer : checkedDictionaryId) {
            c.setCheckedId(ProgrammeId);
            c.setCheckedDictionaryId(integer);
            queryService.addChecked(c);
        }
        return "redirect:/plan";
    }
    @RequestMapping("/changeProgrammeName")
    @ResponseBody
    public  boolean changeProgrammeName(String programmeName){
        Programme pg= queryService.getByProgrammeName(programmeName);
        if(pg!=null){ return false; }else{  return true; }
    }
}
