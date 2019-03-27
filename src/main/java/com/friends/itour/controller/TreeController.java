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
    /**isroot判断目前不是根节点，Y表示是根节点（没有子节点），N表示下面还有子节点
     * firstNum  secoundNum  thirdNum forthNum fifthNum 是为了生成name定义的临时变量
     * TreeModel是菜单在数据库的表的实体类
     *TreeFilter是为了返回菜单定义的一个新的实体类，其肋部包含了集合
     * title是在页面显示的菜单项名字
     */
    @RequestMapping(value = "/findtree.json", method = {RequestMethod.GET, RequestMethod.POST})
    public List<TreeFilter> findTree(@RequestBody TreeModel treeModel){
        List<TreeModel> m=treeService.selectTree(treeModel);
        List<TreeFilter> submenus =new ArrayList();
        Integer firstNum =0;
        for (int i=0;i<m.size();i++){
            if (m.get(i).getParentId()==null){
                TreeFilter treeFilter =new TreeFilter();
                firstNum += 1;
                treeFilter.setName(firstNum+"");
                treeFilter.setId(m.get(i).getId());
                treeFilter.setIsroot(m.get(i).getIsroot());
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
                            treeFiltertwo.setIsroot(m.get(k).getIsroot());
                            secoundNum += 1;
                            treeFiltertwo.setName(firstNum+"-"+secoundNum);
                            treeFiltertwo.setId(m.get(k).getId());
                            List<TreeFilter> items2 =new ArrayList();
                            treeFiltertwo.setTreeFilters(items2);
                            items.add(treeFiltertwo);
                            if(m.get(k).getIsroot().equals("N")){
                                Integer thirdNum =0;
                                for (int j=0;j<m.size();j++){
                                    if (m.get(j).getParentId()==m.get(k).getId()){
                                        thirdNum += 1;
                                        TreeFilter treeFilter1three = new TreeFilter();
                                        treeFilter1three.setIsroot(m.get(j).getIsroot());
                                        treeFilter1three.setTitle(m.get(j).getName());
                                        treeFilter1three.setId(m.get(j).getId());
                                        treeFilter1three.setName(firstNum+"-"+secoundNum+"-"+thirdNum);
                                        List<TreeFilter> items3 =new ArrayList();
                                        treeFilter1three.setTreeFilters(items3);
                                        items2.add(treeFilter1three);
                                        if(m.get(j).getIsroot().equals("N")){
                                            Integer forthNum =0;
                                            for (int s=0;s<m.size();s++){
                                                forthNum += 1;
                                                if (m.get(s).getParentId()==m.get(j).getId()){
                                                    TreeFilter treeFilter1four = new TreeFilter();
                                                    treeFilter1four.setIsroot(m.get(s).getIsroot());
                                                    treeFilter1four.setTitle(m.get(s).getName());
                                                    treeFilter1four.setId(m.get(s).getId());
                                                    treeFilter1four.setName(firstNum+"-"+secoundNum+"-"+thirdNum+"-"+forthNum);
                                                    List<TreeFilter> items4 =new ArrayList();
                                                    treeFilter1four.setTreeFilters(items4);
                                                    items3.add(treeFilter1four);
                                                    if(m.get(s).getIsroot().equals("N")) {
                                                        Integer fifthNum =0;
                                                        for (int q = 0; q < m.size(); q++) {
                                                            fifthNum += 1;
                                                            if (m.get(q).getParentId() == m.get(s).getId()) {
                                                                TreeFilter treeFilter1five = new TreeFilter();
                                                                treeFilter1five.setIsroot(m.get(q).getIsroot());
                                                                treeFilter1five.setTitle(m.get(q).getName());
                                                                treeFilter1five.setId(m.get(q).getId());
                                                                treeFilter1five.setName(firstNum + "-" + secoundNum + "-" + thirdNum + "-" + forthNum+ "-" + fifthNum);
                                                                items4.add(treeFilter1five);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
