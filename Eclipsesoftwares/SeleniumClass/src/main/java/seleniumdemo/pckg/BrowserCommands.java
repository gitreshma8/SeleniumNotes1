package seleniumdemo.pckg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://www.selenium.dev/");
			
			String pagetitle=driver.getTitle();
			
			System.out.println("Page Title is :"+pagetitle);
			
			String currentUrl=driver.getCurrentUrl();
			System.out.println("Current url is :"+currentUrl);
			
//			String pagesource=driver.getPageSource();
//			System.out.println("Pagesource is :"+pagesource);
			
			driver.close();
//			driver.quit();
			
			
			
	}

}
