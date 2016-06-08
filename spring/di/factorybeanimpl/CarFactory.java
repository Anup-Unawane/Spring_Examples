package spring.di.factorybeanimpl;

import org.springframework.beans.factory.FactoryBean;

public class CarFactory implements FactoryBean<Car> 
{
	private String carName;

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	@Override
	public Car getObject() throws Exception {
		return (Car) Class.forName(carName).newInstance();
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}
}
