package itlistners;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listnrs implements ITestListener
{
public static void main(String[]args)
{
	
}

@Override
public void onTestStart(ITestResult result) 
{
	// TODO Auto-generated method stub
	
}

@Override
public void onTestSuccess(ITestResult result) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestFailure(ITestResult result) 
{
String name=result.getMethod().getMethodName();
Date date=new Date();
SimpleDateFormat s=new SimpleDateFormat("dd:mm:yy HH:MM:SS");
String todaydate = s.format(date);
Dimension de = Toolkit.getDefaultToolkit().getScreenSize();
 Rectangle re=new Rectangle(de);
 Robot ro = null;
try {
	ro = new Robot();
} catch (AWTException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 BufferedImage img = ro.createScreenCapture(re);
 File dest=new File("/home/tyss/Desktop/Selenium/Selenium/Screensht/"+name+""+todaydate+".png");
 try {
	ImageIO.write(img, "png",dest);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 
  
}

@Override
public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	
}

@Override
public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	
}

@Override
public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	
}
}
