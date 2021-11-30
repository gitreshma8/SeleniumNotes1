package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorConcept {

	public static void main(String[] args) {

		ArrayList al=new ArrayList();
		
		al.add(2);
		al.add("roy");
		al.add(5);
		
		
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}





	}

}
