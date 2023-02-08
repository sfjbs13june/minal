package com.minal.db.model;

public class Patient {

    String name;
    String id;
    String hospitalName;
    public Patient(String name, String id, String hospitalName) {
        this.name = name;
        this.id = id;
        this.hospitalName = hospitalName;
    }

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

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

}
