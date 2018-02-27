package Popups;

import java.text.SimpleDateFormat;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(itlistners.listnrs.class)
public class Date 
{
@Test
	public  void date()
	{
		Date d=new Date();
		SimpleDateFormat s=new SimpleDateFormat("dd:mm:yyyy HH:MM:SS");
	    String today=s.format(d);
	    System.out.print(today);
		
		
		
	}
	
}
