package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionTest {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add("Race");
		al.add(12.34);
		
		System.out.println(al);
		
		ArrayList bl=new ArrayList();
		
		bl.add(10);
		bl.add(20);
		bl.add("Race");
		bl.add(12.34);
		
		boolean b=al.contains(12.34);	
//		Assert.assert true(b);
		System.out.println(b);
		al.removeAll(al);
		
		boolean c=al.isEmpty();
		
		System.out.println(c);
		al.addAll(bl);
		System.out.println(bl);
		
		bl.remove(2);System.out.println(bl);
		
		int s=al.size();System.out.println(s);
		
		al.clear();
		System.out.println(al);
		
		
		
	}

}
