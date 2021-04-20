package use;

import java.applet.AppletContext;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import pdf.p46.CalculatorServiceImpl;
import pdf.p47.CalculatorMapImpl;
import pdf.p51.GreetingService;

public class P51Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource("config/p51.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config/p51.xml");
		//context.getBean()....
		
		
		GreetingService greetingService =(GreetingService)factory.getBean("greeting");
		System.out.println(greetingService.sayHello("아무거나 "));
		GreetingService greetingService2 =(GreetingService)factory.getBean("greeting2");
		System.out.println(greetingService2.sayHello("아무거나 "));

	}

}
