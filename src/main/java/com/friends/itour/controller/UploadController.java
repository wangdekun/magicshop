package com.friends.itour.controller;

import com.friends.itour.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/upload")
public class UploadController {
    @Autowired
    private UploadService uploadService;

    @RequestMapping(value = "/Shangchuan", method = {RequestMethod.GET, RequestMethod.POST})
    public void  Shangchuan(@RequestBody  String localpath) {
        uploadService.Shangchuan(localpath);


    }
}
