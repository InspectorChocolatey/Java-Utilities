import javax.swing.JOptionPane;
import java.lang.*;

/**
 * 
 * @author Nicholas
 *
 *	References:
 *
 *	https://stackoverflow.com/questions/7080205/popup-message-boxes
 *
 */


public class Msg 
{
		public static void main(java.lang.String[] ARGS) 
		{
			String infoMessage = "Nicholas";
			String titleBar = "This is a message from: ";
			infoBox(infoMessage, titleBar);
		}
	
	
	    public static void infoBox(String infoMessage, String titleBar)
	    {
	        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
	    }
}

