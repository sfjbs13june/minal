package com.minal.app;

import com.minal.app.controller.PatientController;
import com.minal.app.model.Appointment;
import com.minal.app.model.Prescription;
import com.minal.app.repository.AppointmentRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
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
    private PatientController patientController;
    @Mock
    private Appointment appointment;
    @Mock
    private AppointmentRepository appointmentRepository;

    @BeforeEach
    void setUp() {
        appointment = Mockito.mock(Appointment.class);
        appointmentRepository = Mockito.mock(AppointmentRepository.class);
    }

    @Test
    public void getPatientTest()
    {
        List<Appointment> patient = new ArrayList();
        when(appointmentRepository.findByPatientName(anyString())).thenReturn(patient);
        List result=patientController.getMyAppointments("Siya");
        Assert.assertEquals(patient,result);
    }

    @Test
    public void SavePatientTest()
    {
        Appointment app =new Appointment();
        when(appointmentRepository.save(any(Appointment.class))).thenReturn(app);
        Appointment result=patientController.saveAppointment(appointment);
        Assert.assertEquals(app,result);
    }
}
