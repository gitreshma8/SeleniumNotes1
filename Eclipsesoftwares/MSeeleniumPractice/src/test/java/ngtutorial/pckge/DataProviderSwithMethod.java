package ngtutorial.pckge;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//public class DataProviderSwithMethod extends DataProviderInherit {
	public class DataProviderSwithMethod {
	
	@Test(dataProvider="getData",dataProviderClass=DataProviderInherit.class)
	 
	  public void verifyAddition(int a,int b,int result) {
		  
		  int total=a+b;
		  Assert.assertEquals(total, result);
		    }
	  
	  @Test(dataProvider="getData",dataProviderClass=DataProviderInherit.class)//passing dataprovider class here in test method
	  public void verifyLengthString(String name,int count) {
		  
		  int result=name.length();
		  Assert.assertEquals(result, count);
	  }
	  
	
	  
	  
	}


