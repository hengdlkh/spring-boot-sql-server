package com.bezkoder.spring.mssql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerateValue;
import javax.persistence.GenerateType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GenerateValue(strategy = GenerateType.AUTO)
    private long id;

    @Column(name = "name")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "published")
    private boolean published;

    public Category(){

    }

    public Category(String name, String description, boolean published){
        this.name = name;
        this.description = description;
        this.published = published;
    }

    public long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean isPublished){
        this.published = isPublished;
    }

    @Override
    public String toString(){
        return "Category [id="+ id +", name="+name+", desc="+ description +", published="+published+"] ";
    }

}
