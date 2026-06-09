package com.raghavs.demo2_project;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Topic
{
    @Id
    private int id;
    private String name;
    public Topic(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Topic() {}
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}