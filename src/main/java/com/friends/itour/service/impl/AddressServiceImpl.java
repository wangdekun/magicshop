package com.friends.itour.service.impl;

import com.friends.itour.model.AddressEntity;
import com.friends.itour.service.AddressService;
import org.apache.ibatis.exceptions.TooManyResultsException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;

import java.util.List;

@Component
@Service
public class AddressServiceImpl implements AddressService {
    @Override
    public AddressEntity addAddress(AddressEntity addressEntity) {
        insert(addressEntity);
        return addressEntity;
    }

    @Override
    public Integer insert(AddressEntity model) {
        return null;
    }

    @Override
    public Integer deleteById(String id) {
        return null;
    }

    @Override
    public Integer deleteByIds(String ids) {
        return null;
    }

    @Override
    public Integer update(AddressEntity model) {
        return null;
    }

    @Override
    public AddressEntity selectById(String id) {
        return null;
    }

    @Override
    public AddressEntity selectBy(String fieldName, Object value) throws TooManyResultsException {
        return null;
    }

    @Override
    public List<AddressEntity> selectListBy(String fieldName, Object value) {
        return null;
    }

    @Override
    public List<AddressEntity> selectListByIds(String ids) {
        return null;
    }

    @Override
    public List<AddressEntity> selectByCondition(Condition condition) {
        return null;
    }

    @Override
    public List<AddressEntity> selectAll() {
        return null;
    }

    @Override
    public List<AddressEntity> select(AddressEntity record) {
        return null;
    }

    @Override
    public AddressEntity selectOne(AddressEntity record) {
        return null;
    }
}
