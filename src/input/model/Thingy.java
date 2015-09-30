package input.model;

//declaration
public class Thingy
{
private String name;
private int age;
private double weight;

/**
 * Sets the default age  and weight
 */
public Thingy()
	{
		name = "tommy";
		age = 12;
		weight = 61.8;
	}

public Thingy(String name, int age, double weight)
{
this.name = name;
this.age = age;
this.weight = weight;
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
public void setWeight(double weight)
{
	this.weight = weight;
	
}










}
