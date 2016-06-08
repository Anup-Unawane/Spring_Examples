package spring.di.collections.specific;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.TreeSet;
import java.util.Vector;

public class Container 
{
	private Vector<String> fruits;
	private TreeSet<String> cricketers;
	private Hashtable<String , String> countryCapitals;
	private Properties props;
	
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



	public Vector<String> getFruits() {
		return fruits;
	}



	public void setFruits(Vector<String> fruits) {
		this.fruits = fruits;
	}



	public TreeSet<String> getCricketers() {
		return cricketers;
	}



	public void setCricketers(TreeSet<String> cricketers) {
		this.cricketers = cricketers;
	}



	public Hashtable<String, String> getCountryCapitals() {
		return countryCapitals;
	}



	public void setCountryCapitals(Hashtable<String, String> countryCapitals) {
		this.countryCapitals = countryCapitals;
	}



	public Properties getProps() {
		return props;
	}



	public void setProps(Properties props) {
		this.props = props;
	} 
}
