package provider.test;

import java.io.IOException;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderTest {

	@Test
	public void startTest() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:springjob.xml");
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:springmvc.xml",
//				"classpath:springjob.xml");
        context.start();

        System.out.println("Dubbo provider start...");

        try {
            System.in.read();   // 按任意键退出
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
			context.close();
		} 
	}
	
	
	
}
