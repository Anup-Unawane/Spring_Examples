package spring.di.lookupmethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LookUpMethodTester {

	public static void main(String[] args) {

		ApplicationContext ctxt = new ClassPathXmlApplicationContext("resources/LookUpMethod.xml");
		System.out.println("\n*** Car Interface ***");
		Car c = ctxt.getBean("c", Car.class);
		System.out.println(c.getCarEngine().getName());
		System.out.println(c.getClass().getCanonicalName());
		
		System.out.println("\n*** Bus Abstract Class ***");
		Bus b = ctxt.getBean("b", Bus.class);
		System.out.println(b.getBusEngine().getName());
		System.out.println(b.getClass().getCanonicalName());
		
		System.out.println("\n*** Truck Concrete Class ***");
		Truck t = ctxt.getBean("t", Truck.class);
		System.out.println(t.getTruckEngine().getName());
		System.out.println(t.getClass().getCanonicalName());
		
	}

}
