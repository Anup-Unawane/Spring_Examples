package spring.di.autowire.constructor;

public class Car 
{
	private String carName;
	private Engine engine;
	

	public Car(String carName, Engine engine)
	{
		this.carName = carName;
		this.engine = engine;
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
