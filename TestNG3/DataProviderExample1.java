package TestNG3;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

	
	
	@DataProvider (name = "TestData")
    public Object[][] TestData(){
	 return new Object[][] {{"Mobile"}, {"Laptop"}, {"Desktop"}};
    }
	
	
	
   @Test (dataProvider = "TestData")
   public void Testwithdata (String val) {
       System.out.println("Passed Parameter Is : " + val);
       
      Reporter.log("DataProvider example worked", true);

      //Comparison
       String expectedTitle = val;
       String originalTitle = "Laptop";
       Assert.assertEquals(originalTitle, expectedTitle);

       //Comparison
       if(expectedTitle.equalsIgnoreCase(originalTitle)) {
    	   System.out.println("Both same");
       }else {
    	   System.out.println("Both not same");
       }
       
   }
   
	
}
