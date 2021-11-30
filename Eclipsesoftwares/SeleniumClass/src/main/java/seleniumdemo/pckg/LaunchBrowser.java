package seleniumdemo.pckg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		//for different browser, change browser name add that driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Files\\chromedriver_win32\\chromedriver.exe");

		
		//System.setProperty("webdriver.ie.driver","path");//for ie
        //System.setProperty("webdriver.gecko.driver","path");//for firefox
//		ChromeDriver driver=new ChromeDriver()here we can load only chrome browser since we can create reference for class
		
		WebDriver driver=new ChromeDriver();//launching browser;creating instance for webdriver
		
//		WebDriver driver=new InternetExplorerDriver();
//		WebDriver driver=new FireFoxDriver();
		
		
		driver.manage().window().maximize();//maximize the browser
		driver.get("https://sites.google.com/a/chromium.org/chromedriver/downloads");// paste the url to load
	}

}
