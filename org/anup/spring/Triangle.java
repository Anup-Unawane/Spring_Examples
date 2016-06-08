package org.anup.spring;

public class Triangle 
{
	private String type;
	private int height;
	
	public Triangle(String typ)
	{
		type = typ;
	}
	
	public Triangle(String typ, int hght)
	{
		type = typ;
		height = hght;
	}
	
	public void draw()
	{
		System.out.println( "Height:" + height + " " + type + " Traingle Drawn!!");
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getHeight() {
		return height;
	}
	
}
