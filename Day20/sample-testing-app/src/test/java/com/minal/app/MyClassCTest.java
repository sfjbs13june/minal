package com.minal.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class MyClassCTest {
    @InjectMocks
    MyClassC myClassC;
    @Test
    public void getAgeTest() {
        int res = myClassC.getMyAge(22);
        assertEquals(22, res);
    }
}
