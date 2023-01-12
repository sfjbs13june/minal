package com.minal.app;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class AppTest extends TestCase
{
    @Test
    public void testSayWelcome(){
        String expectedResult = "welcome from greeting";
        Greeting g = new Greeting();
        String res = g.sayWelcome();
        Assert.assertEquals(expectedResult, res);
    }

    @Test
    public void testSayHello(){
        String expectedResult = "hello from greeting";
        Greeting h = new Greeting();
        String res = h.sayHello();
        Assert.assertEquals(expectedResult, res);
    }

    @Test
    public void testSayBye(){
        String expectedResult = "bye from greeting";
        Greeting b = new Greeting();
        String res = b.sayBye();
        Assert.assertEquals(expectedResult, res);
    }
}

