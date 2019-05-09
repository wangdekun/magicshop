//package com.friends.itour.controller;
//
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping(value = "/send")
//public class SendMessageController {
//    @RequestMapping(value = "/message.json", method = {RequestMethod.GET, RequestMethod.POST})
//    public static void main(String[] args) {
//        String corpId="wx76318300d04dcd0d";
//        String corpsecret="c01d69c2fcd6b1b04535188a37a03494";//这个是小应用的Secret值，自己查询，在企业微信中可以找到
//        String token= com.utils.WeixinUtil.getAccess_token("https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid="+corpId+"&corpsecret="+corpsecret+"");
//        String username="xiaoming";//你需要发送的对象，必须是微信账号
//        String message="HelloWorld";//你需要发送的内容
//        com.utils.WeixinUtil.sendMessage(token,username,message);
//    }
//}
