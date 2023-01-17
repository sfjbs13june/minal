package com.minal.app;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(CalculatorAppController.class)
public class CalculatorControllerIntegrationTest
{
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testCalculatorAppControllerAdd() throws Exception
    {
        String a="4.0";
        String b="4.0";
        ResultActions responseEntity = mockMvc.perform(get("/add").param("a",a).param("b",b));
        responseEntity.andExpect(status().isOk());
        String result = responseEntity.andReturn().getResponse().getContentAsString();
        System.out.println(result);
        assertEquals("8.0", result);
    }

    @Test
    public void testCalculatorAppControllerSub() throws Exception {
        String a="4.0";
        String b="4.0";
        ResultActions responseEntity = mockMvc.perform(get("/sub").param("a",a).param("b",b));
        responseEntity.andExpect(status().isOk());
        String result = responseEntity.andReturn().getResponse().getContentAsString();
        System.out.println(result);
        assertEquals("0.0", result);
    }

    @Test
    public void testCalculatorAppControllerMulti() throws Exception {
        String a="4.0";
        String b="4.0";
        ResultActions responseEntity = mockMvc.perform(get("/multi").param("a",a).param("b",b));
        responseEntity.andExpect(status().isOk());
        String result = responseEntity.andReturn().getResponse().getContentAsString();
        System.out.println(result);
        assertEquals("16.0", result);
    }

    @Test
    public void testCalculatorAppControllerDiv() throws Exception {
        String a="4.0";
        String b="4.0";
        ResultActions responseEntity = mockMvc.perform(get("/div").param("a",a).param("b",b));
        responseEntity.andExpect(status().isOk());
        String result = responseEntity.andReturn().getResponse().getContentAsString();
        System.out.println(result);
        assertEquals("1.0", result);
    }
}
