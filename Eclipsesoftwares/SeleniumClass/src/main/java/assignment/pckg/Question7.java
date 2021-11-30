package assignment.pckg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Question7 {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		
		//checkbox form-Single Checkbox Demo
		System.out.println("Verifying Single checkbox demo is checked or not");
		System.out.println(driver.findElement(By.id("gridCheck")).isSelected());
		System.out.println();
		
		System.out.println("Verifying Single checkbox demo after selection");
		driver.findElement(By.id("gridCheck")).click();
		System.out.println(driver.findElement(By.id("message-one")).getText());
		System.out.println();
		
		
		//checkbox form-Multiple  Checkbox Demo
		driver.findElement(By.linkText("Checkbox Demo")).click();
		System.out.println("Verifying the boxes before selecton");
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Check Box One')]")).isSelected());		
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Check Box Two')]")).isSelected());
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Check Box Three')]")).isSelected());
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Check Box Four')]")).isSelected());
		System.out.println();
		
		driver.findElement(By.id("button-two")).click();
		System.out.println("Verifying the boxes after selecton");
		
		
		System.out.println("Is Check Box One selected? "+driver.findElement(By.id("check-box-one")).isSelected());		
		System.out.println("Is Check Box Two selected? "+driver.findElement(By.id("check-box-two")).isSelected());
		System.out.println("Is Check Box Three selected? "+driver.findElement(By.id("check-box-three")).isSelected());
		System.out.println("Is Check Box Four selected? "+driver.findElement(By.id("check-box-four")).isSelected());
		
		driver.close();
				
	}

}
