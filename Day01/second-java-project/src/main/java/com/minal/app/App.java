package com.minal.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Greeting greet = new Greeting();
        String a = greet.sayWelcome();
        System.out.println(a);
        String b = greet.sayHello();
        System.out.println(b);
        String c = greet.sayBye();
        System.out.println(c);
    }
}
