package com.minal.app;

import com.minal.app.controller.PrescriptionController;
import com.minal.app.model.Prescription;
import com.minal.app.repository.PrescriptionRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PrescriptionControllerTest {

    @InjectMocks
    PrescriptionController prescriptionController;

    @Mock
    Prescription prescription;

    @Mock
    PrescriptionRepository prescriptionRepository;

    @BeforeEach
    void setUp(){
        prescription= Mockito.mock(Prescription.class);
        prescriptionRepository=Mockito.mock(PrescriptionRepository.class);
    }

    @Test
    public void TestSavePrescription1(){
        Prescription pre = new Prescription();
        when(prescriptionRepository.save(any(Prescription.class))).thenReturn(pre);
        Prescription result = prescriptionController.savePrescription(prescription);
        assertEquals(pre,result);
    }

    @Test
    public void TestGetPrescriptionController1(){
        List<Prescription> prescriptions = new ArrayList();
        Prescription prescription1= new Prescription();
        prescription1.setAppointmentId("102");
        prescription1.setPatientName("Sita");
        prescription1.setDoctorName("Doc4");
        prescription1.setPrescriptionId("12");
        prescription1.setDescription("Take medicine for cough");
        prescriptions.add(prescription1);

        when(prescriptionRepository.findAll()).thenReturn(prescriptions);
        List<Prescription> result=prescriptionController.getAllPrescriptions();
        assertEquals(prescriptions.size(),1);
        assertEquals(prescriptions.get(0).getPrescriptionId(),result.get(0).getPrescriptionId());
        assertEquals(prescriptions.get(0).getAppointmentId(),result.get(0).getAppointmentId());
        assertEquals(prescriptions.get(0).getPatientName(),result.get(0).getPatientName());
        assertEquals(prescriptions.get(0).getDoctorName(),result.get(0).getDoctorName());
        assertEquals(prescriptions.get(0).getDescription(),result.get(0).getDescription());

        }
}
