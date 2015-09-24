package input.controller;

import input.view.PopUpDisplay;

public class InputController
{
	
	private PopUpDisplay myPopUps;
	
	public InputController()
	//public InputController is called that because thats the class name
	{
		myPopUps = new PopUpDisplay();
		//Defining a thing with () = creating. a (); means you're calling it
	}
	
	public void start()
	{
		//the.grabAnswer makes a text field 
		String temp = myPopUps.grabAnswer("typ in ur name m8y");
	
	myPopUps.showResponse("Your name is " + temp + " ,now clik like");
	
	
	
	//if(isInteger(temp))
	//{
	//	myAge = Integer.parseInt(temp);
	//}
	//else
	//{
	//	myAge = -999999999;
	//}
	
	

	//String tempWeight = myPopups.grabAnswer("type in your w8");
	//double myWeight = double.parseDouble(tempWeight);
	//myPopUps.showResponse("you typed" +myWeight);
	
	//myTestThing = new Thingy(myName, myAge, myWeight);
	
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
