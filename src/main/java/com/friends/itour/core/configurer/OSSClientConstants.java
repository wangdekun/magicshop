package com.friends.itour.core.configurer;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OSSClientConstants {
    //阿里云API的外网域名
    public static final String ENDPOINT = "http://oss-cn-beijing.aliyuncs.com";
    //阿里云API的密钥Access Key ID
    public static final String ACCESS_KEY_ID = "LTAIuYA4QuPtByhH";
    //阿里云API的密钥Access Key Secret
    public static final String ACCESS_KEY_SECRET = "7BgW7JTrf2qY7lKCTC8YKD1pHPrxD5";
    //阿里云API的bucket名称
    public static final String BACKET_NAME = "fileedit";
    //阿里云API的文件夹名称
    public static final String FOLDER="test/";
    public static final String FOLDER_VIDEO="test/";
    public static final String FORMAT = new SimpleDateFormat("yyyyMMdd").format(new Date());
    public static final String FORMATS = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
}