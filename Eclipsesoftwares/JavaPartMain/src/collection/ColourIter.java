package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ColourIter {

	public static void main(String[] args) {
	
		
		ArrayList al=new ArrayList();
		
		al.add("Red");
		al.add("Orange");
		al.add("green");
		al.add("Pink");
System.out.println("color selection :"+al);

Iterator clr=al.iterator();
			
				while(clr.hasNext()) {
	
					System.out.println(clr.next());

}
	}

}
