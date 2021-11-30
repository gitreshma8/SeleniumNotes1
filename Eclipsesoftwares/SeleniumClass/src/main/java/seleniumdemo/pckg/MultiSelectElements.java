package seleniumdemo.pckg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultiSelectElements {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		
//		Explicit wait
		
//		WebDriverWait wait = new WebDriverWait(driver,60); WebElement usernamefld=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Select Input"))); 
		
		
		//fluent imlpicit
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//				  .withTimeout(Duration.ofSeconds(30))
//				  .pollingEvery(Duration.ofSeconds(5))
//				  .ignoring(NoSuchElementException.class);
		
		
		WebElement selectinput=driver.findElement(By.linkText("Select Input"));//need full link name		
		selectinput.click();
				
		WebElement singleinput=driver.findElement(By.id("single-input-field"));		
		Select singledrop=new Select(singleinput);
					
//		singledrop.selectByValue("-- Select --");
		
		singledrop.selectByIndex(1);
		singledrop.selectByIndex(2);
		singledrop.selectByIndex(3);
		
//		singledrop.deselectByIndex(0);//its a single field not multiple selected drop down ,so not possible			
		
		
		
		WebElement selectedcolor=driver.findElement(By.id("message-one"));
		
		String colorname=selectedcolor.getText();
		System.out.println(colorname);
		System.out.println();
		
		
		List<WebElement> lop=singledrop.getOptions();
		int lops1=lop.size();
		
			for(int i=0;i<lops1;i++) {
				
				String val=lop.get(i).getText();
				System.out.println("Select Input Demo colors :"+val);
			}
		
			System.out.println();
			System.out.println("Handling Two Input Fields");

		
		WebElement multifield=driver.findElement(By.id("multi-select-field"));		
		Select multiselect=new Select(multifield);
		
		List<WebElement> multi=multiselect.getOptions();
		int lops2=multi.size();
		
		for(int i=0;i<lops2;i++) {
			
			String val2=multi.get(i).getText();
			
			System.out.println("Two Input Fields colors :"+val2);
		}
		
		//select all values 0,1 and 2 then Deselecting any of the below using deselect method(single or multiple we can deselect)
		multiselect.selectByIndex(0);
		multiselect.selectByIndex(1);
		multiselect.selectByIndex(2);
		
//		multiselect.deselectByIndex(0);
//		multiselect.deselectByIndex(1);//deselected this option by index,only for Multi select dropdown case
//		multiselect.deselectByIndex(2);
		
		
		
		boolean m1=multiselect.isMultiple();//returns boolean;true if multiple options are selected in that boxor false
		
		System.out.println(m1);
		

		
		
	}

}
