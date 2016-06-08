package spring.di.beanlifecycle.beanimpl;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LCBean implements InitializingBean, DisposableBean 
{
	private String carName;
	@Override
	public void destroy() throws Exception {
		this.carName = null;
		System.out.println(" Car Name is set to null.");
		// TODO Auto-generated method stub

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		this.carName = "Baleno";
		System.out.println(" Car Name is set to :" + this.carName);
	}

}
