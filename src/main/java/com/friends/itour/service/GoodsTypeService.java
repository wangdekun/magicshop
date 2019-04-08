package com.friends.itour.service;

import com.friends.itour.core.universal.Mapper;
import com.friends.itour.model.GoodsTypeEntity;

import java.util.List;

public interface GoodsTypeService extends Mapper<GoodsTypeEntity> {
    public List<GoodsTypeEntity> searchGoodsType();
}
