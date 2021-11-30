package assignment.pckg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question5 {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://selenium.obsqurazone.com/form-submit.php");
		
		
		//Form with validations
		
		//checking validations
//		driver.findElement(By.xpath("//*[contains(text(),'Submit form')]")).click();
//		
//		driver.findElement(By.id("validationCustom01"));
//		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Please enter First name.')]")).getText());
		
				
		driver.findElement(By.id("validationCustom01")).sendKeys("Roy");
		
		driver.findElement(By.id("validationCustom02")).sendKeys("Sam");
		driver.findElement(By.id("validationCustomUsername")).sendKeys("roysam123@obsqura.com");
		driver.findElement(By.id("validationCustom03")).sendKeys("Trivandrum");
		driver.findElement(By.id("validationCustom04")).sendKeys("Kerala");
		driver.findElement(By.id("validationCustom05")).sendKeys("695121");
		driver.findElement(By.id("invalidCheck")).click();
		
		WebElement submitbtn=driver.findElement(By.xpath("//*[contains(text(),'Submit form')]"));
		submitbtn.click();
	
	
		
		System.out.println("First Name :"+driver.findElement(By.xpath("//*[contains(text(),'Looks good!')]")).getText());
		System.out.println("Last Name :"+driver.findElement(By.xpath("//*[contains(text(),'Looks good!')]")).getText());
		System.out.println("Username :"+driver.findElement(By.xpath("//*[contains(text(),'Looks good!')]")).getText());
		System.out.println("City :"+driver.findElement(By.xpath("//*[contains(text(),'Looks good!')]")).getText());
		System.out.println("State :"+driver.findElement(By.xpath("//*[contains(text(),'Looks good!')]")).getText());
		System.out.println("Zip :"+driver.findElement(By.xpath("//*[contains(text(),'Looks good!')]")).getText());
		System.out.println();
		System.out.println(driver.findElement(By.id("message-one")).getText());
	}

}
