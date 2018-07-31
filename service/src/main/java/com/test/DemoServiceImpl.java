package com.test;
import org.springframework.stereotype.Service;

import com.test.DemoService;
@Service("demoService")
public class DemoServiceImpl implements DemoService{

	public String sayHello(String name) {
		System.out.println("demoService...sayHello()-------->>>>>>");
		return "hello: "+name;
	}
	
	public String cacheHello(String name) {
		System.out.println("demoService...cacheHello()-------->>>>>>");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "hello: "+name;
	}

   
}