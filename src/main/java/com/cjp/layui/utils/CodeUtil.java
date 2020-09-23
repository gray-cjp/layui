package com.cjp.layui.utils;

import org.apache.commons.lang.StringUtils;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.security.spec.InvalidParameterSpecException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CodeUtil {
	private CodeUtil() {
	}

	/**
	 * Byte数组转十六进制字符串字节间不用空格分�?
	 * 
	 * @param b
	 * @return
	 */
	public static String byte2HexString(byte[] b) {
		String ret = "";
		for (int i = 0; i < b.length; i++) {
			String hex = Integer.toHexString(b[i] & 0xFF);
			if (hex.length() == 1) {
				hex = '0' + hex;
			}
			ret += hex.toUpperCase();
		}
		return ret;
	}

	/**
	 * 将指定字符串src，以每两个字符分割转换为16进制形式 如："2B44EFD9" --> byte[]{0x2B, 0x44, 0xEF,
	 * 0xD9}
	 * 
	 * @param src
	 *            String
	 * @return byte[]
	 */
	public static byte[] hexString2Byte(String src) {
		if (src.length() % 2 != 0) {
			src = src + "0";
		}
		byte[] ret = new byte[src.length() / 2];
		byte[] tmp = src.getBytes();
		for (int i = 0; i < (src.length() / 2); i++) {
			ret[i] = uniteBytes(tmp[i * 2], tmp[i * 2 + 1]);
		}
		return ret;
	}

	/**
	 * 将两个ASCII字符合成�?个字节； 如："EF"--> 0xEF
	 * 
	 * @param src0
	 *            byte
	 * @param src1
	 *            byte
	 * @return byte
	 */
	public static byte uniteBytes(byte src0, byte src1) {
		byte _b0 = Byte.decode("0x" + new String(new byte[] { src0 })).byteValue();
		_b0 = (byte) (_b0 << 4);
		byte _b1 = Byte.decode("0x" + new String(new byte[] { src1 })).byteValue();
		byte ret = (byte) (_b0 ^ _b1);
		return ret;
	}
    
	public static String genMercReqNo(){
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault());
		String merc_req_no = format.format(new Date());
		long currenttime=System.currentTimeMillis();
		String currenttimestr= String.valueOf(currenttime);
		String random=String.valueOf((int)((Math.random()*9+1)*1000));
		merc_req_no = merc_req_no +currenttimestr.substring(currenttimestr.length()-2)+random;
		return merc_req_no;
	}
	
	/**
	 * 学校年级排序，先从1到9，再从一到九，最后排其他的
	 * @return
	 */
	public static List<Map<String,Object>> gradeSort(List<Map<String,Object>> list){
		List<Map<String,Object>> sortedList = new ArrayList<Map<String,Object>>();
		String [] sort = {"一","二","三","四","五","六","七","八","九"};
		if(list==null || list.size()<=1){
			return list;
		}
		for(Integer i=1;i<=9;i++){
			String index = i.toString();
			Iterator<Map<String, Object>> iterator = list.iterator();
		    while(iterator.hasNext()){
		    	Map<String,Object> map= iterator.next();
		    	if(map.get("grade")!=null&&map.get("grade").toString().startsWith(index)){
		    		sortedList.add(map);
	//	    		list.remove(map);
		    		iterator.remove();
		    	}
		    }
		}
		
		for(Integer i=0;i<=8;i++){
			String index = sort[i];
			Iterator<Map<String, Object>> iterator = list.iterator();
		    while(iterator.hasNext()){
		    	Map<String,Object> map= iterator.next();
		    	if(map.get("grade")!=null&&map.get("grade").toString().startsWith(index)){
		    		sortedList.add(map);
//		    		list.remove(map);
		    		iterator.remove();
		    	}
		    }
		}
		sortedList.addAll(list);
		return sortedList;
	}
	//姓名脱敏
	//姓名统一打第2个字；
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
				name=name.substring(0, 1)+a+name.substring(name.length()-1);
			}
    	}
    	return name+tail;
    }
    
    //学号脱敏
    //大于等于18位留前4后4，10到18位留前3后3，6到9位留前2后2，3到5位留前1后1，1到2位全展示，这样可以吗
    public static String sensitiveCode(String code){
    	if(code!=null&&!"".equals(code)){
    		if(code.length()>=3 && code.length()<=5){
    			code=code.substring(0, 1)+code.substring(1,code.length()-1).replaceAll(".", "*")+code.substring(code.length()-1);
    		}
    		if(code.length()>=6 && code.length()<=9){
    			code=code.substring(0, 2)+code.substring(2,code.length()-2).replaceAll(".", "*")+code.substring(code.length()-2);
    		}
    		if(code.length()>=10 && code.length()<18){
    			code=code.substring(0, 3)+code.substring(3,code.length()-3).replaceAll(".", "*")+code.substring(code.length()-3);
    		}
    		if(code.length()>=18){
    			code=code.substring(0, 4)+code.substring(4,code.length()-4).replaceAll(".", "*")+code.substring(code.length()-4);
    		}
    	}
    	return code;
    }
    //学校名脱敏
    public static String sensitiveSchoolName(String name){
    	if(name!=null&&!"".equals(name)){
    		if(name.length()>=3){
    			name="***"+name.substring(3);
    		}
    		
    	}
    	return name;
    }
	//姓名脱敏
    public static String sensitive(String name){
    	if(name!=null&&!"".equals(name)){
    		if(name.length()==2){
    			name=name.substring(0, 1)+"*";
    		}
    		if(name.length()>2){
    			name=name.substring(0, 1)+name.substring(1, name.length()-1).replaceAll(".", "*")+name.substring(name.length()-1);
    		}
    	}
    	return name;
    }

	//姓名脱敏
    public static String sensitivePhone(String phone){
    	if(phone!=null&&!"".equals(phone)){
    		if(phone.trim().length()==11){
    			phone = phone.substring(0,3)+"****"+phone.substring(7,11);
    		}
    		
    	}
    	return phone;
    }
    
	//备注过滤表情
/*	public static String filterEmoji(String source) {
		if(source != null)
		{
			Pattern emoji = Pattern.compile ("[\ud83c\udc00-\ud83c\udfff]|[\ud83d\udc00-\ud83d\udfff]|[\u2600-\u27ff]",Pattern.UNICODE_CASE | Pattern . CASE_INSENSITIVE ) ;
			Matcher emojiMatcher = emoji.matcher(source);
			if ( emojiMatcher.find())
			{
				source = emojiMatcher.replaceAll("*");
				return source ;
			}
			return source;
		}
		return source;
	}*/

    //随机生成四位手机验证码
    public static String randVerityCode(){
        String[] i = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
    	Random r = new Random();
    	String code = i[r.nextInt(10)]+i[r.nextInt(10)]+i[r.nextInt(10)]+i[r.nextInt(10)];
        return code;
    }
   public static Map<String,Object> resMap(String returnCode,String errorTips){
	   Map<String,Object> map = new HashMap<>();
	   map.put("returnCode", returnCode);
	   if(!StringUtils.isBlank(errorTips)){
		   map.put("errorTips", errorTips);
	   }
     return map;
   }
   
   

/*   public static JSONObject getUserInfo(String encryptedData,String sessionkey,String iv){
       // 被加密的数据
       byte[] dataByte = Base64.decode(encryptedData);
       // 加密秘钥
       byte[] keyByte = Base64.decode(sessionkey);
       // 偏移量
       byte[] ivByte = Base64.decode(iv);
       try {
              // 如果密钥不足16位，那么就补足.  这个if 中的内容很重要
           int base = 16;
           if (keyByte.length % base != 0) {
               int groups = keyByte.length / base + (keyByte.length % base != 0 ? 1 : 0);
               byte[] temp = new byte[groups * base];
               Arrays.fill(temp, (byte) 0);
               System.arraycopy(keyByte, 0, temp, 0, keyByte.length);
               keyByte = temp;
           }
           // 初始化
           Security.addProvider(new BouncyCastleProvider());
           Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding","BC");
           SecretKeySpec spec = new SecretKeySpec(keyByte, "AES");
           AlgorithmParameters parameters = AlgorithmParameters.getInstance("AES");
           parameters.init(new IvParameterSpec(ivByte));
           cipher.init(Cipher.DECRYPT_MODE, spec, parameters);// 初始化
           byte[] resultByte = cipher.doFinal(dataByte);
           if (null != resultByte && resultByte.length > 0) {
               String result = new String(resultByte, StandardCharsets.UTF_8);
               System.out.println(result);
               return JSON.parseObject(result);
           }
       } catch (NoSuchAlgorithmException e) {
           e.printStackTrace();
       } catch (NoSuchPaddingException e) {
           e.printStackTrace();
       } catch (InvalidParameterSpecException e) {
           e.printStackTrace();
       } catch (IllegalBlockSizeException e) {
           e.printStackTrace();
       } catch (BadPaddingException e) {
           e.printStackTrace();
       } catch (InvalidKeyException e) {
           e.printStackTrace();
       } catch (InvalidAlgorithmParameterException e) {
           e.printStackTrace();
       } catch (NoSuchProviderException e) {
           e.printStackTrace();
       }
       return null;
   }*/
   public static void main(String[] args) {
//	   JSONObject userInfo = getUserInfo("9sjZ6/r3BXtfx8CGBhojCwHclT2MX6FI4OMl0HnfRGWNNQV2LdotcrNy+CjkiUTT1pKqM+jOnGl1l/TQS+2q9GO8pBiGANcoHvK5lkvcSX5f+O7Z08pJXhXuB6pob9XOEJOE04ITYIWz+6E98hDBOLQAizqfGmFRM6FkWHVUqOd5TbF4+D5Fytb7u7GSQ0ns2kmbJdO8K7WPKd5VZmM/4LJfhMS2fDLzLE3gYLMnlJMX1D5u8ZW2y3VikkmOMsWmmm1BYKCFiDf6V73UqiVOman33e+PNGk6uD2vzvCGLybxj3Zh/5W4vgJx6i6KbhMo2sXHDoFrWoZBZwDGY9GUUOkanO/drLGjo9set1QXUrrpT/K5w3odx7BC1/lvh9zYkk5uJ/uM8W1CYpAkGmpDm9p6HD6tAP35ZOMoYvO0WYqkF3mLVycJ4bN6mTuo7QBlQZKzxPo0ipD3gC97kuVh8nvRNUMN6lpJCjqubg38RbQ=", "TMxQoW8CLMlyb7yM5dXz0g==", "FrV2yeCrSm3fmtYQKRJfqA==");
//       System.out.println(userInfo.toJSONString());
	   System.out.println(sensitiveCode("1234567890123456789"));
	   System.out.println(sensitivePhone("15600269711"));
   }
}
