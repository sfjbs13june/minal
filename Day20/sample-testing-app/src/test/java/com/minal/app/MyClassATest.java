package com.minal.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MyClassATest {
    @InjectMocks
    MyClassA myClassA;
    @Mock
    MyClassB myClassB;
    @Mock
    MyClassC myClassC;
    @BeforeEach
    void setUp(){
        myClassB= Mockito.mock(MyClassB.class);
        myClassC= Mockito.mock(MyClassC.class);
    }
    @Test
    public void TestMethod1() {
        String result = myClassA.method1();
        assertEquals("hello", result);
    }

    @Test
    public void TestMethod2() {
        when(myClassB.getResult()).thenReturn("your result");
        String result = myClassA.method2();
        assertEquals("your result", result);
    }

    @Test
    public void TestMethod3() {
        when(myClassC.getMyAge(anyInt())).thenReturn(35);
        int result = myClassC.getMyAge(25);
        assertEquals(35, result);
    }

    @Test
    public void TestMethod4() {
        when(myClassB.getMyString(anyString())).thenReturn("my result with data : ");
        String result = myClassA.method4("data");
        assertEquals("my result with data : ", result);
    }

    @Test
    public void TestMethod5() {
        when(myClassB.getClassCResult(any(MyClassC.class))).thenReturn(35);
        int result = myClassA.method5();
        assertEquals(35, result);
    }

    @Test
    public void TestMethod6() {
        myClassA.method6();
        verify(myClassB, atLeast(1)).NoreturnData("my data");
    }
}
