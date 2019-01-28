package com.friends.itour.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
@Entity
@Table(name="SYS_WALLET")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class WaletEntity {
    @Id
    @Column(name="wallet_id")
    private Integer walletId;
    @Column(name="wallet_code")
    private Integer walletCode;
    private Integer user_code;
    @Column(name="user_alipay")
    private Integer userAlipay;
    @Column(name="user_paycount")
    private Integer userPaycount;
    @Column(name="user_wallet")
    private BigDecimal userWallet;

    public Integer getWalletId() {
        return walletId;
    }

    public void setWalletId(Integer walletId) {
        this.walletId = walletId;
    }

    public Integer getWalletCode() {
        return walletCode;
    }

    public void setWalletCode(Integer walletCode) {
        this.walletCode = walletCode;
    }

    public Integer getUser_code() {
        return user_code;
    }

    public void setUser_code(Integer user_code) {
        this.user_code = user_code;
    }

    public Integer getUserAlipay() {
        return userAlipay;
    }

    public void setUserAlipay(Integer userAlipay) {
        this.userAlipay = userAlipay;
    }

    public Integer getUserPaycount() {
        return userPaycount;
    }

    public void setUserPaycount(Integer userPaycount) {
        this.userPaycount = userPaycount;
    }

    public BigDecimal getUserWallet() {
        return userWallet;
    }

    public void setUserWallet(BigDecimal userWallet) {
        this.userWallet = userWallet;
    }
}
