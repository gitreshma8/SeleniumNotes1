package assignment.pckg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1BrwsrCommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.opesmount.in/grocerystore1/");
		
		String actualtitle=driver.getTitle();		
		System.out.println("Title of the page is :"+actualtitle);
		
		String expectedtitle="Grocerystore";
		
		System.out.println("Expected title is :"+expectedtitle);
		
			
		
		if(actualtitle.equals(expectedtitle)) {
			
			System.out.println("Correct Title");
		}else {
			
			System.out.println("Incorrect Title");
		}
		
		
		System.out.println();
		
		
		String actualurl=driver.getCurrentUrl();
		System.out.println("Current url is :"+actualurl);
		
		String expectedurl="http://www.opesmount.in/grocerystore1/";
		System.out.println("Expected url is :"+expectedurl);
		
		
		if(actualurl.equals(expectedurl)) {
			
			System.out.println("Correct url");
			
		}else {
			
			System.out.println("Incorrect url");
		}
		
		driver.close();
	}

}
