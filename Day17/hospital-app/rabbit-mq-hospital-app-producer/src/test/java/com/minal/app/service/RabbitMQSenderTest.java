package com.minal.app.service;

import com.minal.app.model.Hospital;
import com.minal.app.model.Patient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.test.context.ActiveProfiles;

@RunWith(MockitoJUnitRunner.class)
@ActiveProfiles(value = "test")
public class RabbitMQSenderTest {

  @InjectMocks
  RabbitMQSender rabbitMQSender;

  @Mock
  AmqpTemplate amqpTemplate;

  @Test
  public void sendTest() {
     Hospital hospital=new Hospital();
     Patient patient = new Patient();
   // doNothing().when(amqpTemplate).convertAndSend(anyString(),anyString(),any(Employee.class));
    rabbitMQSender.send(hospital);
    rabbitMQSender.sendP(patient);
   //verify(amqpTemplate, times(1)).convertAndSend("exchange","queue",employee);
  }


}
