package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class HomogeneousArrayList {

	public static void main(String[] args) {

		// generic arraylist=Homeogeneous ArrayList
		
		ArrayList<Integer> al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
//		System.out.println(al);
		
		
		Iterator<Integer> itr=al.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
	}

}
