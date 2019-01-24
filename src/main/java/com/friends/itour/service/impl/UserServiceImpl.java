package com.friends.itour.service.impl;

import com.friends.itour.core.ret.ServiceException;
import com.friends.itour.core.universal.AbstractService;
import com.friends.itour.dao.UserMapper;
import com.friends.itour.model.Teacher;
import com.friends.itour.model.User;
import com.friends.itour.service.UserService;
import com.friends.itour.util.FtpUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.*;
import java.util.List;

//@Component
@Service
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Value("${ftpHost}")
    private String ftpHost;
    @Value("${ftpUserName}")
    private String ftpUserName;
    @Value("${ftpPassword}")
    private String ftpPassword;
    @Value("${ftpPort}")
    private String ftpPort;

    @Resource
    private UserMapper userMapper;



    public List<User> testMybatis() {
        return userMapper.selectAll();
    }

    public List<User> xinjianwenjian() {
        String ftpPath = "/var/ftp/pub/images/";
        //下载
        //String localPath = "/home/wang/下载/two15392444531.rar";
        //上传
        String localPath = "/home/wang/下载/";
        String fileName = "bb.sql";
        try {
            InputStream input = new ByteArrayInputStream("test ftp jyf".getBytes("GBK"));
            boolean flag = FtpUtil.uploadFile(ftpHost, ftpUserName, ftpPassword, Integer.parseInt(ftpPort), ftpPath, fileName,input);;
            System.out.println(flag);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return userMapper.selectAll();
    }


    public List<User> shangchuan() {
        String ftpPath = "/var/ftp/pub/images/";
        //下载
        //String localPath = "/home/wang/下载/two15392444531.rar";
        //上传
        String localPath = "/home/wang/下载/个人简历王得坤.doc";
        String fileName = "3.doc";
        //上传一个文件
        try{
            FileInputStream in=new FileInputStream(new File(localPath));
            boolean test = FtpUtil.uploadFile(ftpHost, ftpUserName, ftpPassword, Integer.parseInt(ftpPort), ftpPath, fileName,in);
            System.out.println(test);
        } catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println(e);
        }
        return userMapper.selectAll();
    }



    public List<User> shanchu() {
        String ftpPath = "/var/ftp/pub/images/";
        //下载
        //String localPath = "/home/wang/下载/two15392444531.rar";
        //上传
        String localPath = "/home/wang/下载/";
        String fileName = "2.jpg";
        FtpUtil.deleteFile(ftpHost, ftpUserName, ftpPassword, Integer.parseInt(ftpPort),ftpPath,fileName);
        return userMapper.selectAll();
    }



    public List<User> xiazai() {
        String ftpPath = "/var/ftp/pub/images/";
        //下载
        //String localPath = "/home/wang/下载/two15392444531.rar";
        //上传
        String localPath = "/home/wang/下载/";
        String fileName = "3.doc";
        //下载一个文件
        FtpUtil.downloadFtpFile(ftpHost, ftpUserName, ftpPassword, Integer.parseInt(ftpPort), ftpPath, localPath, fileName);
        return userMapper.selectAll();
    }



    public List<User> chongmingming() {
        String ftpPath = "/var/ftp/pub/images/";
        //下载
        //String localPath = "/home/wang/下载/two15392444531.rar";
        //上传
        String localPath = "/home/wang/下载/";
        String fileName = "3.doc";
        String newName = "4.doc";
        //重命名
        FtpUtil.reName(ftpHost, ftpUserName, ftpPassword, Integer.parseInt(ftpPort),ftpPath,fileName,newName);
        return userMapper.selectAll();
    }


    @Override
    public void addUser(User user) {
        userMapper.insert(user);
    }



    /*@Override
    public User findUserByUsernameAndPassword(String userName) {
        User user = userMapper.selectByNameAndPassWord(userName);
        if(user == null){
            throw new ServiceException("暂无该用户");
        }
        return user;
    }

    @Override
    public PageInfo<User> findAllUser(Integer page, Integer size) {
        PageHelper.startPage(page,size);
        List<User> user = userMapper.selectAll();
        PageInfo<User> pageInfo = new PageInfo<>(user);
        return pageInfo;
    }*/
}
