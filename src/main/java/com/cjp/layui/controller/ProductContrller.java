package com.cjp.layui.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.cjp.layui.dto.PageInfo;
import com.cjp.layui.mbg.mapper.SurveyMapper;
import com.cjp.layui.service.ProductService;
import com.sun.deploy.net.URLEncoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.*;

@Controller
@RequestMapping("product")
public class ProductContrller {
    public static Logger log = LoggerFactory
            .getLogger(ProductContrller.class);
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
    @PostMapping(path = "/upload")
    public ResponseEntity<?> upload(MultipartHttpServletRequest request) throws Exception {
        Map<String, MultipartFile> fileMap = request.getFileMap();
        for (Map.Entry<String, MultipartFile> part : fileMap.entrySet()) {
            InputStream inputStream = part.getValue().getInputStream();
            Map<Integer, String> head = new HashMap<>();
            List<Map<Integer, String>> data = new LinkedList<>();
            EasyExcel.read(inputStream).sheet()
                    .registerReadListener(new AnalysisEventListener<Map<Integer, String>>() {

                        @Override
                        public void invokeHeadMap(Map<Integer, String> headMap, AnalysisContext context) {
                            head.putAll(headMap);
                        }

                        @Override
                        public void invoke(Map<Integer, String> row, AnalysisContext analysisContext) {
                            data.add(row);
                        }

                        @Override
                        public void doAfterAllAnalysed(AnalysisContext analysisContext) {
                            log.info("读取文件[{}]成功,一共:{}行......", part.getKey(), data.size());
                        }
                    }).doRead();
            // 其他业务逻辑
            System.out.println(head.toString());
            log.info(head.toString());
            for (Map<Integer, String> map: data) {
                System.out.println(map.toString());
                log.error("data",map.toString());
            }
        }
        return ResponseEntity.ok("success");
    }
    @GetMapping(path = "/download")
    public void download(HttpServletResponse response) throws Exception {
        // 这里文件名如果涉及中文一定要使用URL编码,否则会乱码
        String fileName = URLEncoder.encode("文件名.xlsx", StandardCharsets.UTF_8.toString());
        // 封装标题行
        ArrayList<String> title = new ArrayList<>();
        title.add("ID");
//        title.add("电话");
//        title.add("快递单号");
        List<List<String>> head = new ArrayList<>();
        head.add(title);
        ArrayList<String> title1 = new ArrayList<>();
        title1.add("电话");
        head.add(title1);
        ArrayList<String> title2 = new ArrayList<>();
        title2.add("快递单号");
        head.add(title2);
        // 封装数据
       List<Map<String, String>> maps = surveyMapper.selectAll();

        List<List<String>> data =new ArrayList<>();
        for (Map<String, String> map:maps) {
            Collection<String> values = map.values();
            ArrayList<String> strings = new ArrayList<String>(values);
            data.add(strings);
        }
//        ArrayList<String> list = new ArrayList<>();
//        list.add("1");
//        list.add("222");
//        list.add("1333");
//        data.add(list);
        response.setContentType("application/force-download");
        response.setHeader("Content-Disposition", "attachment;filename=" + fileName);
        EasyExcel.write(response.getOutputStream())
                .head(head)
                .autoCloseStream(true)
                .excelType(ExcelTypeEnum.XLSX)
                .sheet("test")
                .doWrite(data);
    }
}
