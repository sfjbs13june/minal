/*package com.minal.app.controller;

import com.minal.app.model.Hospital;
import com.minal.app.model.Patient;
import com.minal.app.service.RabbitMQSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/rabbitmq/")
public class PatientController {
  @Autowired
  RabbitMQSender rabbitMQSender;

  @GetMapping(value = "/producer/patient")
  public String producerP(@RequestParam("name") String name,@RequestParam("id") String id, @RequestParam("age") String age,@RequestParam("gender") String gender,@RequestParam("disease") String disease)
  {
    Patient patient = new Patient();
    patient.setName(name);
    patient.setId(id);
    patient.setAge(age);
    patient.setGender(gender);
    patient.setDisease(disease);
    rabbitMQSender.sendP(patient);

    return "Message sent to the RabbitMQ  Successfully";
  }

  @PostMapping(value = "/patient")
  public String postPatient(@RequestBody Patient patient)
  {
    rabbitMQSender.sendP(patient);
    return "Message sent to the RabbitMQ  Successfully";
  }
}
*/