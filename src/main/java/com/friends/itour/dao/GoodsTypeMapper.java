package com.friends.itour.dao;

import com.friends.itour.core.universal.Mapper;
import com.friends.itour.model.GoodsTypeEntity;
import com.friends.itour.model.User;

import java.util.List;

public interface GoodsTypeMapper extends Mapper<GoodsTypeEntity> {
    public List<GoodsTypeEntity> selectGoodsTypeEntity();
}
