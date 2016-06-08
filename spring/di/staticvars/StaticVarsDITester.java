package spring.di.staticvars;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StaticVarsDITester {

	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("resources/staticVars.xml");
		Car c = ctxt.getBean("car_static_var", Car.class);
		c.printCarType();
	}

}
