package selpractice.pckge;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleMultiSelect {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/newtours/reservation.php");
		
		WebElement leftflight=driver.findElement(By.linkText("Flights"));
		leftflight.click();
		
		List<WebElement> radiobtn=driver.findElements(By.name("tripType"));
		radiobtn.get(0).click();
		radiobtn.get(1).click();
		
		boolean roundtrip=radiobtn.get(0).isSelected();
		System.out.println("Checking for selection :"+roundtrip);
		
		boolean oneway=radiobtn.get(1).isSelected();
		System.out.println("Checking for selection :"+oneway);
		
		System.out.println();
		System.out.println("dropdown handle");
		
		WebElement passdrop=driver.findElement(By.name("passCount"));
		Select passcnt=new Select(passdrop);
		
		passcnt.selectByIndex(0);
		passcnt.selectByValue("2");
		passcnt.selectByIndex(3);
		WebElement selectedop=passcnt.getFirstSelectedOption();
		String passengers1st=selectedop.getText();
		
		System.out.println("Current SelectedOption :"+passengers1st);
		System.out.println();
		
		List<WebElement> plist=passcnt.getOptions();
		int p1=plist.size();
		
		for(int i=0;i<p1;i++)
		{
			String pvalues=plist.get(i).getText();
			System.out.println(pvalues);
					
		}
		
		System.out.println();
		System.out.println("Service Class radio handle");
		
		List<WebElement> servradiobtn=driver.findElements(By.name("servClass"));
		
		servradiobtn.get(0).click();servradiobtn.get(1).click(); servradiobtn.get(2).click();
		
		boolean sevr1=servradiobtn.get(0).isSelected();
		System.out.println("Checking serv drop selected :"+sevr1);
		System.out.println();
		System.out.println("Airline drodown handle");
		
		WebElement airdrop=driver.findElement(By.name("airline"));
		Select air1=new Select(airdrop);
		air1.selectByIndex(3);
		WebElement thirdindex=air1.getFirstSelectedOption();
		String value3=thirdindex.getText();
		
		System.out.println("3rd index value is :"+value3);
		System.out.println();
		
		air1.selectByIndex(2);
		air1.selectByIndex(1);
		
		WebElement airselected=air1.getFirstSelectedOption();
		String airselvalue=airselected.getText();
		System.out.println("Currently selected air dropdown:"+airselvalue);
		System.out.println();
		
		List<WebElement> airops=air1.getOptions();
		int a1=airops.size();
		
		for(int i=0;i<a1;i++) {
			String airvalue=airops.get(i).getText();
			System.out.println(airvalue);
			
		}
		
		WebElement conbtn=driver.findElement(By.name("findFlights"));
		
		conbtn.click();
//		WebElement homebtn=driver.findElement(By.xpath(airselvalue));
//		homebtn.click();
	}

}
