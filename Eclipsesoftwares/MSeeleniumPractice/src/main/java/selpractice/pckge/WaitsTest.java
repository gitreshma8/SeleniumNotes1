package selpractice.pckge;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitsTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();//implicit wait @ driver initialization level
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//manage for modifying configuration for webdriver;actual method name is implicitly wait not implicit
		//from this line code execution will be after 5sec..from 1-any time can be given
		
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		
		driver.findElement(By.id("btn1")).click();
		System.out.println("btn1 is clicked");
		
		driver.findElement(By.id("txt1")).sendKeys("Hello");
		
	}

}
