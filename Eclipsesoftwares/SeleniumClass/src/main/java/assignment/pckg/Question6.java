package assignment.pckg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;

public class Question6 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		
		//Radio Button Demo
		
		driver.findElement(By.linkText("Radio Buttons Demo")).click();
		System.out.println("Verifying the Male button is selected or not :"+driver.findElement(By.id("inlineRadio1")).isSelected());
		System.out.println("Verifying the Female button is selected or not :"+driver.findElement(By.id("inlineRadio2")).isSelected());
		
		System.out.println();
		
		driver.findElement(By.id("inlineRadio1")).click();
		System.out.println("Selected Male");
		driver.findElement(By.id("inlineRadio2")).click();
		System.out.println("Selected Female");
		
		System.out.println();
		driver.findElement(By.id("button-one")).click();
		System.out.println(driver.findElement(By.id("message-one")).getText());
				
	//Group Radio Buttons Demo	
		
		List<WebElement> gender=driver.findElements(By.name("student-gender"));
		List<WebElement> age=driver.findElements(By.name("student-age"));
		System.out.println("Verifying radio buttons are seleted or not ");
	
			
		boolean male=gender.get(0).isSelected();
		boolean female=gender.get(1).isSelected();
		
		boolean patientage0=age.get(0).isSelected();
		boolean patientage1=age.get(1).isSelected();
		boolean patientage2=age.get(2).isSelected();
		
		
		System.out.println("Is male selected?  "+male);
		System.out.println("Is Female selected?  "+female);
		System.out.println("Is age group 1 to 18 selected?  "+patientage0);
		System.out.println("Is age group 19 to 44 selected?  "+patientage1);
		System.out.println("Is age group 45 to 60 selected?  "+patientage2);
		System.out.println();
		
		//after click and selection
		gender.get(1).click();	boolean female1=gender.get(1).isSelected();
		System.out.println("Is Female selected?  "+female1);
		
		age.get(2).click();
		boolean sel1=age.get(2).isSelected();
		System.out.println("Is age group 45 to 60 selected?  "+sel1);
		System.out.println();
		
		
		driver.findElement(By.id("button-two")).click();
		System.out.println(driver.findElement(By.id("message-two")).getText());
		
		driver.close();
	}

}
