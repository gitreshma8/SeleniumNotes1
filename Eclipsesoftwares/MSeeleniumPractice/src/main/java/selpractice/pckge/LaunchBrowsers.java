package selpractice.pckge;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowsers {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Program Softwares\\Selenium Files\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/watch?v=RgFREgOgSlE");
		
		
	}

}
