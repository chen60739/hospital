package com.example.hospital.service;

import com.example.hospital.model.Lable;

import java.util.List;

/**
 * @author 陈奕璇
 * @date 2020/01/09
 */
public interface LableService {
    List<Lable> getLablesByTempId(Integer tempId);
}
