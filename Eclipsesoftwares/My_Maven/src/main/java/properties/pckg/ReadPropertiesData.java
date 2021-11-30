package properties.pckg;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesData {

	public static void main(String[] args) throws IOException {
		//reading file by the class FileReader and creating obj. and pass path 
		
		FileReader fr=new FileReader("C:\\Users\\Reshma.Ambili\\eclipse-workspace\\My_Maven\\src\\main\\resources\\propertydemo.properties");
		
		//now fetch the file using Properties class and obj
		Properties pro=new Properties();
		
		pro.load(fr);//load method to load the file which means the property object pro
		
		//get property is a string value
		System.out.println(pro.getProperty("user"));
		System.out.print(pro.getProperty("username")+"|");
		System.out.print(pro.getProperty("password"));

	}

}
