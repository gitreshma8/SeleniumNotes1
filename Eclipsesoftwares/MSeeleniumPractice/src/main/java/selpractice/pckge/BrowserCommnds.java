package selpractice.pckge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommnds {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/");
		
		String pagetitle=driver.getTitle();
		
		System.out.println("Page Title is :"+pagetitle);
		
		String url=driver.getCurrentUrl();
		System.out.println("Page Url is :"+url);
		
//		String pagesource=driver.getPageSource();
//		System.out.println("PageSource is :"+pagesource);
		
		
		driver.close();
//		driver.quit();

	}

}
