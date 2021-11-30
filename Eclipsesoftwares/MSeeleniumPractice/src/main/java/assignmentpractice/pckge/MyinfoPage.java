package assignmentpractice.pckge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyinfoPage {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe"); 
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement elt1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu_dashboard_index")));
//		WebElement elt=driver.findElement(By.id("menu_dashboard_index"));
		elt1.click();
		boolean enabledSidenav=elt1.isSelected();
		System.out.println(enabledSidenav);
		
		
//		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
//		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
}
}
