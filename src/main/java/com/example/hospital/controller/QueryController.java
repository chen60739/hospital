package com.example.hospital.controller;

import com.example.hospital.model.Dictionary;
import com.example.hospital.service.QueryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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

    @RequestMapping("/findPlan")
    @ResponseBody
    public List<Dictionary> findPlan(){
        List<Dictionary> plans = queryService.findProgramme();
        System.err.println(plans);
        return plans;
    }
}
