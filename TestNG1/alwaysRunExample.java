package TestNG1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class alwaysRunExample {




@BeforeMethod(alwaysRun=true)
public void Test4() {
	System.out.println("Before Method always run true");
}


@BeforeSuite(alwaysRun=false)
public void Test1() {
	System.out.println("Before Suite always run false");
}



@Test(alwaysRun=false)//alwaysRun=false is invalid
public void Testing() {
	System.out.println("This is Testing always Run false");
}

@Test
public void Testing1() {
	System.out.println("This is Test Case Regression");
}
	
}
