package spring.di.collections.all;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Container2 
{
	private List<String> fruits;
	private Set<String> cricketers;
	private Map<String , String> countryCapitals;
	private Properties props;
	public List<String> getFruits() {
		return fruits;
	}
	public void setFruits(List<String> fruits) {
		this.fruits = fruits;
	}
	public Set<String> getCricketers() {
		return cricketers;
	}
	public void setCricketers(Set<String> cricketers) {
		this.cricketers = cricketers;
	}
	public Map<String, String> getCountryCapitals() {
		return countryCapitals;
	}
	public void setCountryCapitals(Map<String, String> countryCapitals) {
		this.countryCapitals = countryCapitals;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	
	public void printAllData()
	{
		for(String fruit : fruits)
			System.out.println(fruit);
		
		for(String player: cricketers)
			System.out.println(player);
		
		for(Entry<String, String> etry : countryCapitals.entrySet())
			System.out.println(etry.getKey() + "---" + etry.getValue());
		
		for(Entry<Object, Object> etry : props.entrySet())
		{
			System.out.println(etry.getKey() + "::::" + etry.getValue());
		}
	} 
}
