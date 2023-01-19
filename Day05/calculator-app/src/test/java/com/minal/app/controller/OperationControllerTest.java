package com.minal.app.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OperationControllerTest {

    OperationController operationController = new OperationController();
    @Test
    public void addTest()
    {
        long a = (long) 12.0;
        long b = (long) 6.0;
        long expected = 18;
        long resData = operationController.add(a,b);
        Assertions.assertEquals(expected,resData);
    }

    @Test
    public void subTest()
    {
        long a = (long) 12.0;
        long b = (long) 6.0;
        long expected = 6L;
        long resData = operationController.sub(a,b);
        Assertions.assertEquals(expected,resData);
    }

    @Test
    public void multiTest()
    {
        long a = (long) 12.0;
        long b = (long) 6.0;
        long expected = 72;
        long resData = operationController.multi(a,b);
        Assertions.assertEquals(expected,resData);
    }

    @Test
    public void divTest()
    {
        long a = (long) 12.0;
        long b = (long) 6.0;
        long expected = 2;
        long resData = operationController.div(a,b);
        Assertions.assertEquals(expected,resData);
    }
}
