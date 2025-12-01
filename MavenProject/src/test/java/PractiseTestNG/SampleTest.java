package PractiseTestNG;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.annotations.Test;


public class SampleTest {	

@Test
public void Demo1()
{
	System.out.println("Testing");
}
@Test
public void Aemo1test()
{
	System.out.println("Testing second time");
	
	Date d= new Date();
	SimpleDateFormat sim=new SimpleDateFormat("dd-MM-yyyy");
	sim.format(d);
	
	Calendar cal=sim.getCalendar();
	cal.add(Calendar.DAY_OF_MONTH, 30);
	String ddd=sim.format(cal.getTime());
	System.out.println(ddd);
	
	
	
}
}
