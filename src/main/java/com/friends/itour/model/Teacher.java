package com.friends.itour.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Teacher {
    @Id
    private  Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
