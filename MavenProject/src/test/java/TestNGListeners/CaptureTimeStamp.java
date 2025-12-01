package TestNGListeners;

import java.util.Date;

public class CaptureTimeStamp {
public static void main(String[] args) {
	
String newdate=new Date().toString().replace("","_").replace(":", "_");

System.out.println(newdate);
}
}