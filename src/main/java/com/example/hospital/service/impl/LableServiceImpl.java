package com.example.hospital.service.impl;

import com.example.hospital.dao.LableMapper;
import com.example.hospital.model.Lable;
import com.example.hospital.service.LableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 陈奕璇
 * @date 2020/01/09
 */
@Service
public class LableServiceImpl implements LableService {

    @Resource
    private LableMapper lableMapper;

    @Override
    public Map<String, String> updateLable(Lable lable) {
        lable.setCheckState(true);
        int i = lableMapper.updateByPrimaryKeySelective(lable);
        Map<String,String> res = new HashMap<>();
        if (i==1){
            res.put("mes","成功");
        }else{
            res.put("mes","失败");
        }
        return res;
    }

    @Override
    public List<Lable> getOneLevelLable() {
        List<Lable> list = lableMapper.selectOneLevel();
        return list;
    }

    @Override
    public List<Lable> getLablesByTempId(Integer tempId) {
        List<Lable> lables = lableMapper.selectSome(tempId);
        return lables;
    }
}
