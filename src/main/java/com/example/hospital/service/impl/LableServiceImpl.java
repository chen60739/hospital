package com.example.hospital.service.impl;

import com.example.hospital.dao.LableMapper;
import com.example.hospital.model.Lable;
import com.example.hospital.service.LableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 陈奕璇
 * @date 2020/01/09
 */
@Service
public class LableServiceImpl implements LableService {

    @Resource
    private LableMapper lableMapper;

    @Override
    public List<Lable> getLablesByTempId(Integer tempId) {
        List<Lable> lables = lableMapper.selectSome(tempId);
        return lables;
    }
}
