package com.example.hospital.controller;

import com.example.hospital.model.Lable;
import com.example.hospital.service.impl.LableServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @author 陈奕璇
 * @date 2020/01/14
 */
@Controller
public class LableController {
    @Autowired
    private LableServiceImpl lableService;

    @RequestMapping("/updateLable")
    @ResponseBody
    public Map<String,String> updateLable(Lable lable){
        Map<String,String> res = lableService.updateLable(lable);
        return res;
    }

    @RequestMapping("/term")
    public String term(Model model){
        List<Lable> list = lableService.getOneLevelLable();
        model.addAttribute("type",list);
        return "term_management";
    }
}
