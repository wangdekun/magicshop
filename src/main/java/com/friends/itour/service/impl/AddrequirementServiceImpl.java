package com.friends.itour.service.impl;

import com.friends.itour.dao.AddrequirementMapper;
import com.friends.itour.model.RequirementEditEmpty;
import com.friends.itour.service.AddrequirementService;
import org.apache.ibatis.exceptions.TooManyResultsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.lang.annotation.Annotation;
import java.util.List;

@Service
@Component
public class AddrequirementServiceImpl implements AddrequirementService {

    @Resource
    private AddrequirementMapper addrequirementMapper;
    @Override
    public Integer insert(RequirementEditEmpty model) {
        addrequirementMapper.insert(model);
        return 0;
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
    public Integer update(RequirementEditEmpty model) {
        return null;
    }

    @Override
    public RequirementEditEmpty selectById(String id) {
        return null;
    }

    @Override
    public RequirementEditEmpty selectBy(String fieldName, Object value) throws TooManyResultsException {
        return null;
    }

    @Override
    public List<RequirementEditEmpty> selectListBy(String fieldName, Object value) {
        return null;
    }

    @Override
    public List<RequirementEditEmpty> selectListByIds(String ids) {
        return null;
    }

    @Override
    public List<RequirementEditEmpty> selectByCondition(Condition condition) {
        return null;
    }

    @Override
    public List<RequirementEditEmpty> selectAll() {
        return null;
    }

    @Override
    public List<RequirementEditEmpty> select(RequirementEditEmpty record) {
        return null;
    }

    @Override
    public RequirementEditEmpty selectOne(RequirementEditEmpty record) {
        //addrequirementMapper.selectByPrimaryKey(id);
        return null;
    }

    @Override
    public RequirementEditEmpty selectOneRequirement(Integer id) {
        return addrequirementMapper.selectByPrimaryKey(id);
    }
}
