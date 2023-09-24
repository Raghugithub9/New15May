package TestNG1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestNG25Feb {

/*
@BeforeSuite
	@BeforeTest
		@BeforeClass
			@BeforeMethod
				@Test ---Test Case1
			@AfterMethod
			@BeforeMethod
				@Test ---Test Case2
			@AfterMethod
		@AfterClass
	@AfterTest
@AfterSuite
*/
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("AFter Suite Method");
	}
	
@BeforeSuite
public void beforesuite() {
	System.out.println("Before Suite Method");
}

@BeforeTest
public void beforetest() {
	System.out.println("Before Test Method");
}

@BeforeClass
public void beforeclass() {
	System.out.println("Before Class Method");
}

@BeforeMethod
public void beforemethod() {
	System.out.println("Before Method");
}



@AfterTest
public void aftertest() {
	System.out.println("After Test Method");
}

@AfterClass
public void afterclass() {
	System.out.println("After Class Method");
}

@AfterMethod
public void aftermethod() {
	System.out.println("After Method");
}



@Test(groups = {"Sanity","Regression"})
public void Test1() {
	System.out.println("Test Case 1");
}

@Test(groups = {"Regression"})
public void Test2() {
	System.out.println("Test Case 2");
}

@Test(groups = {"Sanity"})
public void Test3() {
	System.out.println("Test Case 3");
}
	
	
	
	
	
}
