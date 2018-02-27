package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {

	public WebDriver driver = null;

	@BeforeSuite
	public void settingPath() {
		System.setProperty("webdriver.chrome.driver", "/home/tyss/Desktop/softwares/chromedriver");
		System.setProperty("webdriver.gecko.driver", "/home/tyss/Desktop/softwares/geckodriver");
	}

	@BeforeTest
	@Parameters("browser")
	public void openBrowser(String browser) {
		System.out.println(browser);
		if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {												
			driver = new ChromeDriver();
		}
	}

	@Test
	public void action() throws InterruptedException {

		System.out.println("ENtered test");

		driver.get("http://www.seleniumhq.org/");
		Thread.sleep(2000);
		WebElement scroll = driver.findElement(By.xpath("//a[.='Learn more about sponsorship']"));
		Thread.sleep(1000);
		Point p = scroll.getLocation();
		int y = p.getY();
		System.out.println(y);
		org.openqa.selenium.JavascriptExecutor jc = (org.openqa.selenium.JavascriptExecutor) driver;
		jc.executeScript("window.scroll(0," + y + ")");

	}

	@AfterTest
	public void closingBrowser() {
		driver.close();
		System.out.println("Finished");
	}
}
