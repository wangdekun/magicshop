package com.friends.itour.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
//用户通性表
@Entity
@Table(name="SYS_USER")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class User {
    @Id
    @Column(name="user_id")
    private Integer userId;
    @Column(name="user_code")
    private Integer userCode;
    @Column(name="user_name")
    private String userName;
    @Column(name="user_nick_name")
    private String userNickName;
    @Column(name="user_birthday")
    private Date userBirthday;
    @Column(name="user_sex")
    private String userSex;
    @Column(name="user_idcard")
    private  Integer userIdcard;
    @Column(name="user_mobile")
    private  Integer userMobile;
    @Column(name="user_email")
    private  String userEmail;
    @Column(name="user_qq")
    private  Integer userQq;
    @Column(name="user_wechat")
    private  String userWechat;
    @Column(name="user_origin")
    private  String userOrigin;
    @Column(name="user_address")
    private  String userAddress;
    @Column(name="encrypted_user_password")
    private  String encryptedUserPassword;
    @Column(name="user_creation_date")
    private  Date userCreationDate;
    @Column(name="user_created_by")
    private  String userCreatedBy;
    @Column(name="user_last_update_date")
    private  Date userLastUpdateDate;
    @Column(name="user_last_updated_by")
    private  String userLastUpdatedBy;
    @Column(name="user_type")
    private  Integer userType;
    @Column(name="user_status")
    private  String userStatus;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserCode() {
        return userCode;
    }

    public void setUserCode(Integer userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public Integer getUserIdcard() {
        return userIdcard;
    }

    public void setUserIdcard(Integer userIdcard) {
        this.userIdcard = userIdcard;
    }

    public Integer getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(Integer userMobile) {
        this.userMobile = userMobile;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Integer getUserQq() {
        return userQq;
    }

    public void setUserQq(Integer userQq) {
        this.userQq = userQq;
    }

    public String getUserWechat() {
        return userWechat;
    }

    public void setUserWechat(String userWechat) {
        this.userWechat = userWechat;
    }

    public String getUserOrigin() {
        return userOrigin;
    }

    public void setUserOrigin(String userOrigin) {
        this.userOrigin = userOrigin;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getEncryptedUserPassword() {
        return encryptedUserPassword;
    }

    public void setEncryptedUserPassword(String encryptedUserPassword) {
        this.encryptedUserPassword = encryptedUserPassword;
    }

    public Date getUserCreationDate() {
        return userCreationDate;
    }

    public void setUserCreationDate(Date userCreationDate) {
        this.userCreationDate = userCreationDate;
    }

    public String getUserCreatedBy() {
        return userCreatedBy;
    }

    public void setUserCreatedBy(String userCreatedBy) {
        this.userCreatedBy = userCreatedBy;
    }

    public Date getUserLastUpdateDate() {
        return userLastUpdateDate;
    }

    public void setUserLastUpdateDate(Date userLastUpdateDate) {
        this.userLastUpdateDate = userLastUpdateDate;
    }

    public String getUserLastUpdatedBy() {
        return userLastUpdatedBy;
    }

    public void setUserLastUpdatedBy(String userLastUpdatedBy) {
        this.userLastUpdatedBy = userLastUpdatedBy;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }


//    {
//        "userId":4,
//            "userCode":005,
//            "encryptedUserPassword":"qwerty"
//    }

}
