import java.rmi.*;

/**
 * @author Nicholas
 * 
 *	-This is an interface.
 *
 */


public interface AddServerIntf extends Remote 
{
		double add(double d1, double d2) throws RemoteException; 
}

