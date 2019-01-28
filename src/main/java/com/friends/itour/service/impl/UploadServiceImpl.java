package com.friends.itour.service.impl;

import com.friends.itour.file.FileFilter;
import com.friends.itour.service.UploadService;
import com.friends.itour.util.FtpUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.UUID;
@Service
@Component
public class UploadServiceImpl implements UploadService {
    @Value("${ftpHost}")
    private String ftpHost;
    @Value("${ftpUserName}")
    private String ftpUserName;
    @Value("${ftpPassword}")
    private String ftpPassword;
    @Value("${ftpPort}")
    private String ftpPort;
    @Override
    public void Shangchuan(FileFilter fileFilter) {
        String uuid = UUID.randomUUID().toString();
        String ftpPath = "/var/ftp/pub/images/";
        //下载
        //String localPath = "/home/wang/下载/two15392444531.rar";
        //上传
        //String localPath = "";
        String fileName = uuid+".jpg";
        //上传一个文件
        try{
            System.err.println();
            FileInputStream in=new FileInputStream(new File(fileFilter.getLocalPath()));
            boolean test = FtpUtil.uploadFile(ftpHost, ftpUserName, ftpPassword, Integer.parseInt(ftpPort), ftpPath, fileName,in);
            System.out.println(test);
        } catch (
                FileNotFoundException e){
            e.printStackTrace();
            System.out.println(e);
        }
    }
}
