package spring.di.collections.all;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContainerTester {

	 public static void main(String[] args) {
		
		 ApplicationContext ctxt = new ClassPathXmlApplicationContext("resources/container.xml");
		 Container2 cnt = ctxt.getBean("container", Container2.class);
		 cnt.printAllData();
		 
	}
	
}
