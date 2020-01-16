package com.example.hospital.service;

import com.example.hospital.model.Dictionary;

import java.util.List;

/**
 * @Author 陈云强
 * @data 2020/01/14
 */
public interface DictionaryService {

    /**
     * 查询疾病和疾病编码的回显
     * @return
     */
    List<Dictionary> getDisease();
}
