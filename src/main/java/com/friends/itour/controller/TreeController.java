package com.friends.itour.controller;

import com.friends.itour.model.TreeModel;
import com.friends.itour.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/tree")
public class TreeController {
    @Autowired
    private TreeService treeService;
    @RequestMapping(value = "/findtree.json", method = {RequestMethod.GET, RequestMethod.POST})
    public List<TreeModel> findTree(@RequestBody TreeModel treeModel){
        List<TreeModel> m=treeService.selectTree(treeModel);
        return m;
    }
}
