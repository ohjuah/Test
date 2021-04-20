package use;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pdf.p76.Bar;
import pdf.p76.Foo;


public class AnnoMain {

	public static void main(String[] args) {
		ApplicationContext context=
				new ClassPathXmlApplicationContext("config/anno.xml");
				Bar bar =(Bar)context.getBean("bar");
				bar.doBar();
				System.out.println("~~~~~~");
				Foo foo = (Foo)context.getBean("foo");
				foo.doFoo();
				foo.start();
				foo.setName("name이여라~~");
				foo.stop();
				
	}

}
