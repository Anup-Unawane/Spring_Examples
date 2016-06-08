package spring.di.beanlifecycle.xmlconf;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LCBeanXMLConfTest {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = new ClassPathXmlApplicationContext("resources/LCBeanXMLConf.xml");
		LCBean l1 = ctxt.getBean("l1", LCBean.class);
		
		System.out.println("Closing Context ");
		ctxt.close();
		System.out.println("Done!!!");
	}

}
