package TestNG3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowserExample {

	public WebDriver driver;

	  @Parameters("browser")
	  @BeforeClass
	  public void beforeTest(String browser) {
	  
	  if(browser.equalsIgnoreCase("firefox")) {
		  System.setProperty("webdriver.geckodriver.driver", "geckodriver.exe");
		  driver = new FirefoxDriver();	  

	  }else if (browser.equalsIgnoreCase("Chrome")) { 
		  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  driver = new ChromeDriver();

	  } 
	  }
	  
	 @Test
	 public void launchLinkedin() {
	  driver.get("https://in.linkedin.com"); 

	  }

	  

	  @AfterClass 
	  public void afterTest() {

			driver.quit();

		}

	}
