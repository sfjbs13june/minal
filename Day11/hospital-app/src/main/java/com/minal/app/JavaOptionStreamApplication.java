package com.minal.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaOptionStreamApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(JavaOptionStreamApplication.class, args);
		OptionsApp op = new OptionsApp();
		op.getHospital("Icon").ifPresent(Hospital-> System.out.println(Hospital.getName()));

		StreamApp streamApp=new StreamApp();
		System.out.println("Hospital Array");
		streamApp.getHospitalArray().forEach(hospital -> System.out.println(hospital.toString()));
		System.out.println("Hospital List");
		streamApp.getHospitalList().forEach(hospital -> System.out.println(hospital.toString()));
		System.out.println("Hospital Data");
		streamApp.getHospitalList().forEach(hospital -> System.out.println(hospital.toString()));
		System.out.println("Hospital builder");
		streamApp.getHospitalStreamBuilder().forEach(hospital -> System.out.println(hospital.toString()));
	}

}
