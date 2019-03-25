package com.friends.itour.dao;

import com.friends.itour.core.universal.Mapper;
import com.friends.itour.model.TreeModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TreeMapper extends Mapper<TreeModel> {
    public List<TreeModel> findTree(@Param("parentId")Integer parentId);
}
