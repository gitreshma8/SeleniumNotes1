package selpractice.pckge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question7 {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		
		//checkbox form
		
				driver.findElement(By.linkText("Checkbox Demo")).click();
				
				WebElement Boxone=driver.findElement(By.xpath("//*[contains(text(),'Check Box One')]"));
				
				
				Select box1=new Select(Boxone);
				box1.selectByIndex(1);
//				box1.deselectAll();
				boolean c1b1=Boxone.isSelected();
				System.out.println(c1b1);
	}

}
