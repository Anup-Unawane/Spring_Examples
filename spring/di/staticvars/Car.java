package spring.di.staticvars;

public class Car {

	private static String carType;

	public static String getCarType() {
		return carType;
	}

	public static void setCarType(String carType) {
		Car.carType = carType;
	}
	
	public static void printCarType()
	{
		System.out.println("Car Type is ::" + Car.carType);
	}
}
