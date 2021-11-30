package excelread.pckg;

import java.io.IOException;

public class ExcelMain {
	

	public static void main(String[] args) throws IOException {
	
		String s=ExcelCode.integerReadData(2, 0);//for integer datas from excel
		
		String s2=ExcelCode.stringReadData(0, 0);//for string datas from excel
		
		System.out.println(s);
		System.out.println(s2);
		
	}

}
