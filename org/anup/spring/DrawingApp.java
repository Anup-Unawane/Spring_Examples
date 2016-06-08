package org.anup.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) 
	{
//		BeanFactory bf = new XmlBeanFactory(new FileSystemResource("spring.xml"));
//		Triangle tr = (Triangle) bf.getBean("triangle");
//		tr.draw();
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring2.xml");
		Triangle tr2 = (Triangle) ctx.getBean("triangle");
		tr2.draw();
	}

}
