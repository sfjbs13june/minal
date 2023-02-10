package com.minal.app;

import com.minal.app.controller.PatientController;
import com.minal.app.model.Appointment;
import com.minal.app.model.Prescription;
import com.minal.app.repository.AppointmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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
public class PatientControllerTest {

    @InjectMocks
    PatientController patientController;

    @Mock
    Appointment appointment;
    @Mock
    AppointmentRepository appointmentRepository;
    @BeforeEach
    void setUp(){
        appointment= Mockito.mock(Appointment.class);
        appointmentRepository=Mockito.mock(AppointmentRepository.class);
    }

    @Test
    public void TestSavePatientController(){
        Appointment ap = new Appointment();
        when(appointmentRepository.save(any(Appointment.class))).thenReturn(ap);
        Appointment result = patientController.saveAppointment(appointment);
        assertEquals(ap,result);
    }

    @Test
    public void TestGetPatientController(){
        List<Appointment> appointments = new ArrayList();
        Appointment appointment1= new Appointment();
        appointment1.setAppointmentId("102");
        appointment1.setPatientName("Sita");
        appointment1.setDoctorName("Doc4");
        appointment1.setDate("10feb2023");
        appointments.add(appointment1);


        Prescription prescription1=new Prescription();
        prescription1.setPrescriptionId("12");
        prescription1.setAppointmentId("102");
        prescription1.setDescription("Take medicine for cough");
        prescription1.setPatientName("Sita");
        prescription1.setDoctorName("Doc4");
        appointment1.setPrescription(prescription1);

        when(appointmentRepository.findByPatientName(anyString())).thenReturn(appointments);
        List<Appointment> result=patientController.getMyAppointments("Sita");
        assertEquals(appointments.size(),1);
        assertEquals(appointments.get(0).getAppointmentId(),result.get(0).getAppointmentId());
        assertEquals(appointments.get(0).getPatientName(),result.get(0).getPatientName());
        assertEquals(appointments.get(0).getDoctorName(),result.get(0).getDoctorName());
        assertEquals(appointments.get(0).getDate(),result.get(0).getDate());
        assertEquals(appointments.get(0).getPrescription().getPrescriptionId(),result.get(0).getPrescription().getPrescriptionId());
        assertEquals(appointments.get(0).getPrescription().getPatientName(),result.get(0).getPrescription().getPatientName());
        assertEquals(appointments.get(0).getPrescription().getDoctorName(),result.get(0).getPrescription().getDoctorName());
        assertEquals(appointments.get(0).getPrescription().getDescription(),result.get(0).getPrescription().getDescription());
        assertEquals(appointments.get(0).getPrescription().getAppointmentId(),result.get(0).getPrescription().getAppointmentId());
    }

}
