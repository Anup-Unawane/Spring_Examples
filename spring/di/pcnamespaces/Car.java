package spring.di.pcnamespaces;

public class Car 
{
	private String carName;
	private Engine engine;
	
	
	public void printCarData()
	{
			System.out.println(carName);
		
			System.out.println(engine.getModelYear());
	}


	public String getCarName() {
		return carName;
	}


	public void setCarName(String carNamea) {
		this.carName = carNamea;
	}


	public Engine getEngine() {
		return engine;
	}


	public void setEngine(Engine engine) {
		this.engine = engine;
	}
}
