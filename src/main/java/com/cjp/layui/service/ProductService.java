package com.cjp.layui.service;

import com.cjp.layui.mbg.model.User;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

public interface ProductService {
    PageInfo<Map<String, Object>> selectProdctList(String page, String pageSize);

    int selectCount();

    int test(User user);
}
