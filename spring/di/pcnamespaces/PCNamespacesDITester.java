package spring.di.pcnamespaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PCNamespacesDITester {

	public static void main(String[] args) {
		
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("resources/pcnamespaces.xml");
		Car car = ctxt.getBean("c3", Car.class);
		
		car.printCarData();
		 

	}

}
