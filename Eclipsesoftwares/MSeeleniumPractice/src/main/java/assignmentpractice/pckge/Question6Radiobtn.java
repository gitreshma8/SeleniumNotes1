package assignmentpractice.pckge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question6Radiobtn {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.linkText("Radio Buttons Demo"));
		
		WebElement male=driver.findElement(By.id("inlineRadio11"));
		
		
		WebElement female=driver.findElement(By.id("inlineRadio21"));
		Select f1=new Select(female);
		f1.deselectByIndex(1);
		
	}

}
