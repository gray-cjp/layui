package com.cjp.layui.controller;

import com.cjp.layui.dto.PageInfo;
import com.cjp.layui.mbg.mapper.SurveyMapper;
import com.cjp.layui.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("product")
public class ProductContrller {
    @Autowired
    ProductService productService;
    @Autowired
    SurveyMapper surveyMapper;
    @RequestMapping("productList")
    public String productList(){

        return "product/productList";
    }
    @RequestMapping("addproduct")
    public String addproduct(){

        return "product/addproduct";
    }
    @ResponseBody
    @RequestMapping(value = "getdata",method = RequestMethod.GET)
    public PageInfo getdata(String page,String limit){
        com.github.pagehelper.PageInfo<Map<String, Object>> productList = productService.selectProdctList(page,limit);
        int row = productService.selectCount();
        PageInfo pageInfo = new PageInfo();
        pageInfo.setCount(row);
        pageInfo.setData(productList);
        return pageInfo;
    }
    @ResponseBody
    @RequestMapping("openid")
    public List<String> test(){
        return surveyMapper.selectopenid();
    }
    @ResponseBody
    @RequestMapping("test")
    public String testreturn(long num){
        if (num == 1){
            return "1";
        }
        if (num== 0){
            return "0";
        }
        return "2";
    }
}
