package input.model;

public class Thingy
{
private String name;
private int age;
private double weight;

public Thingy()
	{
		name = "";
		age = -99;
		weight = -.008;
	}
//getters
	public String getName()
	{
	return name;
	
	}
public int getAge()
{
	return age;
	
}
public double getWeight()
	{
	return weight;
	
	}
//setters
public void setName(String name)
{
	this.name = name;
	
}
public void setAge(int age)
	{
	this.age = age;
	}
public void setWeight(Double weight)
{
	this.weight = weight;
	
}










}
