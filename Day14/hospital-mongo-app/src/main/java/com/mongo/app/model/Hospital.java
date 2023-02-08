package com.mongo.app.model;

public class Hospital {

    String hospitalId;
    String address;
    String name;
    public Hospital(String hospitalId, String address, String name) {
        this.hospitalId = hospitalId;
        this.address = address;
        this.name = name;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {this.name = name;}

}
