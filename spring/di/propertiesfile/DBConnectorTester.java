package spring.di.propertiesfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DBConnectorTester {

	public static void main(String[] args) {

		ApplicationContext ctxt = new ClassPathXmlApplicationContext("resources/PropertiesDI.xml");
		DBConnector dc = ctxt.getBean("dc", DBConnector.class);
		dc.createConnection();
	}

}
