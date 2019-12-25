package com.example.hospital.service.impl;

import com.example.hospital.dao.DictionaryMapper;
import com.example.hospital.model.Dictionary;
import com.example.hospital.service.QueryService;
import org.springframework.stereotype.Service;

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


    @Override
    public List<Dictionary> findProgramme() {
        return dictionaryMapper.selectProgramme();
    }
}
