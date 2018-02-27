package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Fileupload 
{
	public static void main(String[]args) throws InterruptedException
	{
		
	
	//input[@name='uploadCV']
	
		System.setProperty("webdriver.gecko.driver","/home/tyss/Desktop/softwares/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://my.naukri.com/account/register/basicdetails");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("html/body/div/form/div[1]/div/button"));
		ele.click();
		Thread.sleep(2000);
		WebElement ele1=driver.findElement(By.name("uploadCV"));
		ele1.click();
		ele1.sendKeys("//home//tyss//Desktop//Documents//JavaPrograms.doc");
		
		
	}
}
