package com.example.hospital.controller;

import com.example.hospital.dto.FollowUpPatient;
import com.example.hospital.service.impl.FollowUpManagementServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 陈奕璇
 * @date 2019/12/28
 */
@RestController
public class FollowUpManagementController {

    @Resource
    private FollowUpManagementServiceImpl followUpManagementService;

    @RequestMapping("/followUpManagementData")
    private List<FollowUpPatient> followUpManagementData(FollowUpPatient followUpPatient,
                                                         @RequestParam("startDate") String startDate,
                                                         @RequestParam("endDate") String endDate){
        List<FollowUpPatient> list = followUpManagementService.getDate(followUpPatient,startDate,endDate);
        return list;
    }

    @RequestMapping("/changeFollowState")
    public Map<String, String> changeFollowState(@RequestParam("followId") Integer followId,
                                                 @RequestParam("followState") Boolean followState){
        String message = followUpManagementService.changeFollowState(followId, followState);
        Map<String,String> res = new HashMap<>();
        res.put("mes",message);
        return res;
    }

    @RequestMapping("/calendarFollowUpData")
    public Map<String, List> calendarFollowUpData(){
        Map<String, List> data = followUpManagementService.getCalendarData();
        return data;
    }
}
