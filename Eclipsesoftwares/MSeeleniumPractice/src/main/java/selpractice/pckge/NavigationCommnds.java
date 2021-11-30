package selpractice.pckge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommnds {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/");
		driver.navigate().to("https://www.youtube.com/watch?v=wlu6pr_QPXQ&list=PLacgMXFs7kl8e8xIdMDQEi2c6eQnO1toK&index=7");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		
		driver.close();
//		driver.quit();
	}

}
