package com.friends.itour.controller;

import com.friends.itour.file.TreeFilter;
import com.friends.itour.model.TreeModel;
import com.friends.itour.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/tree")
public class TreeController {
    @Autowired
    private TreeService treeService;
    @RequestMapping(value = "/findtree.json", method = {RequestMethod.GET, RequestMethod.POST})
    public List<TreeFilter> findTree(@RequestBody TreeModel treeModel){
        List<TreeModel> m=treeService.selectTree(treeModel);
        List<TreeFilter> submenus =new ArrayList();
        Integer firstNum =0;
        for (int i=0;i<m.size();i++){
            if (m.get(i).getParentId()==null){
                TreeFilter treeFilter =new TreeFilter();
                firstNum =firstNum+1;
                treeFilter.setName(firstNum+"");
                treeFilter.setId(m.get(i).getId());
                treeFilter.setTitle(m.get(i).getName());
                List<TreeFilter> items =new ArrayList();
                treeFilter.setTreeFilters(items);
                submenus.add(treeFilter);
                if(m.get(i).getIsroot().equals("N")){
                    Integer secoundNum =0;
                    for (int k=0;k<m.size();k++){
                        if (m.get(k).getParentId()==m.get(i).getId()){
                            TreeFilter treeFiltertwo = new TreeFilter();
                            treeFiltertwo.setTitle(m.get(k).getName());
                            secoundNum = secoundNum+1;
                            treeFiltertwo.setName(firstNum+"-"+secoundNum);
                            treeFiltertwo.setId(m.get(k).getId());
                            List<TreeFilter> items2 =new ArrayList();
                            treeFiltertwo.setTreeFilters(items2);
                            items.add(treeFiltertwo);
                            if(m.get(k).getIsroot().equals("N")){
                                Integer thirdNum =0;
                                for (int j=0;j<m.size();j++){
                                    if (m.get(j).getParentId()==m.get(k).getId()){
                                        thirdNum = thirdNum+1;
                                        TreeFilter treeFilter1three = new TreeFilter();
                                        treeFilter1three.setTitle(m.get(j).getName());
                                        treeFilter1three.setId(m.get(j).getId());
                                        treeFilter1three.setName(firstNum+"-"+secoundNum+"-"+thirdNum);
                                        items2.add(treeFilter1three);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return submenus;
    }
}
