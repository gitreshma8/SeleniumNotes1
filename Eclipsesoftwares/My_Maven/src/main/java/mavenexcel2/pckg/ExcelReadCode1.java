package mavenexcel2.pckg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadCode1 {
	
	public static FileInputStream F1;
	public static XSSFWorkbook W1;
	public static XSSFSheet S1;
	
	
	public static String stringReadData1(int i,int j) throws IOException {
		
		F1=new FileInputStream("C:\\Users\\Reshma.Ambili\\eclipse-workspace\\My_Maven\\src\\main\\resources\\ExcelRead2.xlsx");
		
		W1=new XSSFWorkbook(F1);
		
		S1=W1.getSheet("Sheet1");
		
		Row r1=S1.getRow(i);
		
		Cell c1=r1.getCell(j);
		
		return c1.getStringCellValue();
		
		
	}
	
public static String integerReadData1(int i,int j) throws IOException {
		
		F1=new FileInputStream("C:\\Users\\Reshma.Ambili\\eclipse-workspace\\My_Maven\\src\\main\\resources\\ExcelRead2.xlsx");
		
		W1=new XSSFWorkbook(F1);
		
		S1=W1.getSheet("Sheet1");
		
		Row r1=S1.getRow(i);
		
		Cell c1=r1.getCell(j);
		
		int var1=(int)c1.getNumericCellValue();
		
		return String.valueOf(var1);
		
	

}

}
