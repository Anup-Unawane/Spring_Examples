package spring.di.autowire.jsrannotation;

import javax.annotation.Resource;

public class Car 
{
	private String carName;
	
	
	//Autowire using Name
	@Resource
	private Engine engine;
	

	public Car(String carName)
	{
		this.carName = carName;
	}	
	public void printCarData()
	{
		System.out.println(carName + " has Engine:" + engine.getModelYear());
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
