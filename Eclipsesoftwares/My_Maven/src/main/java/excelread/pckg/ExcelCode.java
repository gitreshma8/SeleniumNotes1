package excelread.pckg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {

	
	public static FileInputStream F;//to read file
	
	public static XSSFWorkbook W;//for workbook
	
	public static XSSFSheet Sh;//sheet
	
	
		public static String stringReadData(int i,int j) throws IOException {//method passing rows and column
			
			F=new FileInputStream("C:\\Users\\Reshma.Ambili\\eclipse-workspace\\My_Maven\\src\\main\\resources\\Excel Read.xlsx");//
			
			W= new XSSFWorkbook(F);//if no data;throws exception
			
			Sh=W.getSheet("Sheet1");//sheet name from workbook(String)
			
			Row r=Sh.getRow(i);//getting rows and imported rows;Row=Interface
			
			Cell c=r.getCell(j);//getting cells and imported cell;Cell=Interface
			
			return c.getStringCellValue();//for string data
			
	
			
		}
		
		public static String integerReadData(int i,int j) throws IOException {
			
    F=new FileInputStream("C:\\Users\\Reshma.Ambili\\eclipse-workspace\\My_Maven\\src\\main\\resources\\Excel Read.xlsx");//
			
			W= new XSSFWorkbook(F);//if no data;throws exception
			
			Sh=W.getSheet("Sheet1");//sheet name from workbook(String)
			Row r=Sh.getRow(i);//getting rows and imported rows;Row=Interface
			
			Cell c=r.getCell(j);//getting cells and imported cell;Cell=Interface
			
			int var=(int) c.getNumericCellValue();//if numeric data(it will consider as double so converted)typecasting
			
			return String.valueOf(var);//using valueof method to convert string --int 
			
			
			
			
		}
}
