package TestNG1;

import org.testng.annotations.Test;

public class SampleTestSamePkg {

	@Test(groups = {"Sanity"}, enabled=true, description = "This is my Sanity Test")
	public void Test13() {
		System.out.println("Test13 Sanity");
	}

	@Test(dependsOnMethods = {"Test14"})
	public void Test15() {
		System.out.println("Test15 Depends");
	}
	
	@Test
	public void Test14() {
		System.out.println("Test14 Regression");
	}
		
	
	
}
