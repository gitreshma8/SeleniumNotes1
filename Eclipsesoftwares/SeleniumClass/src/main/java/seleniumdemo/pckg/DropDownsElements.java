package seleniumdemo.pckg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownsElements {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);//implicit

		WebElement Flights1=driver.findElement(By.linkText("Flights"));//need full link name
		
		Flights1.click();
		
		WebElement arrivedrop=driver.findElement(By.name("toPort"));
		
		Select toPort=new Select(arrivedrop);//here starts from dropdown name selection
		
//		toPort.selectByIndex(3);
//		toPort.selectByValue("New York");
		toPort.selectByVisibleText("New York");
		
		
		WebElement currentoption=toPort.getFirstSelectedOption();
		
		String currentoptiontextvalue=currentoption.getText();//to get current selected option text
		System.out.println("Current option text value is :"+currentoptiontextvalue);
		System.out.println("to get all list of dropdown options");//to get all dropdown options
		
		List<WebElement> lo=toPort.getOptions();
		
		int size=lo.size();
		for(int i=0;i<size;i++) {
			
			String value=lo.get(i).getText();
				System.out.println(value);
		}
		
		//next dropdown slection
		WebElement returningdrop=driver.findElement(By.name("toMonth"));
		Select toMonth=new Select(returningdrop);
		toMonth.selectByIndex(1);
		
		WebElement returnoptions=toMonth.getFirstSelectedOption();
		List<WebElement>ls=toMonth.getOptions();
		
		System.out.println("Listing all returndrop down values");
		int returnsize=ls.size();
		for(int i=0;i<returnsize;i++) {
			
			String returnvalue=ls.get(i).getText();
			System.out.println(returnvalue);
		}
		
		
		
	}

}
