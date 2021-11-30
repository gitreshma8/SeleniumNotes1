package ngtutorial.pckge;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class ParameterizationAmazon {

	@BeforeMethod
	 @Parameters({"URL","username","password"})
	public void lverifyPreSetup(String URL,String username,String password) {
		  
		  System.out.println("Open Browser");
		  System.out.println("Launch url "+URL);
		  System.out.println("Sign in as username :"+username+" " +"and password :"+ password);
		  
	}
  @Test
 
  public void searchProduct() {
	  
	  System.out.println("Search for product iphoe X");
		  
  }
  
  @Test
 @Parameters({"product"})
  public void searchProduct(@Optional("Google pixel") String product) {
	 
	  System.out.println("Search for product iphoe X :"+product);
	  System.out.println("Add to wish list");
	 	  
  }
  
  @Test
 
  public void addToCart() {
	 
	  System.out.println("Go to wish list");
	  System.out.println("Add to cart");
	 	  
  }
  
  @AfterMethod
  public void postSetup() {
	  System.out.println("signout");
	  System.out.println("Close the browser");  
	  System.out.println("=============");
	  
  }
 

}
