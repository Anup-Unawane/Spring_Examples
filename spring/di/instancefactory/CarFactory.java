package spring.di.instancefactory;

public class CarFactory 
{
	private String carName;

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	public Car getInstance() throws Exception
	{
		return (Car) Class.forName(carName).newInstance();
	}
}
