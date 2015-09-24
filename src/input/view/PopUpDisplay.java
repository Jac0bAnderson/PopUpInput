package input.view;

import javax.swing.JOptionPane;
/**
 * A popup display class used to show input and output.
 * @author Jacob Anderson
 *@version 1.0 09/24/15
 */
public class PopUpDisplay
{
	public void showResponse(String wordsFromSomewhere)
	{
		JOptionPane.showMessageDialog(null, wordsFromSomewhere);
	}
	
	
	public String grabAnswer(String stuff)
	{
		String answer = "";
		
	answer =	JOptionPane.showInputDialog(null, stuff);
		
		return answer;
	}
	
	
	
}
