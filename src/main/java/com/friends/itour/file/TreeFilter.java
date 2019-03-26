package com.friends.itour.file;

import java.util.List;

public class TreeFilter {
    private String name;
    private String title;
    private Integer id;
    private List<TreeFilter> treeFilters;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<TreeFilter> getTreeFilters() {
        return treeFilters;
    }

    public void setTreeFilters(List<TreeFilter> treeFilters) {
        this.treeFilters = treeFilters;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
