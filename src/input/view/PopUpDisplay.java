package input.view;

import javax.swing.JOptionPane;
/**
 * A popup display class used to show input and output.
 * @author Jacob Anderson
 *@version 1.0 09/24/15
 */
public class PopUpDisplay
{
	/**
	 * displays the supplied text as a popup window
	 * @param wordsFromSomewhere
	 */
	public void showResponse(String wordsFromSomewhere)
	{
		JOptionPane.showMessageDialog(null, wordsFromSomewhere);
	}
	/**
	 * displays a popup with a field  type ion a response 
	 * @param stuff A question to be displayed in the popup window
	 * @return the user's input as a string data type
	 */
	
	public String grabAnswer(String stuff)
	{
		String answer = "";
		
	answer =	JOptionPane.showInputDialog(null, stuff);
		
		return answer;
	}
	
	
	
}
