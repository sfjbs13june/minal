package com.minal.app;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MyClassBTest {
    @InjectMocks
    MyClassB myClassB;

    @Mock
    MyClassC myClassC;

    @BeforeEach
    void setup()
    {
        myClassC = Mockito.mock(MyClassC.class);
    }

    @Test
    public void TestMethod1() {
        String result = myClassB.getResult();
        assertEquals("my result", result);
    }


    @Test
    public void getMyStringTest(){
        String result = myClassB.getMyString("my data");
        assertEquals("my result my data",result);
    }

    @Test
    public void getClassCResultTest(){
        when(myClassC.getMyAge(anyInt())).thenReturn(24);
        int res = myClassB.getClassCResult(myClassC);
        assertEquals(24,res);
    }


    @Test
    public void noreturnDataTst(){
        myClassB.NoreturnData("my data");
        String result = "my data";
        assertEquals("my data" , result);

    }
}
