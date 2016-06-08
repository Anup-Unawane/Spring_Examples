package spring.di.autowire.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireConstructorTester {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("resources/AutoWireConstructor.xml");
		Car c = ctx.getBean("car_constructor", Car.class);
		c.printCarData();
	}

}
