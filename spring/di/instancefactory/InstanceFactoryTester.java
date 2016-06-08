package spring.di.instancefactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceFactoryTester {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("resources/InstanceFactory.xml");
		Car c = ctx.getBean("c", Car.class);
		c.drive();
	}

}
