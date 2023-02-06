package com.minal.app.controller;

import com.minal.app.model.Hospital;
import com.minal.app.model.Patient;
import com.minal.app.service.RabbitMQSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.context.ActiveProfiles;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;

@RunWith(MockitoJUnitRunner.class)
@ActiveProfiles(value = "test")
public class WebControllerTest {
  @InjectMocks
  WebController webController;

  @Mock
  RabbitMQSender rabbitMQSender;

  @Test
  public void producerTest() {
    doNothing().when(rabbitMQSender).send(any(Hospital.class));
    doNothing().when(rabbitMQSender).sendP(any(Patient.class));
    String result=webController.producer("rohit","223","bhilwara");
    String result1=webController.producerP("rohit","123","23","M","fever");
    System.out.println(result);
    System.out.println(result1);
  }
}
