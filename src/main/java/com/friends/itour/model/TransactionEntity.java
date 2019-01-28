package com.friends.itour.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;
@Entity
@Table(name="SYS_TRANSACTION_RECORD")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class TransactionEntity {
    @Id
    @Column(name="transaction_record_id")
    private Integer transactionRecordId;
    @Column(name="transaction_record_code")
    private Integer transactionRecordCode;
    @Column(name="wallet_code")
    private Integer walletCode;
    @Column(name="user_cash_flow")
    private BigDecimal userCashFlow;
    @Column(name="user_cash_details")
    private String userCashDetails;
    @Column(name="transaction_operation_time")
    private Date transactionOperationTime;
    @Column(name="transaction_operation_ip")
    private String transactionOperationIp;
    @Column(name="transaction_operation_address")
    private String transactionOperationAddress;
    @Column(name="transaction_time")
    private Date transactionTime;

    public Integer getTransactionRecordId() {
        return transactionRecordId;
    }

    public void setTransactionRecordId(Integer transactionRecordId) {
        this.transactionRecordId = transactionRecordId;
    }

    public Integer getTransactionRecordCode() {
        return transactionRecordCode;
    }

    public void setTransactionRecordCode(Integer transactionRecordCode) {
        this.transactionRecordCode = transactionRecordCode;
    }

    public Integer getWalletCode() {
        return walletCode;
    }

    public void setWalletCode(Integer walletCode) {
        this.walletCode = walletCode;
    }

    public BigDecimal getUserCashFlow() {
        return userCashFlow;
    }

    public void setUserCashFlow(BigDecimal userCashFlow) {
        this.userCashFlow = userCashFlow;
    }

    public String getUserCashDetails() {
        return userCashDetails;
    }

    public void setUserCashDetails(String userCashDetails) {
        this.userCashDetails = userCashDetails;
    }

    public Date getTransactionOperationTime() {
        return transactionOperationTime;
    }

    public void setTransactionOperationTime(Date transactionOperationTime) {
        this.transactionOperationTime = transactionOperationTime;
    }

    public String getTransactionOperationIp() {
        return transactionOperationIp;
    }

    public void setTransactionOperationIp(String transactionOperationIp) {
        this.transactionOperationIp = transactionOperationIp;
    }

    public String getTransactionOperationAddress() {
        return transactionOperationAddress;
    }

    public void setTransactionOperationAddress(String transactionOperationAddress) {
        this.transactionOperationAddress = transactionOperationAddress;
    }

    public Date getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(Date transactionTime) {
        this.transactionTime = transactionTime;
    }
}
