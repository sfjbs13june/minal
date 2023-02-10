package com.minal.app;

import com.minal.app.controller.DoctorController;
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
public class DoctorControllerTest {

    @InjectMocks
    DoctorController doctorController;

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
    public void TestSaveDocController(){
        Appointment ap = new Appointment();
        when(appointmentRepository.save(any(Appointment.class))).thenReturn(ap);
        Appointment result = doctorController.saveAppointment(appointment);
        assertEquals(ap,result);
    }

    @Test
    public void TestGetDoctorController1(){
        List<Appointment> appointments=new ArrayList();
        Appointment appointment1=new Appointment();
        appointment1.setAppointmentId("101");
        appointment1.setPatientName("Siya");
        appointment1.setDoctorName("Doc3");
        appointment1.setDate("15thMarch");
        appointments.add(appointment1);

        Prescription prescription1=new Prescription();
        prescription1.setPrescriptionId("11");
        prescription1.setAppointmentId("101");
        prescription1.setDescription("Take medicine for fever");
        prescription1.setPatientName("Siya");
        prescription1.setDoctorName("Doc3");
        appointment1.setPrescription(prescription1);

        when(appointmentRepository.findByDoctorName(anyString())).thenReturn(appointments);
        List<Appointment> result=doctorController.getAppointments("doc1");
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
