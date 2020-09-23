package com.cjp.layui.service;

import com.cjp.layui.mbg.model.Schoolinfo;

import java.util.List;
import java.util.Map;

public interface SchoolinfoService {
    List<Map<String,Object>> selectAll();

    int updateBatch(List<Map<String, String>> mapList);
}
