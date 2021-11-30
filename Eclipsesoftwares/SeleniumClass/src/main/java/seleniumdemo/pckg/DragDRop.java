package seleniumdemo.pckg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDRop {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
//		
		WebElement iframe=driver.findElement(By.className("demo-frame"));
//		driver.switchTo().frame(0);//calling by index
		driver.switchTo().frame(iframe);//calling by obj
		
		WebElement drag=driver.findElement(By.id("draggable"));		
		WebElement drop=driver.findElement(By.id("droppable"));		
				
		Actions act=new Actions(driver);//using actions class 
		act.dragAndDrop(drag, drop).perform();//with actions class obj, performing action of drag and drop by dragDrop method.
		System.out.println("Dragged and droped");
		
		driver.switchTo().defaultContent();//revert back to normal position???????

	}

}
