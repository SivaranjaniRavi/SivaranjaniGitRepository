package Screenshot;

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
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot2 {

	public static void main(String[] args) throws AWTException 
	{
		System.setProperty("webdriver.chrome.driver","/home/tyss/Desktop/softwares/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=UfQcWsvnNYejX_24ilg");
        Date date=new Date();
        SimpleDateFormat s=new SimpleDateFormat("dd:mm:yy HH:MM:SS");
        String todaydate = s.format(date);
        Dimension t = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle screen=new  Rectangle(t);
        Robot r=new Robot();
        BufferedImage img = r.createScreenCapture(screen);
        File dest=new File("/home/tyss/Desktop/Selenium/Selenium/Screensht/screen4"+todaydate+".png");
        try 
        {
			ImageIO.write(img, "png",dest);
		} 
        catch (IOException e) 
        {
			e.printStackTrace();
		}
        driver.close();

	}

}
