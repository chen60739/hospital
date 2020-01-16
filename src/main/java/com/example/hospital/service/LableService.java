package com.example.hospital.service;

import com.example.hospital.model.Lable;

import java.util.List;
import java.util.Map;

/**
 * @author 陈奕璇
 * @date 2020/01/09
 */
public interface LableService {
    /**
     * 查找某个模板所包含的标签
     * @param tempId
     * @return
     */
    List<Lable> getLablesByTempId(Integer tempId);

    /**
     * 获取一级标签
     * @return
     */
    List<Lable> getOneLevelLable();

    /**
     * 审批术语
     * @param lable
     * @return
     */
    Map<String,String> updateLable(Lable lable);
}
