package TestNG3;

import org.testng.annotations.Test;

public class dependsgroupExample {

	
	   /* @Test(dependsOnGroups = {"Sanity"})
	    public void ViewAcc() {
	        System.out.println("View Your Dashboardd");
	    } */
	 
	    @Test(groups = { "Sanity" })
	    public void OpenBrowser() {
	        System.out.println("Browser Opened Successfully");
	    }
	 
	    @Test(groups = { "Regression","Sanity" })
	    public void LogIn() {
	        System.out.println("Login Into The Account");
	    }
	    
	    @Test(groups = { "Regression" })
	    public void Logout() {
	        System.out.println("Logout");
	    }
	    
	   
	    
	}

