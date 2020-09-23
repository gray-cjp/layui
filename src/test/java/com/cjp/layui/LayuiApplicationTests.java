package com.cjp.layui;

import com.cjp.layui.mbg.mapper.*;
import com.cjp.layui.mbg.model.*;
import com.cjp.layui.service.SchoolinfoService;
import com.cjp.layui.utils.Base64Util;
import com.cjp.layui.utils.CommonUtil;
import com.cjp.layui.utils.DateUtil;
import com.cjp.layui.utils.ZxingUtils;
import com.google.zxing.WriterException;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.XML;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.math.BigDecimal;
import java.net.URL;
import java.net.URLEncoder;
import java.sql.SQLIntegrityConstraintViolationException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LayuiApplicationTests {
    @Autowired
    UserMapper userMapper;
    @Autowired
    SchoolinfoService schoolinfoService;
    @Autowired
    MessageTailCountMapper messageTailCountMapper;
    @Autowired
    HttpServletRequest httpServletRequest;
    @Autowired
    AreaMapper areaMapper;
    @Autowired
    SchoolBillMapper schoolBillMapper;
    @Autowired
    StudentBillMapper studentBillMapper;
    @Test
    public void contextLoads() {
        User user = new User();
        user.setPhone("123354");
        user.setEmail("sadfdg3");
        user.setUsername("zhangsan");
        user.setPassword("asfdsgf43fg");
        user.setCreated(new Date());
        user.setUpdated(new Date());
        try {
            userMapper.insertSelective(user);
        }catch (Exception e){
            if (e.getCause() instanceof SQLIntegrityConstraintViolationException){
                System.out.println("用户名已存在");
                System.out.println(e.getCause().toString());
            }
        }
    }
    public static final String AK= "DWm0rDdbUe8vArpDbP2L6eGzbU1MvpGY";

    //判断选择的日期是否是今天
    public static boolean isToday(long time) {
        return isThisTime(time, "yyyy-MM-dd");
    }

    //判断选择的日期是否是本周
    public static boolean isThisWeek(long time) {
        Calendar calendar = Calendar.getInstance();
        int currentWeek = calendar.get(Calendar.WEEK_OF_YEAR);
        calendar.setTime(new Date(time));
        int paramWeek = calendar.get(Calendar.WEEK_OF_YEAR);
        if (paramWeek == currentWeek) {
            return true;
        }
        return false;
    }


    private static final Double PI = Math.PI;

    private static final Double PK = 180 / PI;

    //判断选择的日期是否是本月
    public static boolean isThisMonth(long time) {
        return isThisTime(time, "yyyy-MM");
    }

    public static boolean isThisTime(long time, String pattern) {
        Date date = new Date(time);
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String param = sdf.format(date);//参数时间
        String now = sdf.format(new Date());//当前时间
        if (param.equals(now)) {
            return true;
        }
        return false;
    }
    @Test
    public void addArea() throws JSONException {
        String s= "[\"https://gjscrm-1256038144.cos.ap-beijing.myqcloud.com/wy/awdaw/1597138666854_1597138658934img.png\",\"https://gjscrm-1256038144.cos.ap-beijing.myqcloud.com/wy/awdaw/1597138669712_1597138661787img.png\"]";
        String replace = s.replace("\"", "");
        replace = replace.replace("[","");
        replace = replace.replace("]","");
        System.out.println(replace);
        System.out.println(!s.contains("_zMZcy"));
    }
    @Test
    public void testDate(){
//       List<String> a =  new ArrayList<>();
    /*    String reg = "^(?!.*\\..*\\.)[\\u4e00-\\u9fa5]([\\u4e00-\\u9fa5\\.]*|[A-Za-z\\.]*)$";
        String name = "李先生1";
        boolean matches = name.matches(reg);
        System.out.println(matches);*/
   /*    a.add("0");

       a.add("1");
       a.add("2");
       a.add("3");
       a.add("4");
       a.add("5");
       a.add("6");
       a.add("7");
       a.add("8");
       a.add("9");
       a.add("10");
       int c = 0/1;
        System.out.println(c);
       int b = (int) Math.ceil(a.size()/5.0);

        for (int i = 0; i < b; i++) {
            if (i==b-1){
                System.out.println(a.subList(i*5,a.size()));
            }else {
                System.out.println(a.subList(i*5,5*(i+1)));
            }
        }*/
      /*  System.out.println(b);
        System.out.println(a.size()/5.0);
        System.out.println(a.subList(0,5));
        System.out.println(a.subList(5,10));
        System.out.println(a.size());*/
    }
    @Test
    public void test() throws ParseException, UnsupportedEncodingException {
     /*   String cnAddress="珠海市南坑市场";
        Map<String,String> map = getLatitude(cnAddress);
            if(null != map){
              System.out.println(cnAddress+"    经度:"+map.get("lng")+"    纬度:"+map.get("lat"));
             }*/
     String s1 = "9999999999999999999";
        System.out.println(s1.length());
/*     String s= "https://c-ssl.duitang.com/uploads/item/201511/21/20151121171107_zMZcy.thumb.1000_0.jpeg";
        System.out.println(s.length());*/
      /*  UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        String data = "2020-03-03 10:19:19";
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try {
            Date parse = format2.parse(data);
            criteria.andCreatedEqualTo(parse);
            List<User> users = userMapper.selectByExample(userExample);
            System.out.println(users.toString()+"aaaaaaaaaaaaaaaaaa");
        } catch (ParseException e) {
            e.printStackTrace();
        }*/
  /*      Calendar instance = Calendar.getInstance();
        instance.setTime(new Date());
        instance.add(2,+3);
        instance.set(instance.get(Calendar.YEAR),instance.get(Calendar.MONTH),instance.get(Calendar.DATE));
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(instance.get(Calendar.YEAR)+"年"+(((instance.get(Calendar.MONTH)+1)/3+1)==1?"上半年":"下半年"));
        String format = format2.format(instance.getTime());
        System.out.println(format);*/
   /*     Calendar cal = Calendar.getInstance();
        for (int k = 0; k < 2; k++) {
            cal.set(cal.get(Calendar.YEAR),cal.get(Calendar.MONTH),cal.get(Calendar.DATE));
            double mm =  cal.get(Calendar.MONTH);
            int MM = (int) Math.ceil(mm/6);
            System.out.println(cal.get(Calendar.YEAR)+"年"+(MM==1?"上半年":"下半年"));
            cal.add(2,+6);
        }*/
  /*      Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        Calendar endDate = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = simpleDateFormat.parse("2021-03-17");
        endDate.setTime(parse);
        int month = endDate.get(Calendar.YEAR) *  12  + endDate.get(Calendar.MONTH)  -  (cal.get(Calendar.YEAR)  *  12  +  cal.get(Calendar.MONTH));
            for (int k = 0; k < month; k++) {

                cal.set(cal.get(Calendar.YEAR),cal.get(Calendar.MONTH),cal.get(Calendar.DATE));
                System.out.println(cal.getTime());
                System.out.println(cal.get(Calendar.YEAR)+"年"+(cal.get(Calendar.MONTH)+1)+"月");
                cal.add(2,+1);
            }*/
     /*   Calendar cal = Calendar.getInstance();
        cal.set(cal.get(Calendar.YEAR),cal.get(Calendar.MONTH),cal.get(Calendar.DATE),cal.get(Calendar.HOUR_OF_DAY),cal.get(Calendar.MINUTE),cal.get(Calendar.SECOND));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(simpleDateFormat.format(cal.getTime()));*/
       /*  String anima = "《妖精的尾巴》,《恶魔奶爸》,《海贼王》,《死神》,《火影忍者》,《家庭教师》,《零之使魔》,《妖精旋律》,《最后的大魔王》,《名侦探柯南》,《反叛的鲁路修》,《我的朋友很少》,《问题儿童自异世界》,《异世界的圣机物师》,《little busters》,《fate zero》,《钢之炼金术师》,《sola》,《龙珠》,《传说中勇者的传说》,《会长是女仆大人》,《未闻花名》,《angel beats》,《樱花庄的宠物女孩》,《打工吧！大魔王》,\n" +
                 "《纪录的地平线》,《约会大作战》,《漆黑的子弹》,《刀剑神域》,《游戏人生》,《魔法高校劣等生》,《鬼灭之刃》,《欢迎来到实力至上的教室》,《关于我转生变成斯莱姆这档事》,《辉夜大小姐想让我告白》,《紫罗兰永恒花园》,《从零开始的异世界生活》,《某科学电磁炮》,《overload》,《冰果》,《干物妹！小埋》,《徒然喜欢你》,《命运-冠位指定》,《我的青春物语果然有问题》,《四月是你的谎言》,《异度入侵》,《夏洛特》,《创造主》,《地博少年花子君》,《卫宫家今天的饭》,《境界的彼方》,《宝石之国》,《魔法禁书目录》,《路人超能百分百》,《樱花庄的宠物女孩》,《约定的梦幻岛》,《石纪元》,《超能力女儿》,《阿宅的恋爱真难》,《可塑性记忆》,《夏目友人帐》,《野良神》,《碧蓝之海》,《食战之灵》,《终结的炽天使》,《君主埃尔梅罗二世》,《女高中生的虚度日常》,《男子高中生的日常》,《齐木楠雄的灾难》,《擅长捉弄的高木同学》,《理科生坠入情网》,《日常》,《我的妹妹不可能那么可爱》,《在地下城寻求邂逅是否搞错了》,《会长是女仆大人》,《打工吧魔王大人》,《K》,《天使的心跳》,《我的脑内选项正在全力妨碍学院恋爱喜剧》,《Megalo Box》,《幻界战线》,《甘城光辉游乐园》,《博多豚骨拉面》,《伪恋》,《love live》,《这个美术社大有问题》,《笨蛋测验召唤兽》,《漆黑的子弹》,《你的名字》,《邪神中二少女》,《无头骑士异闻录》,《声之形》,《妖精森林的小不点》,《散华礼弥》,《绯弹的亚里亚》,《索玛丽与森林之神》,《噬神者》,《星之梦》,《轻音少女》,《魔王勇者》,《三月狮子》,《幻想嘉年华》,《狼与香辛料》,《灰与幻想的格林姆加尔》,《魔法少女伊利亚》,《弹丸论破》,《水果篮子》,《clannad》,《同居人是猫》,《虫师》,《进击的巨人》,《宠物小精灵》,《青之驱魔师》,《记录的地平线》,《一周的朋友》,《恋爱随意链》,《重返17岁》,《只有我存在的街道》,《寒蝉鸣泣之时》,《全职猎人》,《凉宫春日的忧郁》,《GJ部》,《三坪房间的侵略者》,《爱杀宝贝》,《迷糊餐厅》,《黑子篮球》,《排球少年》,《血意少年》,《元气少女缘结神》,《南家三姐妹》,《银魂》,《爱书的下克上》,《龙之界点》,《魔笛MAGI》,《斩赤红瞳》,《长门有希的消失》,《命运石之门》,《灰色迷宫》,《麻辣教师》,《食梦者玛利亚》,《飙速宅男》,《维度战记》";
        String[] split = anima.split(",");
        int i = new Random().nextInt(split.length);
        System.out.println(split[i]);*/
//      String a = "2019-3-12";
//        Date parse = format2.parse(a);
//        Date parse1 = format2.parse("2020-03-12");
//        if (isToday(parse.getTime())){
//            System.out.println(true);
//        }else {
//            System.out.println(false);
//        }
//        System.out.println(parse.toString());
//        Date parse = simpleDateFormat.parse()
//        System.out.println(parse.toString());
       /* String data = "2020-03-03 10:19:19";
        List<User> users = userMapper.selectBycreate(data);
        String format = format2.format(users.get(0).getCreated());
        Calendar rightNow = Calendar.getInstance();
        int i = Integer.parseInt(format);
        System.out.println(i);
        for (int j = 1; j <=i ; j++) {
            rightNow.setTime(users.get(0).getCreated());
            rightNow.add(Calendar.DAY_OF_YEAR,1);//日期加10天
            Date time = rightNow.getTime();
            System.out.println(format2.format(time));

        }*/
    }
    @Test
    public void xiaoche()  {
  String info1 ="inputCharset=1&pickupUrl=http://edu.hqneat.com/CampusPay/scanPay/scanPay.do&receiveUrl=http://edu.hqneat.com/CampusPay/unionpay/unionCallBack.do&version=v1.0&language=1&signType=0&merchantId=100020091219001&payerName=全渠道&payerTelephone=13552535506&payerAcctNo=6216261000000000018&payerIdType=01&payerIdNo=341126197709218366&orderNo=20200820180219165999&orderAmount=1&orderCurrency=156&orderDatetime=20200821041938&productName=education&payType=98&issuerId=unionpay&key=1234567890";
  String info2 ="inputCharset=1&pickupUrl=http://edu.hqneat.com/CampusPay/scanPay/scanPay.do&receiveUrl=http://edu.hqneat.com/CampusPay/unionpay/unionCallBack.do&version=v1.0&language=1&signType=0&merchantId=100020091219001&payerName=全渠道&payerTelephone=13552535506&payerAcctNo=6216261000000000018&payerIdType=01&payerIdNo=341126197709218366&orderNo=20200820180219165999&orderAmount=1&orderCurrency=156&orderDatetime=20200821041938&productName=education&payType=98&issuerId=unionpay&key=1234567890";
        int i = info1.indexOf(info2);
        boolean equals = info1.equals(info2);
        System.out.println(i);
        System.out.println(equals);
    }
@Test
public void testPost(){
/*    String url = "http://edu.hqneat.com/education/wemanage/schoolBillDetail.do";
    net.sf.json.JSONObject json = new net.sf.json.JSONObject();
    json.put("openid","ouviQ4ptQK04uNg7_9tdCRJ7JFqw");
    json.put("userid","397");
    json.put("schoolid","273");
    json.put("billid","7522");
    json.put("name","");
    json.put("institutionaltype","1");
    net.sf.json.JSONObject res = CommonUtil.httpsRequest(url, "POST", json.toString());*/
    byte[] decode = Base64Util.decode("08TTmo/0a6CETgtq2yI8UdElcFKHFqcsTW57zWGLAI/Kv4HIa2QJln8yFxqE72XcTVTqe58GJEsE8ahriYWCfIdnODqJzIIHU7kPbfezuIKxz9nIsFiOjUQnh1sOcjByr/sn0jaOBmKh/e7JEI78dlff7+k8K8GDxfHxC7EgIFI=");
    String s = decode.toString();
    System.out.println(s);
}

    public static String sensitiveName(String name){
        String tail = "";
        if (name.indexOf("(非在册)") != -1){
            name = name.substring(0,name.length()-5);
            tail = "(非在册)";
        }
        if(name!=null&&!"".equals(name)){
            if(name.length()==2){
                name=name.substring(0, 1)+"*";
            }
            if(name.length()>2){
                String a = "";
                for (int i = 0; i < name.length() - 2; i++) {
                    a += "*";
                }
                name=name.substring(0, 1)+a+name.substring(name.length()-1,name.length());
            }
        }
        return name+tail;
    }
    @Test
    public void getLocation(){
        List<Map<String,Object>> schoolinfoList = schoolinfoService.selectAll();
        List<Map<String,String>> mapList = new ArrayList<>();
        List<Long> id = new ArrayList<>();
        for (int i = 0; i < schoolinfoList.size(); i++) {
            Map<String, String> address = getLatitude(schoolinfoList.get(i).get("address").toString());
            if (address != null){
                address.put("id",schoolinfoList.get(i).get("schoolid").toString());
            }
            boolean add = mapList.add(address);
            if (!add){
                id.add((Long) schoolinfoList.get(i).get("schoolid"));
            }
        }
        System.out.println(mapList);
        schoolinfoService.updateBatch(mapList);
    }
    public static boolean isMobile(String str){
        Pattern p = null;
        Matcher m = null;
        boolean b = false;
        p = Pattern.compile("^[1][3,4,5,7,8][0-9]{9}$"); // 验证手机号
        m = p.matcher(str);
        b = m.matches();
        return b;
    }

    /**
     * 赤道半径
     */
//    private static double EARTH_RADIUS = 6378.137;

    private static double rad(double d) {
        return d * Math.PI / 180.0;
    }

    /**
     * Description : 通过经纬度获取距离(单位：米)
     * Group :
     *
     * @param originLon      出发点经度
     * @param originLat      出发点纬度
     * @param destinationLon 目的地经度
     * @param destinationLat 目的地纬度
     * @return double
     * @author cjp
     * @date 2019/2/15 0015 9:14
     */
    public static double getDistance(String originLon, String originLat, String destinationLon, String destinationLat) {
        double radLat1 = rad(Double.parseDouble(originLat));
        double radLat2 = rad(Double.parseDouble(destinationLat));
        double a = radLat1 - radLat2;
        double b = rad(Double.parseDouble(originLon)) - rad(Double.parseDouble(destinationLon));
        double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2)
                + Math.cos(radLat1) * Math.cos(radLat2)
                * Math.pow(Math.sin(b / 2), 2)));
        s = s * EARTH_RADIUS;
        // 保留两位小数
        s = Math.round(s * 100d) / 100d;
        s = s * 1000;
        return s;
    }
    @Test
    public void test1(){
        Map<String, String> latitude = getLatitude("广东省珠海市香洲区新镜一街");
        System.out.println(latitude.toString());
    }
    public static Map<String, String> getLatitude(String address) {
        try {
            address = URLEncoder.encode(address, "UTF-8");          //将地址转换成utf-8的16进制
            //2, 拼写发送http请求的url，注意需使用第一步申请的ak。
            //3, 接收http请求返回的数据（支持json和xml格式）本次采用json形式
            URL resjson = new URL("http://api.map.baidu.com/geocoding/v3/?address=" + address + "&output=json&ak=" + AK);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(resjson.openStream()));
            String res;
            StringBuilder sb = new StringBuilder("");
            while ((res = in.readLine()) != null) {
                sb.append(res.trim());
            }
            in.close();
            String str = sb.toString();
            //System.out.println("return json:"+str);
            Map<String, String> map = null;
            if (str != null) {
                int lngStart = str.indexOf("lng\":");
                int lngEnd = str.indexOf(",\"lat");
                int latEnd = str.indexOf("},\"precise");
                if (lngStart > 0 && lngEnd > 0 && latEnd > 0) {
                    String lng = str.substring(lngStart + 5, lngEnd);
                    String lat = str.substring(lngEnd + 7, latEnd);
                    map = new HashMap<String, String>();
                    map.put("lng", lng);
                    map.put("lat", lat);
                    return map;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    @Test
    public void gettest(){
//        double distance = getDistance("22.283553029138916", "113.57196502221777", "22.282183290683855", "113.57311745835612");
        double distance = getDistance("113.57196502221777", "22.283553029138916", "113.57311745835612", "22.282183290683855");
//        double distance = getDistanceFromTwoPoints(113.45729174254885, 22.212872444301167, 113.57872234575324, 22.289854002315356);
        System.out.println(distance/1000+"km");
    }
    public static double getDistanceFromTwoPoints(double lat_a, double lng_a, double lat_b, double lng_b) {
        double t1 = Math.cos(lat_a / PK) * Math.cos(lng_a / PK) * Math.cos(lat_b / PK) * Math.cos(lng_b / PK);
        double t2 = Math.cos(lat_a / PK) * Math.sin(lng_a / PK) * Math.cos(lat_b / PK) * Math.sin(lng_b / PK);
        double t3 = Math.sin(lat_a / PK) * Math.sin(lat_b / PK);

        double tt = Math.acos(t1 + t2 + t3);

        System.out.println("两点间的距离：" + 6366000 * tt + " 米");
        return EARTH_RADIUS * tt;
    }
    // 地球半径
    private static final double EARTH_RADIUS = 6370996.81;

    public static double distanceOfTwoPoints(double lat1, double lng1, double lat2, double lng2) {
        double radLat1 = radian(lat1);
        double radLat2 = radian(lat2);
        double a = radLat1 - radLat2;
        double b = radian(lng1) - radian(lng2);
        double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2)
                + Math.cos(radLat1) * Math.cos(radLat2) * Math.pow(Math.sin(b / 2), 2)));
        s = s * EARTH_RADIUS;
        s = Math.round(s * 10000) / 10000;
        double ss = s * 1.0936132983377;
        System.out.println("两点间的距离是：" + s + "米" + "," + (int) ss + "码");
        return s;
    }
    private static double radian(double d) {
        return d * Math.PI / 180.0;
    }
}
