package TestNG3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ThreadExample {

	public WebDriver driver;
	 @Test
	  public void FirefoxTest() {	 
		 System.out.println("The thread ID for Firefox is "+ Thread.currentThread().getId());
		 System.setProperty("webdriver.geckodriver.driver", "geckodriver.exe");
		  driver = new FirefoxDriver();	 
		  driver.get("https://in.linkedin.com");
		  //driver.quit();

	  }
	 
	 @Test
	 public void ChromeTest(){ 
	       System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
	       System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	       driver = new ChromeDriver();
	       driver.get("https://www.facebook.com"); 
	       //driver.quit();
	 }
	 
	 @Test
	 public void ChromeTest1(){ 
	      
	       System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
	       System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	       driver = new ChromeDriver();
	       driver.get("https://chromedriver.chromium.org/downloads"); 
	       //driver.quit();
	 }
	 
	 @Test
	 public void ChromeTest2(){ 
	      
	       System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
	       System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	       driver = new ChromeDriver();
	       driver.get("https://www.rediff.com/"); 
	       //driver.quit();
	 }
	}
