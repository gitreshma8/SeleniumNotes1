package collection;

import java.util.ArrayList;

public class CollectionDemo {
	
	public static void main(String[]args) {
		
		ArrayList<String> al=new ArrayList<String>();//generic ArrayList
		
		al.add("roy");//using add method in collection
		
		al.add("jack");
		
			al.add("Race");
		
		al.add("joy");
		
//		al.add(10);//not possible only String value
		
		System.out.println(al);
		
		ArrayList bl=new ArrayList();//non generic--no need of type 
		//add method
		bl.add(10);
		
		bl.add("San");
		
		bl.add(2.5f);
		
		System.out.println(bl);
		
		al.remove(2);//just index value,remove method
		
		System.out.println(al);//printing to check remove case
		
		int s=al.size();//size method...size=s and print size
		
		System.out.println(s);
		
		//add all method--al collection to another
		
		ArrayList<String> nl=new ArrayList<String>();
		
		System.out.println(nl);//blank array
		
		nl.addAll(al);
		
		System.out.println(nl);//added all al--->nl arraylist
		
		//remove all method
		
		nl.removeAll(nl);
		System.out.println(nl);//removed all nl array and o/p=blank array
		
		//get 1 element from collection--get method
		
		System.out.println(al.get(2));//it will print that obj based on index using get()
		
		//checking an element ;contains()-->return type=boolean...if false add that elemnt
		
		
		boolean b=al.contains("Race");
		
		System.out.println(b);//it returns false..so adding that element
		
		al.add("Race");
		System.out.println(al);
	}

	
	//list with integer type---Assignment
	
}
