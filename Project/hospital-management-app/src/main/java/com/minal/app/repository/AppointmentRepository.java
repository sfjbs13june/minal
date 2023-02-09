package com.minal.app.repository;

import com.minal.app.model.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends MongoRepository<Appointment, String> {

    public Appointment save(Appointment ap);
    public List<Appointment> findByDoctorName(String doctorName);
    public List<Appointment> findByPatientName(String patientName);
}
