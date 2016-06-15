package spring.di.methodreplacer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MethodReplacerTester {

	public static void main(String[] args) 
	{
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("resources/MethodReplacer.xml");
		Bank b = ctxt.getBean("b", Bank.class);
		
		b.deposit();
		b.withdraw();
		b.calculateInterest();
		System.out.println(b.getClass().getCanonicalName());
	}

}
