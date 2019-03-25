package com.friends.itour.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SYS_GOODS_TYPE")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class GoodsTypeEntity {
    @Id
    @Column(name="goods_type_id")
    private Integer goodsTypeId;
    @Column(name="goods_type_code")
    private Integer getGoodsTypeCode;
    @Column(name="goods_type_name")
    private String goodsTypeName;
    @Column(name="parent_id")
    private Integer parentId;
    @Column(name="node_type")
    private String nodeType;
    @Column(name="sort_type")
    private String sortType;

    public Integer getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(Integer goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public Integer getGetGoodsTypeCode() {
        return getGoodsTypeCode;
    }

    public void setGetGoodsTypeCode(Integer getGoodsTypeCode) {
        this.getGoodsTypeCode = getGoodsTypeCode;
    }

    public String getGoodsTypeName() {
        return goodsTypeName;
    }

    public void setGoodsTypeName(String goodsTypeName) {
        this.goodsTypeName = goodsTypeName;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }
}
