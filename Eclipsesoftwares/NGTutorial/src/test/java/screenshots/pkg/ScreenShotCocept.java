package screenshots.pkg;

import static org.testng.Assert.fail;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ScreenShotCocept {


public static void main(String[] args) throws IOException, InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe"); 		
		WebDriver driver=new ChromeDriver(); 		
		driver.manage().window().maximize(); 		
		driver.get("http://demo.guru99.com/test/upload");
		
		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));//type should be file
		
		//using sendkeys to pass the filepath
		
				driver.findElement(By.id("terms")).click();
		uploadElement.sendKeys("C:\\Eclipsesoftwares\\NGTutorial\\ExcelData\\Mercurylogin.xlsx");
		driver.findElement(By.name("send")).click();
		
//		Thread.sleep(5000);
		 WebDriverWait wait = new WebDriverWait(driver,60); 
		 WebElement msg1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='res']//child::center"))); 

		 String msg= msg1.getText();
		Assert.assertTrue(msg.contains("has been successfully uploaded."));
		System.out.println("messgae is:"+msg);
		
		//Screenshot Concept
		//TakesScreenshot Interface
		
		TakesScreenshot shot=(TakesScreenshot)driver;//type casting of driver object to TakeScreenshot
		File sourcefile=shot.getScreenshotAs(OutputType.FILE);//Call getScreenshotAs method to create image file
		File destfile=new File("C:\\Eclipsesoftwares\\NGTutorial\\Screenshots\\"+"pass"+".png");//Copy file to Desired Location;adding path and screenshot name in path
		FileUtils.copyFile(sourcefile, destfile);//FileUtils class
			driver.quit();
	}

}











