package collection;

import java.util.ArrayList;



public class CollectionConcept {

	public static void main(String[] args) {


		ArrayList al=new ArrayList();

		al.add("red");
		al.add("Orange");
		al.add("Green");
		al.add(10);
		System.out.println(al);

		ArrayList<Integer> bl=new ArrayList();

		bl.add(2);
		bl.add(5);
		bl.add(6);
		bl.add(7);
		bl.add(9);
		
		System.out.println(bl);
		
		al.remove(3);
		System.out.println(al);
		
		boolean s=al.contains("green");
		System.out.println(s);
		
		bl.addAll(al);
		System.out.println(bl);
		
		int si=bl.size();
		System.out.println(si);

	}

}
