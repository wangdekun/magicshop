package com.friends.itour.controller;

import com.friends.itour.model.GoodsTypeEntity;
import com.friends.itour.service.GoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(value = "/goodstype")
public class GoodsTypeController {
    @Autowired
    private GoodsTypeService goodsTypeService;
    @RequestMapping(value = "/selectgoodstype.json", method = {RequestMethod.GET, RequestMethod.POST})
    public List<GoodsTypeEntity> find(){
        return goodsTypeService.searchGoodsType();
    }
}
