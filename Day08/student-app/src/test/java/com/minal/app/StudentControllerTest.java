package com.minal.app;

import com.minal.app.controller.StudentController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
public class StudentControllerTest {

    StudentController studentController = new StudentController();

    @Test
    public void testGetStudents(){
        int expectedSize=3;
        List result= studentController.getStudents();
        Assertions.assertEquals(expectedSize,result.size());
    }
    @Test
    public void testMapStudent(){
        int expectedSize=3;

        Map result=studentController.mapStudents();
        Assertions.assertEquals(expectedSize,result.size());
    }
}
