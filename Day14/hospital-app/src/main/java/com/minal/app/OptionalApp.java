package com.minal.app;

import com.minal.app.model.Hospital;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalApp
{
    public Optional<Hospital> getHospital(String name){

        Hospital h1= new Hospital("123","american","Jaipur");
        Hospital h2= new Hospital("140","pacific","Udaipur");
        Map<String, Hospital> data = new HashMap<>();
        data.put("123", h1);
        data.put("140", h2);
        Hospital result= data.get(name);
        return Optional.ofNullable(result);
    }
}
