package com.raghavs.demo_project.model;

public class Topic {
    private String name;
    private String id;
    private String about;
    
    public Topic(String name, String id, String about) {
        this.name = name;
        this.id = id;
        this.about = about;
    }
    public Topic() 
    {}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getAbout() {
        return about;
    }
    public void setAbout(String about) {
        this.about = about;
    }
    
    
}
