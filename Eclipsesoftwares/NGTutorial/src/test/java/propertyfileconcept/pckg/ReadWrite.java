package propertyfileconcept.pckg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWrite {

	public static void main(String[] args) throws IOException {
	
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Eclipsesoftwares\\NGTutorial\\src\\test\\resources\\properties\\testdata.properties");

		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		
		System.out.println(prop.getProperty("url"));
		
		
		FileOutputStream fos=new FileOutputStream("C:\\Eclipsesoftwares\\NGTutorial\\src\\test\\resources\\properties\\testdata.properties");
	
		prop.setProperty("2nd launch", "mercury2");
		
		prop.store(fos, "from user");
	
	}

}
