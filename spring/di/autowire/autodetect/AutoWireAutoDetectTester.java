package spring.di.autowire.autodetect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireAutoDetectTester {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("resources/AutoWireAutoDetect.xml");
		Car c = ctx.getBean("car_autodetect", Car.class);
		c.printCarData();
	}

}
