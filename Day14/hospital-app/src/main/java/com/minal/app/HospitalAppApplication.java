package com.minal.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HospitalAppApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(HospitalAppApplication.class, args);
		OptionalApp op = new OptionalApp();
		op.getHospital("pacific").ifPresent(Hospital-> System.out.println(Hospital.getName()));

		StreamApp streamApp=new StreamApp();
		System.out.println("Hospital Array");
		streamApp.getHospitalArray().forEach(hospital -> System.out.println(hospital.toString()));
		System.out.println("Hospital List");
		streamApp.getHospitalList().forEach(hospital -> System.out.println(hospital.toString()));
		System.out.println("Hospital Data");
		streamApp.getHospitalList().forEach(hospital -> System.out.println(hospital.toString()));
		System.out.println("Hospital builder");
		streamApp.getHospitalStreamBuilder().forEach(hospital -> System.out.println(hospital.toString()));

		StreamAppE streamApp1=new StreamAppE();
		System.out.println("employee Array");
		streamApp1.getEmployeeArray().forEach(employee -> System.out.println(employee.toString()));
		System.out.println("employee List");
		streamApp1.getEmployeeList().forEach(employee -> System.out.println(employee.toString()));
		System.out.println("employee Data");
		streamApp1.getEmployeeData().forEach(employee -> System.out.println(employee.toString()));
		System.out.println("employee builder");
		streamApp1.getEmployeeStreamBuilder().forEach(employee -> System.out.println(employee.toString()));
		streamApp1.getEmployeeList().forEach(e -> e.salaryIncrement(10.0));
		streamApp1.getEmployeeStreamBuilder().forEach(employee -> System.out.println(employee.toString()));
	}
}
