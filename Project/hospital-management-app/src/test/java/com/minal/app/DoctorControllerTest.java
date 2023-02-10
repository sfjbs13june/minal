package com.minal.app;

import com.minal.app.controller.DoctorController;
import com.minal.app.model.Appointment;
import com.minal.app.model.Prescription;
import com.minal.app.repository.AppointmentRepository;
import org.junit.Assert;
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
public class DoctorControllerTest
{
    @InjectMocks
    private DoctorController doctorController;

    @Mock
    private Appointment appointment;

    @Mock
    AppointmentRepository appointmentRepository;

    @BeforeEach
    public void setUp() {
        appointment = Mockito.mock(Appointment.class);
        appointmentRepository = Mockito.mock(AppointmentRepository.class);
    }

    @Test
    public void getDoctorAppointmentsTest()
    {
        List<Appointment> appointments = new ArrayList();
        Appointment appointment = new Appointment();
        appointment.setAppointmentId("123");
        appointment.setPatientName("Siya");
        appointment.setDoctorName("Doc3");
        appointment.setDate("15 feb");
        appointments.add(appointment);
        Prescription prescription = new Prescription("pres1", "102", "malaria", "Siya", "Doc3");
        appointment.setPrescription(prescription);
        when(appointmentRepository.findByDoctorName(anyString())).thenReturn(appointments);
        List<Appointment> result = doctorController.getAppointments("Doc3");
        Assert.assertEquals(appointments.size(), 1);
        Assert.assertEquals(appointments.get(0).getAppointmentId(), result.get(0).getAppointmentId());
        Assert.assertEquals(appointments.get(0).getPatientName(), result.get(0).getPatientName());
        Assert.assertEquals(appointments.get(0).getDoctorName(), result.get(0).getDoctorName());
        Assert.assertEquals(appointments.get(0).getDate(), result.get(0).getDate());
        Assert.assertEquals(appointments.get(0).getPrescription().getPrescriptionId(), result.get(0).getPrescription().getPrescriptionId());
        Assert.assertEquals(appointments.get(0).getPrescription().getAppointmentId(), result.get(0).getPrescription().getAppointmentId());
        Assert.assertEquals(appointments.get(0).getPrescription().getPatientName(), result.get(0).getPrescription().getPatientName());
        Assert.assertEquals(appointments.get(0).getPrescription().getDoctorName(), result.get(0).getPrescription().getDoctorName());
        Assert.assertEquals(appointments.get(0).getPrescription().getDescription(), result.get(0).getPrescription().getDescription());
    }

    @Test
    public void saveAppointmentTest() {
        Appointment ap1 = new Appointment();
        when(appointmentRepository.save(any(Appointment.class))).thenReturn(ap1);
        Appointment result = doctorController.saveAppointment(appointment);
        Assert.assertEquals(ap1, result);
    }

    @Test
    public void TestSaveDocController() {
        Appointment ap = new Appointment();
        when(appointmentRepository.save(any(Appointment.class))).thenReturn(ap);
        Appointment result = doctorController.saveAppointment(appointment);
        assertEquals(ap, result);
    }
}