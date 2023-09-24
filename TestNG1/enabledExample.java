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

public class enabledExample {




@AfterTest(enabled=true)
public void Test6() {
	System.out.println("After Test enabled true");
}


@AfterClass(enabled=false)
public void Test7() {
	System.out.println("After Class enabled false");
}


@Test
public void Testing() {
	System.out.println("This is Testing");
}
	
}
