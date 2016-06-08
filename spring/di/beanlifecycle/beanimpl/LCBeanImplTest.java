package spring.di.beanlifecycle.beanimpl;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LCBeanImplTest {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = new ClassPathXmlApplicationContext("resources/LCBeanImpl.xml");
		LCBean l1 = ctxt.getBean("l1", LCBean.class);
		
		System.out.println("Closing Context ");
		ctxt.close();
		System.out.println("Done!!!");
	}

}
