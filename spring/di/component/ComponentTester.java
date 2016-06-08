package spring.di.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentTester {

	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("resources/SpringComponent.xml");
		 Car cnt = ctxt.getBean(Car.class);
		 cnt.printCarData();
	}

}
