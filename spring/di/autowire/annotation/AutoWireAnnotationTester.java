package spring.di.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireAnnotationTester {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("resources/AutoWireAnnotation.xml");
		Car c = ctx.getBean("car_annotation", Car.class);
		c.printCarData();
	}

}
