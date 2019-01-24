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
    @Column(name="user_sex")
    private String userSex;
    @Column(name="user_head_portrait")
    private  String userHeadPortrait;
    @Column(name="user_birthday")
    private Date userBirthday;
    @Column(name="user_password")
    private  String userPassword;
    @Column(name="user_real_name")
    private String userRealName;
    @Column(name="user_id_card")
    private  Integer userIdcard;
    @Column(name="user_mobile")
    private  Integer userMobile;
    @Column(name="user_email")
    private  String userEmail;
    @Column(name="user_qq")
    private  Integer userQq;
    @Column(name="user_wechat")
    private  String userWechat;
    @Column(name="user_type")
    private  Integer userType;
    @Column(name="user_status")
    private  String userStatus;
    @Column(name="user_activity")
    private  String userActivity;
    @Column(name="user_creation_date")
    private  Date userCreationDate;
    @Column(name="user_created_by")
    private  String userCreatedBy;
    @Column(name="user_last_update_date")
    private  Date userLastUpdateDate;
    @Column(name="user_last_updated_by")
    private  String userLastUpdatedBy;

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

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserHeadPortrait() {
        return userHeadPortrait;
    }

    public void setUserHeadPortrait(String userHeadPortrait) {
        this.userHeadPortrait = userHeadPortrait;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
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

    public String getUserActivity() {
        return userActivity;
    }

    public void setUserActivity(String userActivity) {
        this.userActivity = userActivity;
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
//    {
//        "userId":4,
//            "userCode":005,
//            "encryptedUserPassword":"qwerty"
//    }

}
