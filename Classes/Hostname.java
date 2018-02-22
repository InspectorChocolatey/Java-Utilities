import java.lang.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
public static String hostname(){ String hostname = "Unknown";
 try {      InetAddress addr;      addr = InetAddress.getLocalHost();      hostname = addr.getHostName(); } catch (UnknownHostException ex) {      hostname = "unknown"; } return hostname;}
String obj = hostname();
if(obj != "GP*"){ System.out.println("This does not appear to be a general parts computer!");}
