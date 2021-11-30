package assignment.pckg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question8 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		
		driver.findElement(By.linkText("Select Input"));
		WebElement selectclr=driver.findElement(By.id("single-input-field"));
		
		Select colors=new Select(selectclr);
		colors.selectByIndex(1);
		
		System.out.println(driver.findElement(By.id("message-one")).getText());
	
		List<WebElement> allclrs=colors.getOptions();
		
		int options=allclrs.size();
		System.out.println("Number of elements :"+options);
		System.out.println();
		
		
		for(int i=1;i<options;i++) {
			
			String value=allclrs.get(i).getText();
			
			System.out.println("Colors are :"+value);
		}

	}

}
