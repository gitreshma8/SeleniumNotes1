package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMethod {

	public static void main(String[] args) {
		
		
		ArrayList cl=new ArrayList();//heterogeneous array==Non generic arraylist
		
		cl.add(10);
		cl.add(20);
		cl.add(35);
		
		System.out.println(cl);
		
		
		Iterator it=cl.iterator();//to fetch the values...Result will be in colmn 
		while(it.hasNext()) {//boolean type
			
			System.out.println(it.next());//next =object
		}
		
		Iterator i1=cl.iterator();
		it.remove();
		System.out.println(cl);
	}

}
