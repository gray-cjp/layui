package com.cjp.layui.service.Impl;

import com.cjp.layui.mbg.mapper.PmsProductMapper;
import com.cjp.layui.mbg.mapper.UserMapper;
import com.cjp.layui.mbg.model.User;
import com.cjp.layui.service.ProductService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    PmsProductMapper pmsProductMapper;
    @Autowired
    UserMapper userMapper;

    @Override
    public  PageInfo<Map<String, Object>> selectProdctList(String page, String pageSize) {
        int pageNo = Integer.parseInt( page== null ? "1" : page);
        int pageSiz = Integer.parseInt(pageSize == null ? "10" : pageSize);
        PageHelper.startPage(pageNo, pageSiz);
        List<Map<String, Object>> mapList = pmsProductMapper.selectProductList();
        PageInfo<Map<String, Object>> pageInfo = new PageInfo<>(mapList);
        return pageInfo;
    }

    @Override
    public int selectCount() {
        return pmsProductMapper.selectCount();
    }

    @Override
    public int test(User user) {
       return userMapper.insertSelective(user);
    }
}
