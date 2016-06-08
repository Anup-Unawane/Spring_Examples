package spring.di.beanlifecycle.xmlconf;

public class LCBean 
{
	private String carName;
	
	public void beanDestroy() throws Exception {
		this.carName = null;
		System.out.println(" Closing Resources for predestroy..");
		// TODO Auto-generated method stub

	}

	public void afterBeanConstruct() throws Exception {
		System.out.println("initializing resources-using postconstruct--");
		System.out.println(" Car Name is set to :" + this.carName);
	}


	public String getCarName() {
		return carName;
	}


	public void setCarName(String carName) {
		this.carName = carName;
	}

}
