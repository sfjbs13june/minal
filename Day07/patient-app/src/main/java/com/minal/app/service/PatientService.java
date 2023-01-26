package com.minal.app.service;

import com.minal.app.model.Patient;
import org.springframework.stereotype.Component;
public class PatientService {

    public Patient updateDetails(Patient patient,String disease,String age){
        patient.setDisease(disease);
        patient.setAge(age);
        return patient;
    }
}
