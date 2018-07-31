package com.test;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "classpath:springmvc.xml" });

        context.start();
        System.out.println("consumer start......");
        long start=System.currentTimeMillis();
        DemoService demoService = (DemoService) context.getBean("demoService");
        String str = demoService.sayHello("kangkang");
        long time=System.currentTimeMillis()-start;
        System.out.println("time:"+time);
        System.out.println("str:"+str);
        
        start=System.currentTimeMillis();
        str = demoService.sayHello("kangkang");
        time=System.currentTimeMillis()-start;
        System.out.println("time:"+time);
        System.out.println("str:"+str);
        
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}