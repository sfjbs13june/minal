package com.minal.app.controller;

import com.minal.app.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class StudentController {

    @GetMapping("/get/students")
    public List<Student> getStudents(){
        List listStudents=new ArrayList();
        Student student1 = new Student("abc","1","3","HolyCross");
        Student student2 = new Student("xyz","1","3","Carmel");
        Student student3 = new Student("pqr","1","3","BSHS");

        listStudents.add(student1);
        listStudents.add(student2);
        listStudents.add(student3);
        return listStudents;
    }

    @GetMapping("/map/students")
    public Map mapStudents(){
        Map StudentMap=new HashMap();
        Student student1 = new Student("abc","1","3","HolyCross");
        Student student2 = new Student("xyz","1","3","Carmel");
        Student student3 = new Student("pqr","1","3","BSHS");

        StudentMap.put(student1.getName(),student1);
        StudentMap.put(student2.getName(),student2);
        StudentMap.put(student3.getName(),student3);
        return StudentMap;
    }

}
