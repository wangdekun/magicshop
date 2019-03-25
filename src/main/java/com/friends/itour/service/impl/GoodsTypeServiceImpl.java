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
}
