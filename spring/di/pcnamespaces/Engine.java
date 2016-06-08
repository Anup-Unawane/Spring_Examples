package spring.di.pcnamespaces;

public class Engine {
	private String modelYear;

	public String getModelYear() {
		return modelYear;
	}

	public Engine(String year)
	{
		modelYear = year;
	}
}
