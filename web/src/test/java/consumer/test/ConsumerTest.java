package consumer.test;

import java.io.IOException;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.DemoService;

public class ConsumerTest {


	@Test
	public void test() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "classpath:springmvc.xml" });
        System.out.println("consumer start......");
        DemoService demoService = (DemoService) context.getBean("demoService");
        String str = demoService.sayHello("kangkang");
        System.out.println(str);
        context.close();
	}
	
	@Test
	public void cacheTest() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "classpath:springmvc.xml" });
        System.out.println("consumer start......");
        long start=System.currentTimeMillis();
        DemoService demoService = (DemoService) context.getBean("demoService");
        String str = demoService.cacheHello("kangkang");
        long time=System.currentTimeMillis()-start;
        System.out.println("time:"+time);
        System.out.println("str:"+str);
        
        start=System.currentTimeMillis();
        str = demoService.cacheHello("kangkang");
        time=System.currentTimeMillis()-start;
        System.out.println("time:"+time);
        System.out.println("str:"+str);
	    context.close();

	}
	
}
