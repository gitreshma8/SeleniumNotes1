package employeefile.pckg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadEmployeeFile {

	public static void main(String[] args) throws IOException {
	
		
		FileReader f1=new FileReader("C:\\Users\\Reshma.Ambili\\eclipse-workspace\\My_Maven\\src\\main\\resources\\pfile1.properties");
		
		Properties p1=new Properties();
		
		p1.load(f1);
		
//		p1.list(System.out);
		
		
		System.out.println(p1.getProperty("employeename"));
		
//		int v1=Integer.parseInt(p1.getProperty("v1","10000"));
//		
//		System.out.print("salary is  :"+v1+" | ");
		System.out.print(p1.getProperty("salary")+"|");
		System.out.print(p1.getProperty("designation"));
	}

}
