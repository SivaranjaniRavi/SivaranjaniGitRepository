package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class JavascriptExecutor {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","/home/tyss/Desktop/softwares/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.seleniumhq.org/");
		//driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement scroll = driver.findElement(By.xpath("//a[.='Learn more about sponsorship']"));
		Thread.sleep(1000);
		scroll.click();
		Point p = scroll.getLocation();
		int y=p.getY();
		System.out.println(y);
          org.openqa.selenium.JavascriptExecutor jc=(org.openqa.selenium.JavascriptExecutor)driver;
          jc.executeScript("window.scroll(0,"+y+")");
          
		driver.close();
		
		

	
	}

}
