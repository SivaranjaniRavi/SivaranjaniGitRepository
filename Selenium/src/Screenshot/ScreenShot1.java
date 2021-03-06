package Screenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ScreenShot1 {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","/home/tyss/Desktop/softwares/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=UfQcWsvnNYejX_24ilg");
        Date date=new Date();
        SimpleDateFormat s=new SimpleDateFormat("dd:mm:yy HH:MM:SS");
        String todaydate = s.format(date);
        EventFiringWebDriver w=new EventFiringWebDriver(driver);
        File src=w.getScreenshotAs(OutputType.FILE);
        File dest=new File("/home/tyss/Desktop/Selenium/Selenium/Screensht/screen2"+todaydate+".png");
        FileUtils.copyFile(src, dest);
        driver.close();

	}

}

