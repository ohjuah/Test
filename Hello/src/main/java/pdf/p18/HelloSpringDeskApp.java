package pdf.p18;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class HelloSpringDeskApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource("app의전반적인환경설정.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		HelloBean  bean = (HelloBean)factory.getBean("x");
		bean.sayHello("^^^^");
	}

}
