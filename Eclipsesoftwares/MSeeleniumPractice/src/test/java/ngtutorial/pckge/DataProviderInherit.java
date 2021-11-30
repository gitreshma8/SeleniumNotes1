package ngtutorial.pckge;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderInherit {
	
	
//	public DataProviderInherit() {//creating a default constructor which means without parameters
//		
//		System.out.println("I ma in DataProviderInheritconstructor");
//	}
	
public  DataProviderInherit(String Name) {//creating a parameterised constructor ,should make the dataprovider method static to run
		
		System.out.println("I ma in DataProviderInheritconstructor"+Name);
	}

//dataProvider3 for Mercury class
@DataProvider(name="datamercury-provider")
public static Object[][] getMercuryLogin(){
	  
	  return new Object[][] {
		  
		  {"tutorial","tutoria"},
		  {"tutorial","tutorial"}
};
}


//dataProvider2 for Heroclass
@DataProvider (name="data-provider")
public  static Object[][] getLoginData(){
	 
	 return new Object[][] {
		 
		 {"tomsmith232","SuperSecretPassword"},
		 {"tomsmith232","SuperSecretPrd"}
		 
	 };
	
}
	  @DataProvider//we have no data provider name so passing getData method in @test
		 public static Object[][] getData(Method method){//to get the method
			 
		  
		  
		 switch(method.getName()){//switch basis on name of method
			 
			 case "verifyAddition" :
				 
				 return new Object[][] {
					  
					  
					  {1,2,3},//here passing int a,b & result
					  {3,4,70},
					  {10,2,112}

				  };
				 
			 case "verifyLengthString" :
				 return new Object[][] {
					  
					  {"rana",4},
					  {"Engineer",8}
				  };
				  		 
				 }
			 return null;//since its a string return null
		 }
		  
		  

}
