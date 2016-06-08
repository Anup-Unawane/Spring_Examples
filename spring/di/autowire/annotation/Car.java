package spring.di.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car 
{
	private String carName;
	
	@Qualifier(value="e2")
	@Autowired
	private Engine engine;
	

	public Car(String carName)
	{
		this.carName = carName;
	}	
	public void printCarData()
	{
			System.out.println(carName);
		
			System.out.println(engine.getModelYear());
	}


	public String getCarName() {
		return carName;
	}


	public void setCarName(String carName) {
		this.carName = carName;
	}


	public Engine getEngine() {
		return engine;
	}

}
