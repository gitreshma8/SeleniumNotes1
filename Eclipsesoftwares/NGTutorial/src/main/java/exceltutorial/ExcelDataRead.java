package exceltutorial;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataRead {


	public static Object[][] getDataFromExcel(String filePath,String sheetName) throws IOException{
		
		Object[][] data;
		
		File src=new File("C:\\Eclipsesoftwares\\NGTutorial\\ExcelData\\Mercurylogin.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=wbook.getSheet(sheetName);
		
		//count of this sheet
		int rowcount=sheet.getLastRowNum();
		int colmncount=sheet.getRow(0).getLastCellNum();
		
		//set data
		
		data=new Object[rowcount][colmncount];
		for(int i=1;i<=rowcount;i++) {
			
			for(int j=0;j<=colmncount-1;j++) {
				
			if(!getCellValue(sheet, i, j).equals("")){
				data[i-1][j]=getCellValue(sheet, i, j);
					
				}
			}
			}
//		System.out.println(data);
//		fis.close();
		return data;
		
		
		// Get cell value from given row and column
		
		
	}

	private static Object getCellValue(XSSFSheet sheet1, int row, int col) {
		
		String value="";
		
		if(sheet1.getRow(row).getCell(col)==null) {
			
			value="";
		}
			else if(sheet1.getRow(row).getCell(col).getCellType()==Cell.CELL_TYPE_STRING) {
				value=sheet1.getRow(row).getCell(col).getStringCellValue();
				
			}
			else {
				sheet1.getRow(row).getCell(col).setCellType(Cell.CELL_TYPE_STRING);		
				value=sheet1.getRow(row).getCell(col).getStringCellValue();
				
		}	
		
		return value;
	}

}
