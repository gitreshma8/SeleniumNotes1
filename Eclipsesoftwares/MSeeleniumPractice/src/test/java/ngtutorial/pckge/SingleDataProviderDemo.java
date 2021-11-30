package ngtutorial.pckge;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SingleDataProviderDemo {
	
	
  @Test(dataProvider="getData")
  
  public void verifyAddition(int a,int b,int result) {
	  
	  int total=a+b;
	  Assert.assertEquals(total, result);
	    }
  
  @Test(dataProvider="getlength")
  public void verifyLengthString(String name,int count) {
	  
	  int result=name.length();
	  Assert.assertEquals(result, count);
  }
  
  //multiple dataprovider
  @DataProvider(name="getlength")
  Object[][] getlen(){
	  return new Object[][] {
		  
		  {"rana",4},
		  {"Engineer",8}
	  };
	  
	  
  } 
  
  
  @DataProvider
  Object[][] getData(){
	  
	  return new Object[][] {
		  
		  
		  {1,2,3},//here passing int a,b & result
		  {3,4,7},
		  {10,2,12}

	  };
  }
  
}


