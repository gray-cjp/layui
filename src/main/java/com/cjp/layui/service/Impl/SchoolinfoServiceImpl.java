package com.cjp.layui.service.Impl;

import com.cjp.layui.mbg.mapper.SchoolinfoMapper;
import com.cjp.layui.mbg.model.Schoolinfo;
import com.cjp.layui.service.SchoolinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class SchoolinfoServiceImpl implements SchoolinfoService {
    @Autowired
    SchoolinfoMapper schoolinfoMapper;
    @Override
    @Transactional
    public List<Map<String,Object>> selectAll() {
        List<Map<String,Object>> schoolinfoList = schoolinfoMapper.selectAll();
        return schoolinfoList;
    }

    @Override
    @Transactional
    public int updateBatch(List<Map<String, String>> mapList) {
        schoolinfoMapper.updateBatch(mapList);
        return 0;
    }
}
