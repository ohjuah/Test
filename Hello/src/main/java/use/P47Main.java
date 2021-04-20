package use;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import pdf.p46.CalculatorServiceImpl;
import pdf.p47.CalculatorMapImpl;

public class P47Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource("config/p47.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		System.out.println(factory.getBean("map"));
		System.out.println("비교해보세요 ");
		CalculatorMapImpl map = new CalculatorMapImpl();
		map.sample();
		

	}

}
