package TestNG3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterExample {

	@Test (priority = 1)
	public void OpenBrowser() {
		System.setProperty("webdriver.geckodriver.driver", "geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Reporter.log("Accessing the application");
		driver.get("https://linkedin.com");
		WebElement user=driver.findElement(By.id("session_key"));
		user.sendKeys("raghutest@gmail.com");
		Reporter.log("Entered User details");
		WebElement password=driver.findElement(By.name("session_password"));
		password.sendKeys("NewTest123");	
		WebElement forgotpassword=driver.findElement(By.linkText("Forgot password?"));
		forgotpassword.click();

			}
	
	
}
