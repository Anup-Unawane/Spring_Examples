package spring.di.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Here @Named Annotation from Java can be used
@Component
public class Car 
{
	@Autowired
	private Engine engine;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	
	public void printCarData()
	{
		System.out.println(" Car has engine: " + engine.getEngName());
	}
}
