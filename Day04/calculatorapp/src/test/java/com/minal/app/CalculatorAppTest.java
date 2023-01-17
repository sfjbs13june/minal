package com.minal.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculatorAppTest {

    CalculatorAppController calculatorAppController = new CalculatorAppController();
    @Test
    public void testRequestAdd()
    {
        double a=4.0;
        double b=4.0;
        double expectedResult=8.0;
        double result= calculatorAppController.add(a,b);
        Assertions.assertEquals(expectedResult, result, 0.00);
    }

    @Test
    public void testRequestSub(){
        double a=4.0;
        double b=4.0;
        double expectedResult=0.0;
        double result= calculatorAppController.sub(a,b);
        Assertions.assertEquals(expectedResult, result, 0.00);
    }

    @Test
    public void testRequestMulti(){
        double a=4.0;
        double b=4.0;
        double expectedResult=16.0;
        double result= calculatorAppController.multi(a,b);
        Assertions.assertEquals(expectedResult, result, 0.00);
    }

    @Test
    public void testRequestDiv(){
        double a=4.0;
        double b=4.0;
        double expectedResult=1.0;
        double result= calculatorAppController.div(a,b);
        Assertions.assertEquals(expectedResult, result, 0.00);
    }
}
