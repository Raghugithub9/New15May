package TestNG1;

import org.testng.annotations.Test;

public class priorityExample {

@Test(priority=2)
public void Test1() {
	System.out.println("Test1");
}

@Test
public void Test2() {
	System.out.println("Test2");
}

@Test(priority=1)
public void Test3() {
	System.out.println("Test3");
}

	
}
