package com.example.hospital.controller;

import com.example.hospital.dto.FollowUpPatient;
import com.example.hospital.dto.SupFollowUp;
import com.example.hospital.service.UserService;
import com.example.hospital.service.impl.FollowUpManagementServiceImpl;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
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

    /**
     * 查询所有的随访计划
     * @return
     */
    @RequestMapping("findFollowUp")
    public List<SupFollowUp> findFollowUp(){
        return followUpManagementService.findFollowUp();
    }

    /**
     * 导出
     */
    @RequestMapping("export")
    public void Export(HttpServletResponse response) throws IOException {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("随访计划");
        List<SupFollowUp> followUp = followUpManagementService.findFollowUp();

        // 设置要导出的文件的名字
        String fileName = "随访计划.xls";

        // 新增数据行，并且设置单元格数据
        int rowNum = 1;

        // headers表示excel表中第一行的表头 在excel表中添加表头
        String[] headers = { "序号", "随访时间", "随访组", "科室","随访状态"};
        HSSFRow row = sheet.createRow(0);
        String state="";
        for(int i=0;i<headers.length;i++){
            HSSFCell cell = row.createCell(i);
            HSSFRichTextString text = new HSSFRichTextString(headers[i]);
            cell.setCellValue(text);
        }

        //在表中存放查询到的数据放入对应的列
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for (SupFollowUp item : followUp) {
            HSSFRow row1 = sheet.createRow(rowNum);
            row1.createCell(0).setCellValue(item.getFollowId());
            String dateString = format.format(item.getFollowTime());
            row1.createCell(1).setCellValue(dateString);
            row1.createCell(2).setCellValue(item.getGroupName());
            row1.createCell(3).setCellValue(item.getDictionaryName());
            if (item.getFollowState().equals(true)){
                state="开放";
            }else{
                state="关闭";
            }
            row1.createCell(4).setCellValue(state);
            rowNum++;
        }
        fileName = URLEncoder.encode(fileName,"UTF-8");
        response.setContentType("application/octet-stream");
        response.setHeader("Content-disposition", "attachment;filename=" + fileName);
        response.flushBuffer();
        workbook.write(response.getOutputStream());
    }
}
