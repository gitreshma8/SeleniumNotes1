package assignment.pckg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question6Radio {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		
		//Group Radio Buttons Demo
		
		WebElement male=driver.findElement(By.id("inlineRadio11"));
		WebElement female=driver.findElement(By.id("inlineRadio21"));
		
//		WebElement age1=driver.findElement(By.id("inlineRadio22"));
//		WebElement age2=driver.findElement(By.id("inlineRadio23"));
//		WebElement age3=driver.findElement(By.id("inlineRadio24"));
	
		Select male1=new Select(male);		
		male1.deselectByValue("Male");
		
		Select Female1=new Select(female);		
		Female1.deselectAll();
		
		boolean m1=male.isSelected();
		System.out.println(m1);
		boolean f1=female.isSelected();
		System.out.println(f1);
	}

}
