package spring.di.propertiesfile;

public class DBConnector {
	private String url;
	private String driver;
	private String user;
	private String password;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void createConnection()
	{
		System.out.println("URL::" +url);
		System.out.println("Driver::" +driver);
		System.out.println("User::" +user);
		System.out.println("Password::" +password);
	}
}