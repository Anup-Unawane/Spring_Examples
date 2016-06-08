package spring.di.collections.specific;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContainerTester2 {

	 public static void main(String[] args) {
		
		 ApplicationContext ctxt = new ClassPathXmlApplicationContext("resources/container2.xml");
		 Container cnt = ctxt.getBean("container2", Container.class);
		 cnt.printAllData();
		 
	}
	
}
