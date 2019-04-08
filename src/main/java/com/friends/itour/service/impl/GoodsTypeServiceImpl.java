package com.friends.itour.service.impl;

import com.friends.itour.dao.GoodsTypeMapper;
import com.friends.itour.model.GoodsTypeEntity;
import com.friends.itour.service.GoodsTypeService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Component
@Service
public class GoodsTypeServiceImpl implements GoodsTypeService {
    @Resource
    private GoodsTypeMapper goodsTypeMapper;
    @Override
    public List<GoodsTypeEntity> searchGoodsType() {
        return goodsTypeMapper.selectGoodsTypeEntity();
    }

    @Override
    public int deleteByPrimaryKey(Object o) {
        return 0;
    }

    @Override
    public int delete(GoodsTypeEntity goodsTypeEntity) {
        return 0;
    }

    @Override
    public int insert(GoodsTypeEntity goodsTypeEntity) {
        return 0;
    }

    @Override
    public int insertSelective(GoodsTypeEntity goodsTypeEntity) {
        return 0;
    }

    @Override
    public boolean existsWithPrimaryKey(Object o) {
        return false;
    }

    @Override
    public List<GoodsTypeEntity> selectAll() {
        return null;
    }

    @Override
    public GoodsTypeEntity selectByPrimaryKey(Object o) {
        return null;
    }

    @Override
    public int selectCount(GoodsTypeEntity goodsTypeEntity) {
        return 0;
    }

    @Override
    public List<GoodsTypeEntity> select(GoodsTypeEntity goodsTypeEntity) {
        return null;
    }

    @Override
    public GoodsTypeEntity selectOne(GoodsTypeEntity goodsTypeEntity) {
        return null;
    }

    @Override
    public int updateByPrimaryKey(GoodsTypeEntity goodsTypeEntity) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(GoodsTypeEntity goodsTypeEntity) {
        return 0;
    }

    @Override
    public int deleteByCondition(Object o) {
        return 0;
    }

    @Override
    public List<GoodsTypeEntity> selectByCondition(Object o) {
        return null;
    }

    @Override
    public int selectCountByCondition(Object o) {
        return 0;
    }

    @Override
    public int updateByCondition(GoodsTypeEntity goodsTypeEntity, Object o) {
        return 0;
    }

    @Override
    public int updateByConditionSelective(GoodsTypeEntity goodsTypeEntity, Object o) {
        return 0;
    }

    @Override
    public int deleteByIds(String s) {
        return 0;
    }

    @Override
    public List<GoodsTypeEntity> selectByIds(String s) {
        return null;
    }

    @Override
    public int insertList(List<GoodsTypeEntity> list) {
        return 0;
    }
}
