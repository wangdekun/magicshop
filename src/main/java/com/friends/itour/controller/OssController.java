package com.friends.itour.controller;

import com.alibaba.fastjson.JSON;
import com.aliyun.oss.OSSClient;
import com.friends.itour.util.AliyunOSSClientUtil;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * oss文件服务器接口
 */

@RestController
@RequestMapping(value = "/oss")
public class OssController {
    @RequestMapping(value = "/ossshangchuan.json", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String uploadFile(@RequestParam(value = "myFileName", required = false) MultipartFile cardFile, HttpServletRequest request, HttpServletResponse response) throws Exception{
        AliyunOSSClientUtil t = new AliyunOSSClientUtil();
        // 初始化OSSClient
        OSSClient ossClient = AliyunOSSClientUtil.getOSSClient();
        // 上传文件
        String user_id = "image";
        //为了返回url给前端（这是wangeditor返回的类型）
        Map map=new HashMap();
        // 获取文件名
        String fileName = cardFile.getOriginalFilename();
        // 获取文件后缀
        String prefix = fileName.substring(fileName.lastIndexOf("."));
        // 用当前时间作为文件名，防止生成的临时文件重复
        String url="";
        try {
            //把MultipartFile转乘File
            File file = File.createTempFile(System.currentTimeMillis() + "", prefix);
            cardFile.transferTo(file);
            url = AliyunOSSClientUtil.upload(file,user_id);
            map.put("url",url);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return JSON.toJSONString(map);
    }
}
