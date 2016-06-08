package spring.di.collections.array;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ArrayDITester {

	public static void main(String[] args) 
	{
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("resources/CarEngines.xml");
		Car cars = ctxt.getBean("c", Car.class);
		cars.printCarData();
	}

}
