package com.cjp.layui.config;

import com.cjp.layui.mbg.model.User;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Granh {
    public static void main(String[] args) {
/*        List<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        strings.add("5");
        int i = strings.indexOf("3");
        System.out.println(i);
        strings.remove("3");
//        strings.remove(2);
        System.out.println(strings.toString());*/
        String a= "sadasf公司afdljgfl公司sakfjdljgl公司dklsgjfdkl";
       String b =  a.replace("公司","商场");
        System.out.println(b);
    }
}
