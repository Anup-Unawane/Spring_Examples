package spring.di.beanlifecycle.annotationconf;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LCBeanAnnotationConfTest {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = new ClassPathXmlApplicationContext("resources/LCBeanAnnotationConf.xml");
		LCBean l1 = ctxt.getBean("l1", LCBean.class);
		
		System.out.println("Closing Context ");
		ctxt.close();
		System.out.println("Done!!!");
	}

}
