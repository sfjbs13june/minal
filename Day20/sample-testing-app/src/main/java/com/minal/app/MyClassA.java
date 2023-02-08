package com.minal.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyClassA {
    @Autowired
    MyClassB myClassB;

    @Autowired
    MyClassC myClassC;
    public String method1(){
        return "hello";
    }
    public String method2(){
        String str= myClassB.getResult();
        return str;
    }

    public int method3(int age){
        int result= myClassC.getMyAge(age);
        return age;
    }

    public String method4(String data){
        String str= myClassB.getMyString(data);
        return str;
    }

    public int method5(){
        int result= myClassB.getClassCResult(myClassC);
        return result;
    }


    public void method6(){
        myClassB.NoreturnData("my data");

    }
}
