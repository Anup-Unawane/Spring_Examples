package spring.di.beanlifecycle.annotationconf;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LCBean 
{
	private String carName;
	
	@PreDestroy
	public void beanDestroy() throws Exception {
		this.carName = null;
		System.out.println(" Closing Resources..");
		// TODO Auto-generated method stub

	}

	@PostConstruct
	public void afterBeanConstruct() throws Exception {
		System.out.println("initializing resources---");
		System.out.println(" Car Name is set to :" + this.carName);
	}


	public String getCarName() {
		return carName;
	}


	public void setCarName(String carName) {
		this.carName = carName;
	}

}
