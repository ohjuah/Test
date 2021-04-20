package use;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class P36Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource("config/p36.xml");
		System.out.println("1");
		BeanFactory factory = new XmlBeanFactory(resource);
		System.out.println("2");
		//System.out.println(factory.getBean("foo"));
		System.out.println(factory.getBean("fooSet"));
	}

}
