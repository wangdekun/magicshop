package com.friends.itour.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Table(name="requirementedit")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class    RequirementEditEmpty {
    @javax.persistence.Id
    @Column(name="id")
    private Integer id;
    @Column(name="content")
    private String content;
    @Column(name="create_time")
    private Date createTime;
    @Column(name="create_by")
    private String createBy;
    @Column(name="update_time")
    private Date updateTime;
    @Column(name="update_by")
    private String updateBy;
    @Column(name="doclimit")
    private String doclimit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getDoclimit() {
        return doclimit;
    }

    public void setDoclimit(String doclimit) {
        this.doclimit = doclimit;
    }
}
