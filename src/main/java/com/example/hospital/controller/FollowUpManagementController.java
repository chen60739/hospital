package com.example.hospital.controller;

import com.example.hospital.dto.FollowUpPatient;
import com.example.hospital.service.impl.FollowUpManagementServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 陈奕璇
 * @date 2019/12/28
 */
@Controller
public class FollowUpManagementController {

    @Resource
    private FollowUpManagementServiceImpl followUpManagementService;

    @RequestMapping("/followUpManagementData")
    @ResponseBody
    private List<FollowUpPatient> followUpManagementData(FollowUpPatient followUpPatient,
                                                         @RequestParam("startDate") String startDate,
                                                         @RequestParam("endDate") String endDate){
        List<FollowUpPatient> list = followUpManagementService.getDate(followUpPatient,startDate,endDate);
        return list;
    }
}
