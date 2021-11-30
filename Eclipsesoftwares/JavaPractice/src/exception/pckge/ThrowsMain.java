package exception.pckge;

import java.io.FileNotFoundException;

public class ThrowsMain {

	public static void main(String[] args)  {
		
		ThrowsKeyWord tw=new ThrowsKeyWord();
		try {
		tw.fileRead();
	
		
		}catch(FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		try {
			tw.saveFile();
			
		}catch(FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("hello");

	}

}
