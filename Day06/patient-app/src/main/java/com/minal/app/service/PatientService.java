package com.minal.app.service;

import com.minal.app.model.Patient;
import org.springframework.stereotype.Component;

@Component
public class PatientService {

    public Patient updateDetail(Patient patient, String disease){
        patient.setDisease(disease);
        return patient;
    }
}
