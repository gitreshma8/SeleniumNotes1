package exception.pckge;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ThrowsKeyWord {

	
	void fileRead() throws FileNotFoundException {
	FileInputStream fis=new FileInputStream("c:/throws/abc.txt");
	//statements
	
	}
	
	void saveFile() throws FileNotFoundException {
		
	FileOutputStream fos=new FileOutputStream("c:/throws/xyz.txt")	;
	//statements
	}
}

