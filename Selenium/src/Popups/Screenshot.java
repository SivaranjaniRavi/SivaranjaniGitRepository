package Popups;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot 
{
	


	public static void main(String[] args) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","/home/tyss/Desktop/softwares/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=UfQcWsvnNYejX_24ilg");
TakesScreenshot tk=(TakesScreenshot)driver;
		
		File src=tk.getScreenshotAs(OutputType.FILE);
		File dest=new File("/home/tyss/Desktop/Selenium/Selenium/Screensht/screen1.png");
		FileUtils.copyFile(src,dest);
        driver.close();

	}

}
