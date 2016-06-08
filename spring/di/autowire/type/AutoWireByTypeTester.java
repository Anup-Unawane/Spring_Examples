package spring.di.autowire.type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireByTypeTester {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("resources/AutoWireByType.xml");
		Car c = ctx.getBean("car_bytype", Car.class);
		c.printCarData();
	}

}
