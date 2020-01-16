package com.example.hospital.service.impl;

import com.example.hospital.dao.DictionaryMapper;
import com.example.hospital.model.Dictionary;
import com.example.hospital.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author 陈云强
 * @data 2020/01/14
 */
@Service
public class DictionaryServiceImpl implements DictionaryService {

    @Resource
    private DictionaryMapper dictionaryMapper;

    @Override
    public List<Dictionary> getDisease() {
        return dictionaryMapper.getDisease();
    }
}
