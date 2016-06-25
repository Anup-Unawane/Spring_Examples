package spring.dao.springorm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringORMTester {

	public static void main(String[] args) throws Exception {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("resources/dao/springormtest.xml");
		StudentDAOInterface bo = ctxt.getBean("studentDAOImpl", StudentDAOInterface.class);
		
		// Insert New Student
		Student st = new Student();
		st.setId(3);
		st.setName("Yukta");
		st.setEmail("Yukta@gmail.com");
		st.setAddress("Pune");
		
		bo.save(st);
		
		//Find using primary Key
		Student st2 = bo.findByPK(2);
		System.out.println(st2.getName() + "," + st2.getAddress());

		//Retrieve all students
		List<?> lst = bo.findAllUsingHQL();
		for(Object st3 : lst)
		{
			Student tmp = (Student) st3;
			System.out.println(tmp.getName() + "," + tmp.getAddress());
		}
		
		//Update fetched student
		st2.setAddress("Kolhapur");
		bo.update(st2);
		
		//Delete student
		bo.delete(st);
		
		System.out.println("Done!!!");
	}

}
