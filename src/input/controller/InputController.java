package input.controller;

import input.view.PopUpDisplay;
import input.model.Thingy;

public class InputController
{
	
	private PopUpDisplay myPopUps;
	
	private Thingy myTestThing;
	
	public InputController()
	                                                          //public InputController is called that because thats the class name
	{
		myPopUps = new PopUpDisplay();
		//Defining a thing with () = creating. a (); means you're calling it
	}
	
	 
	public void start()
	{
		                                                        //the.grabAnswer makes a text field 
		String myName = myPopUps.grabAnswer("typ in ur name m8y");
	
	myPopUps.showResponse("Your name is " + myName + " ,now clik like");
	
	String tempAge = myPopUps.grabAnswer("type in your age");
	int myAge;
	while(!isInteger(tempAge))
	{
		tempAge =myPopUps.grabAnswer("type in a positive integer for your age");
	}
	
	if(isInteger(tempAge))
	{
		myAge = Integer.parseInt(tempAge);
	}
else
	{
		myAge = -999999999;
	}
	
	

	String tempWeight = myPopUps.grabAnswer("type in your w8");
	double myWeight;
	if(isDouble(tempWeight))
	{
		myWeight = Double.parseDouble(tempWeight);
	}
	else
	{
		myWeight = -999999;
	}
	myPopUps.showResponse("you weigh " +myWeight+ "pounds");
	
	myTestThing = new Thingy(myName, myAge, myWeight);
	
	}
	private boolean isInteger(String input)
	{
		boolean isInt = false;
		
		try
		{
			int temp = Integer.parseInt(input);
			isInt = true;
		}
		catch(NumberFormatException error)
		{
		myPopUps.showResponse("not an int - bad value will be used");
		}
		
		return isInt;
	}
		private boolean isDouble(String input)
		{
			boolean isDouble = false;
				
				try
				{
					// the double after the = is a capital D, but it still works.......
				double temp = Double.parseDouble(input); 
				isDouble = true;
				}
				catch(NumberFormatException error)
				{
					myPopUps.showResponse(" not a double - bad value will be used");
				}
				return isDouble;
		}
	
	

}
