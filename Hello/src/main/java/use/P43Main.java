package use;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class P43Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource("config/p43.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		System.out.println(factory.getBean("foo"));

		

	}

}
