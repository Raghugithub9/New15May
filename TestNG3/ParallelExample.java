package TestNG3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelExample {
WebDriver driver;
	
@Test	
public void add1() {
	System.out.println("Add1");
	System.setProperty("webdriver.geckodriver.driver", "geckodriver.exe");
	  driver = new FirefoxDriver();	 
	  driver.get("https://www.facebook.com/");
}
@Test
public void add2() {
	System.out.println("Add2");
	 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://chromedriver.chromium.org/downloads");
}

}
