package com.friends.itour.service.impl;

import com.friends.itour.dao.TreeMapper;
import com.friends.itour.model.TreeModel;
import com.friends.itour.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
@Component
public class TreeServiceImpl implements TreeService {
    @Resource
    private TreeMapper treeMapper;
    @Override
    public List<TreeModel> selectTree(TreeModel treeModel) {
        return treeMapper.findTree(treeModel.getId());
    }
}
