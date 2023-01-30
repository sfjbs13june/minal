package com.minal.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaOptionStreamApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(JavaOptionStreamApplication.class, args);
		OptionsApp op = new OptionsApp();
		op.getHospital("rachel").ifPresent(Hospital-> System.out.println(Hospital.getName()));
	}

}
