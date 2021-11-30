package seleniumdemo.pckg;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMethods {

	public static void main(String[] args) {	
		

		System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
		
		//Simple alert
	driver.findElement(By.xpath("(//button[text()='Click me!'])[position()=1]")).click();//can give position based on position of buttons 
	    Alert simple=driver.switchTo().alert();
	    String simplealerttxt=simple.getText();
	    
	    System.out.println("Simple Alert message is :"+simplealerttxt);
	    simple.accept();
	    
	//Confirmation ALert    
		
		driver.findElement(By.xpath("(//button[text()='Click me!'])[position()=2]")).click();
		Alert confirmbtn=driver.switchTo().alert();
		
		String confirmalertmessage=confirmbtn.getText();
		System.out.println("Confirm alert message is :"+confirmalertmessage);
	
		confirmbtn.dismiss();//or accept
		
		
		String confirmcancel=driver.findElement(By.id("confirm-demo")).getText();
		System.out.println("Cancel message is :"+confirmcancel);
		
		
		//Prompt alert
		
		driver.findElement(By.xpath("//button[text()='Click for Prompt Box']")).click();
		Alert prompt=driver.switchTo().alert();
		System.out.println(prompt.getText());
		
		prompt.sendKeys("Rony");//to enter the text in prompt box
		
		prompt.accept(); //or dismiss
		
		String prompttext=driver.findElement(By.id("prompt-demo")).getText();
		System.out.println("prompt action text is :"+prompttext);
	}

}
