package spring.dao.daotest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DAOTester {

	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("resources/dao/daotest.xml");
		StudentBO bo = ctxt.getBean("stdbo", StudentBO.class);
		
		Student st = new Student();
		st.setId(2);
		st.setName("Neha");
		st.setEmail("neha@gmail.com");
		st.setAddress("Nagar");
		
		bo.saveStudent(st);
		
		System.out.println("Done!!!");
	}

}
