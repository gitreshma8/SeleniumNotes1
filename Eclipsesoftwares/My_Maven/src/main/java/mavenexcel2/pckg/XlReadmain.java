package mavenexcel2.pckg;

import java.io.IOException;



public class XlReadmain {
	
	public static void main(String[] args) throws IOException {
		
		String Result=ExcelReadCode1.stringReadData1(0, 0);
		String Result1=ExcelReadCode1.stringReadData1(0, 1);
		String Result2=ExcelReadCode1.integerReadData1(1, 1);
		
		System.out.print(Result);
		System.out.print(Result1);
		
		System.out.print(Result2);
		
	
	}

}
