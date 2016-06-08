package spring.di.factorybeanimpl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanImplTester {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("resources/FactoryBeanImpl.xml");
		Car c = ctx.getBean("cf", Car.class);
		c.drive();
	}

}
