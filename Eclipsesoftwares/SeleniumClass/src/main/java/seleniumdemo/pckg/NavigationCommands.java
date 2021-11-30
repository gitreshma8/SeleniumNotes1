package seleniumdemo.pckg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Program Softwares\\\\Selenium Files\\\\chromedriver_win32\\\\chromedriver.exe");
		
		RemoteWebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/");
		driver.navigate().to("https://www.selenium.dev/downloads/");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.close();
//		driver.quit();
		
		

	}

}
