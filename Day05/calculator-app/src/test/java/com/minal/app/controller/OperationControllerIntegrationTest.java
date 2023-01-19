package com.minal.app.controller;

import com.minal.app.controller.OperationController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@RunWith(SpringRunner.class)
@WebMvcTest(OperationController.class)

public class OperationControllerIntegrationTest
{
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void addTest() throws Exception
    {
        long a = (long) 12.0;
        long b = (long) 6.0;
        ResultActions response = mockMvc.perform(get("/add").param("a", String.valueOf(a)).param("b", String.valueOf(b)));
        response.andExpect(status().isOk());
        String resD = response.andReturn().getResponse().getContentAsString();
        System.out.println(resD);
        assertEquals("18",resD);
    }

    @Test
    public void subTest() throws Exception
    {
        long a = (long) 12.0;
        long b = (long) 6.0;
        ResultActions response = mockMvc.perform(post("/sub").param("a", String.valueOf(a)).param("b", String.valueOf(b)));
        response.andExpect(status().isOk());
        String resD = response.andReturn().getResponse().getContentAsString();
        System.out.println(resD);
        assertEquals("6",resD);
    }

    @Test
    public void mulTest() throws Exception
    {
        long a = (long) 12.0;
        long b = (long) 6.0;
        ResultActions response = mockMvc.perform(put("/multi").param("a",String.valueOf(a)).param("b",String.valueOf(b)));
        response.andExpect(status().isOk());
        String resD = response.andReturn().getResponse().getContentAsString();
        System.out.println(resD);
        assertEquals("72",resD);
    }

    @Test
    public void divTest() throws Exception
    {
        long a = (long) 12.0;
        long b = (long) 6.0;
        ResultActions response = mockMvc.perform(delete("/div").param("a",String.valueOf(a)).param("b",String.valueOf(b)));
        response.andExpect((status().isOk()));
        String resD = response.andReturn().getResponse().getContentAsString();
        System.out.println(resD);
        assertEquals("2",resD);
    }
}
