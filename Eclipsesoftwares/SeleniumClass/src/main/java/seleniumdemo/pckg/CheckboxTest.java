package seleniumdemo.pckg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxTest {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		
		//checkbox form
		
		driver.findElement(By.linkText("Checkbox Demo")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Check Box One')]")).click();
		
		System.out.println("checked Check Box One");
		
		
		
		driver.findElement(By.xpath("//*[contains(text(),'Check Box Two')]")).click();
		System.out.println("checked Check Box two");
		
		driver.findElement(By.xpath("//*[contains(text(),'Check Box Three')]")).click();
		System.out.println("checked Check Box three");
		
		driver.findElement(By.xpath("//*[contains(text(),'Check Box Four')]")).click();
		System.out.println("checked Check Box four");
		
		System.out.println();
		
		//simple demo form
		
		//single input field
		driver.findElement(By.linkText("Simple Form Demo")).click();
		
		driver.findElement(By.id("single-input-field")).sendKeys("hello");
		
		driver.findElement(By.id("button-one")).click();
		System.out.println("clicked Show Message button");
		
		System.out.println(driver.findElement(By.id("message-one")).getText());
		
		//Two input fields
		
		driver.findElement(By.id("value-a")).sendKeys("8");
		driver.findElement(By.id("value-b")).sendKeys("9");
		driver.findElement(By.id("button-two")).click();
		System.out.println(driver.findElement(By.id("message-two")).getText());
		

	}

}
