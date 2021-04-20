package use;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class P41Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource("config/p41.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		System.out.println(factory.getBean("bar"));
		System.out.println("////////////////////////");
		System.out.println(factory.getBean("foo"));
		

	}

}
