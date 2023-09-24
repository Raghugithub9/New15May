

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class SLTest {

	@Test
	public void SLLoginTest(){

		System.setProperty("webdriver.gecko.driver", "C://Users//lenovo//Desktop//Trainings//Selenium//Drivers//geckodriver-v0.31.0-win64//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LoginLink.click();

		WebElement UserName= driver.findElement(By.name("user_login"));
		WebElement Password= driver.findElement(By.id("password"));
		WebElement RememberMe = driver.findElement(By.className("rememberMe"));
		WebElement LoginBtn = driver.findElement(By.name("btn_login"));

		UserName.sendKeys("raghu1@gmail.com");
		Password.sendKeys("Password1");
		RememberMe.click();
		LoginBtn.click();
		
		WebElement ErrorMsg=driver.findElement(By.id("msg_box"));
		String ActualMsg=ErrorMsg.getText();
		System.out.println(ActualMsg);
		String ExpMsg = "New message";
		
		//Assertion
		
		if(ActualMsg.equals(ExpMsg)) {
			System.out.println("TC Passed");
		}else {
			System.out.println("TC Failed");
		}
		driver.quit();
			}
	
	

	
	
}
