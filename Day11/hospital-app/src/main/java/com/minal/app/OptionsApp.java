package com.minal.app;

import com.minal.app.model.Hospital;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionsApp {

    public Optional<Hospital> getHospital(String name){

        Hospital h1= new Hospital("1","Apollo","NewYork");
        Hospital h2= new Hospital("2","Icon","Florida");
        Map<String, Hospital> data = new HashMap<>();
        data.put("1", h1);
        data.put("2", h2);
        Hospital result= data.get(name);
        return Optional.ofNullable(result);
    }
}
