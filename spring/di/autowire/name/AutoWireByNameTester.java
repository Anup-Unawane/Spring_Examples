package spring.di.autowire.name;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireByNameTester {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("resources/AutoWireByName.xml");
		Car c = ctx.getBean("car_byname", Car.class);
		c.printCarData();
	}

}
