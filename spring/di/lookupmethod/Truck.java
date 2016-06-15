package spring.di.lookupmethod;

public class Truck {

	public Engine getTruckEngine()
	{
		Engine e = new Engine();
		e.setName("Eicher");
		return e;
	}
}
