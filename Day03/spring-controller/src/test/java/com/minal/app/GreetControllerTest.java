package com.minal.app;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class GreetControllerTest {

    GreetController greetController = new GreetController();
    @Test
    public void testSayGreet(){
        String expectedResult = "Greet from App";
        String result = greetController.SayGreet();
        Assert.assertEquals(expectedResult, result);
    }
    @Test
    public void testSayWelcome(){
        String expectedResult = "Welcome from App";
        String result = greetController.SayWelcome();
        Assert.assertEquals(expectedResult, result);
    }
    @Test
    public void testSayHi(){
        String expectedResult = "Hi from App";
        String result = greetController.SayHi();
        Assert.assertEquals(expectedResult, result);
    }
    @Test
    public void testSayThanks(){
        String expectedResult = "Thanks from App";
        String result = greetController.SayThanks();
        Assert.assertEquals(expectedResult, result);
    }

}
