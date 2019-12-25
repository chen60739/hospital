package com.example.hospital.service;

import com.example.hospital.model.Dictionary;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 周津锐
 * @date 2019/12/24
 */
public interface QueryService {
    /**
     * 查询字典里方案信息
     * @return
     */
    List<Dictionary> findProgramme();
}
