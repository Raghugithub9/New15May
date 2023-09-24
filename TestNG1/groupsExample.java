package TestNG1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class groupsExample {



@AfterSuite
public void Test5() {
		System.out.println("After Suite");
	}
	
@BeforeTest
public void Test2() {
	System.out.println("Before Test");
}

@BeforeClass
public void Test3() {
	System.out.println("Before Class");
}

@BeforeMethod
public void Test4() {
	System.out.println("Before Method");
}


@BeforeSuite
public void Test1() {
	System.out.println("Before Suite");
}

@AfterTest
public void Test6() {
	System.out.println("After Test");
}

@AfterClass
public void Test7() {
	System.out.println("After Class enabled true");
}


@Test(groups = {"Sanity","Regression"})
public void Testing() {
	System.out.println("This is Testing");
}

@Test(groups = {"Regression"})
public void Testing1() {
	System.out.println("This is Test Case Regression");
}
	
}
