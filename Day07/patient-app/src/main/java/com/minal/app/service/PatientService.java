package com.minal.app.service;

import com.minal.app.model.Patient;
import org.springframework.stereotype.Component;

@Component
public class PatientService
{
    public Patient updateDetail(Patient patient, String disease, String age)
    {
        patient.setDisease(disease);
        patient.setAge(age);
        return patient;
    }
}
