package com.friends.itour.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class User {
    @Id
    private Integer user_id;
    @Column(name="user_name")
    private String user_name;
    @Column(name="user_nick_name")
    private String user_nick_name;
    @Column(name="user_birthday")
    private Date user_birthday;
    @Column(name="user_idcard")
    private  Integer user_idcard;
    @Column(name="user_mobile")
    private  Integer user_mobile;
    @Column(name="user_email")
    private  String user_email;
    @Column(name="user_qq")
    private  Integer user_qq;
    @Column(name="user_wechat")
    private  String user_wechat;
    @Column(name="user_origin")
    private  String user_origin;
    @Column(name="user_origin")
    private  String user_address;
    @Column(name="encrypted_user_password")
    private  String encrypted_user_password;
    @Column(name="user_creation_date")
    private  Date user_creation_date;
    @Column(name="user_created_by")
    private  String user_created_by;
    @Column(name="user_last_update_date")
    private  Date user_last_update_date;
    @Column(name="user_last_updated_by")
    private  String user_last_updated_by;
    @Column(name="user_type")
    private  Integer user_type;
    @Column(name="user_status")
    private  String user_status;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_nick_name() {
        return user_nick_name;
    }

    public void setUser_nick_name(String user_nick_name) {
        this.user_nick_name = user_nick_name;
    }

    public Date getUser_birthday() {
        return user_birthday;
    }

    public void setUser_birthday(Date user_birthday) {
        this.user_birthday = user_birthday;
    }

    public Integer getUser_idcard() {
        return user_idcard;
    }

    public void setUser_idcard(Integer user_idcard) {
        this.user_idcard = user_idcard;
    }

    public Integer getUser_mobile() {
        return user_mobile;
    }

    public void setUser_mobile(Integer user_mobile) {
        this.user_mobile = user_mobile;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public Integer getUser_qq() {
        return user_qq;
    }

    public void setUser_qq(Integer user_qq) {
        this.user_qq = user_qq;
    }

    public String getUser_wechat() {
        return user_wechat;
    }

    public void setUser_wechat(String user_wechat) {
        this.user_wechat = user_wechat;
    }

    public String getUser_origin() {
        return user_origin;
    }

    public void setUser_origin(String user_origin) {
        this.user_origin = user_origin;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public String getEncrypted_user_password() {
        return encrypted_user_password;
    }

    public void setEncrypted_user_password(String encrypted_user_password) {
        this.encrypted_user_password = encrypted_user_password;
    }

    public Date getUser_creation_date() {
        return user_creation_date;
    }

    public void setUser_creation_date(Date user_creation_date) {
        this.user_creation_date = user_creation_date;
    }

    public String getUser_created_by() {
        return user_created_by;
    }

    public void setUser_created_by(String user_created_by) {
        this.user_created_by = user_created_by;
    }

    public Date getUser_last_update_date() {
        return user_last_update_date;
    }

    public void setUser_last_update_date(Date user_last_update_date) {
        this.user_last_update_date = user_last_update_date;
    }

    public String getUser_last_updated_by() {
        return user_last_updated_by;
    }

    public void setUser_last_updated_by(String user_last_updated_by) {
        this.user_last_updated_by = user_last_updated_by;
    }

    public Integer getUser_type() {
        return user_type;
    }

    public void setUser_type(Integer user_type) {
        this.user_type = user_type;
    }

    public String getUser_status() {
        return user_status;
    }

    public void setUser_status(String user_status) {
        this.user_status = user_status;
    }
}
