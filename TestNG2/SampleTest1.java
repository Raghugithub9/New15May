package TestNG2;


import org.testng.annotations.Test;

public class SampleTest1 {

	
	@Test(groups = {"Sanity","Regression", "Smoke"})
	public void Test11() {
		System.out.println("Test11");
	}


	@Test(priority = 1, groups= {"Sanity","Regression"}, description="This is my Test12 Method")
	public void Test12() {
		System.out.println("Test12");
	}
	
	@Test(priority = 2, groups= {"Smoke"})
	public void Test13() {
		System.out.println("Test12");
	}
	
}
