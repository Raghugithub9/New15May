package TestNG3;

import org.testng.Assert;
import org.testng.annotations.Test;
//import org.testng.asserts.Assertion;

public class AssertExample {

@Test
public void test() {
	System.out.println("Test method");

String exp="Selenium 2";
String act="Selenium 2";

Assert.assertEquals(exp, act);

/*if(exp.equals(act)) {
	System.out.println("exp and act are same");
}else {
	System.out.println("exp and act are not same");
}*/

}
	
}
