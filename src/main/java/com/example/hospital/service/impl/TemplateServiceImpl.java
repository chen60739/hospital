package com.example.hospital.service.impl;

import com.example.hospital.dao.LableMapper;
import com.example.hospital.model.Lable;
import com.example.hospital.service.TemplateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 陈奕璇
 * @date 2020/01/02
 */
@Service
public class TemplateServiceImpl implements TemplateService {

    @Resource
    private LableMapper lableMapper;

    @Override
    public List<Lable> getTreeData() {
        List<Lable> list = lableMapper.selectAll();
        return list;
    }
}
