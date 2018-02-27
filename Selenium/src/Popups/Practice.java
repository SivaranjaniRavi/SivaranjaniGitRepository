package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(itlistners.listnrs.class)
public class Practice 
{
@Test
public static void action1()
{
	
	System.setProperty("webdriver.chrome.driver","/home/tyss/Desktop/softwares/chromedriver");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.bluestone.com/jewellery/bangles.html");
	driver.manage().window().maximize();
	WebElement ele = driver.findElement(By.xpath("//span[text()='Stnes']"));
 // WebElement ele1 = driver.findElement(By.xpath("//span[text()=' Ruby ']"));
	
Actions act=new Actions(driver);
act.moveToElement(ele).perform();


//ele1.click();
	
	 try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

driver.close();
	 


}
}
