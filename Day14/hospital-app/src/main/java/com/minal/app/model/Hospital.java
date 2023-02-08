package com.minal.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Hospital
{
    @Id
    @Column(name="id")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name="city")
    private String city;

    public  Hospital()
    {
    }

    public Hospital(String id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
