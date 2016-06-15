package spring.di.autowire.jsrannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireJSRAnnotationTester {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("resources/AutoWireJSRAnnotation.xml");
		Car c = ctx.getBean("car_annotation", Car.class);
		c.printCarData();
	}

}
