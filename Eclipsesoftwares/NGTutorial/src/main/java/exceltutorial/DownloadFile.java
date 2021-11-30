package exceltutorial;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile {
	
	

	public static void main(String[] args) throws IOException, InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe"); 		
		 WebDriver driver=new ChromeDriver(); 		
		driver.manage().window().maximize(); 	
		driver.get("https://demoqa.com/upload-download");
		
//		Thread.sleep(1000);
		 WebElement downloadelt=driver.findElement(By.id("downloadButton"));
		  String src=downloadelt.getAttribute("href");
		  
		  
		  String wget_command = "cmd /c C:\\AObsqura\\Wget\\wget.exe -P C:\\AObsqura\\DownloadFiles --no-check-certificate " + src;

//	      Runtime.getRuntime().exec(wget_command);
		  
		  try {
		        Process exec = Runtime.getRuntime().exec(wget_command);
		        int exitVal = exec.waitFor();
		        System.out.println("Exit value: " + exitVal);
		        } catch (InterruptedException | IOException ex) {
		        System.out.println(ex.toString());
		        }

			}


	

}
