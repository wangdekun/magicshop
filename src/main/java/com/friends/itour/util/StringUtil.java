package com.friends.itour.util;

import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StringUtil {
	 
	public static String getFixedSizeString (String string, int strCount) {
		if (string != null && string.length() > strCount){
			string = string.substring(0, strCount);
		}
		return string;
	}
	
	public static String leftPadforByte (String string, int size, char padChar) throws UnsupportedEncodingException {
		int byteLength = string.getBytes("UTF-8").length;
		String newString = "";
		if (byteLength > size) {
			newString = string.substring(0, size/byteLength);
		} else {
			newString = string;
			for (int i = 0; i < size - byteLength; i++) {
				newString = padChar + newString;
			}
		}
		return newString;
	} 
	
	/**
	 * java去除字符串中的前后空格、回车、换行符、制表符 
	 */
	public static String replaceBlank(String inStr)
	{
	   Pattern p = Pattern.compile("\t|\r|\n");
	   Matcher m = p.matcher(inStr);
	   String afStr = (m.replaceAll("")).trim();
	   return afStr;
	} 
	
	/**
	 * 为字符左边位补字符
	 * @param value 需要补的值
	 * @param str	需要补的字符
	 * @param length 补完字符后一共的长度
	 * @return
	 */
	public static String lampLeft(String value, String str, int length) {
		String rtnValue = value;
		if (value == null) {
			return "";
		}
		if (length - value.length() <= 0) {
			return value;
		}

		for (int i = 0; i < length - value.length(); i++) {
			rtnValue = str + rtnValue;
		}
		return rtnValue;
	}

	
	
	/**
	 * 生成count位的随机码
	 * @param count
	 * @return
	 */
	public static String generateRandomNumber(Integer count){
		return org.apache.commons.lang.RandomStringUtils.random(
				count, false, true);
	}
	

	

	public static boolean isEmpty(String str){
		
		if(str == null || "".equals(str.trim()) || str.trim().equals("null")){
			return true;
		}
		return false;
	}
	public static void main(String[] args){
		
	}
	
	/**
     * 
    * map转换json.
    * <br>详细说明
    * @param map 集合
    * @return
    * @return String json字符串
    * @throws
    * @author slj
     */
    public static String mapToJson(Map<String, Object> map) {

        Set<String> keys = map.keySet();
        String key = "";
        Object value = "";
        StringBuffer jsonBuffer = new StringBuffer();
        jsonBuffer.append("{");
        for (Iterator<String> it = keys.iterator(); it.hasNext();) {
            key = (String) it.next();
            value = map.get(key);
//            jsonBuffer.append(key + ":" +"\""+ value+"\"");
            jsonBuffer.append("\""+key +"\""+":" + "\""+value+"\"");

            if (it.hasNext()) {
                jsonBuffer.append(",");
            }
        }
        jsonBuffer.append("}");
       

        return jsonBuffer.toString();
}


	/**
	 * 数组转化为 mysql in  字符串
	 * @param str
	 * @return
	 */
	public static String strtoString(String[] str) {
		StringBuffer caseIdsIn = new StringBuffer("");
		for(int i=0;i<str.length;i++){

			if(i!=str.length-1){
				caseIdsIn.append("'"+str[i]+"',");
			}else{
				caseIdsIn.append("'"+str[i]+"'");
			}

		}

		return caseIdsIn.toString();
	}

	public static String strtoString(List<String> str) {
		StringBuffer caseIdsIn = new StringBuffer("");
		for(int i=0;i<str.size();i++){

			if(i!=str.size()-1){
				caseIdsIn.append("'"+str.get(i)+"',");
			}else{
				caseIdsIn.append("'"+str.get(i)+"'");
			}

		}
		return caseIdsIn.toString();
	}

	/**
	 * 通过身份证算性别
	 */
	public static String getGenderByIdCard(String idCard) {
		if (idCard == null || idCard.isEmpty()) {
			return "未知";
		}
		String sCardNum = idCard.substring(16, 17);
		if (Integer.parseInt(sCardNum) % 2 != 0) {
			return "男";
		} else {
			return "女";
		}
	}
}
