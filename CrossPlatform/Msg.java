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
	    	javax.swing.JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, javax.swing.JOptionPane.INFORMATION_MESSAGE);
	    }
}

