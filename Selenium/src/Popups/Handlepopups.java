package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Handlepopups 
{
public static void main(String[]args)
{
	FirefoxProfile profile=new FirefoxProfile();
	profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/tar.gz");
	System.setProperty("webdriver.gecko.driver","/home/tyss/Desktop/softwares/geckodriver");
	WebDriver driver=new FirefoxDriver(profile);
	driver.get("https://maven.apache.org/download.cgi");
	WebElement ele=driver.findElement(By.xpath("//a[text()='apache-maven-3.5.2-bin.tar.gz']"));
	ele.click();
	
	
	
	
	driver.close();
	
	
}

}
