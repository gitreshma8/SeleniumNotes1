package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo2 {

	public static void main(String[] args) {
		
		//Generic Array		
		List<Integer> l1=new ArrayList<Integer>();//List ==Interface ;ArrayList()=class;ArrayList implements List
		l1.add(25);
		l1.add(30);
		l1.add(35);
		l1.add(50);
		System.out.println("Generic Add method  :"+l1);
		
		//non generic Array
		
		ArrayList al=new ArrayList();
		
			al.add(10);
			al.add(12);
			al.add(25);
			al.add(35);
			
			System.out.println("Non generic Add method  :"+al);
			
			al.add(30);
			al.add("Ram");
			al.add(70);
			
			System.out.println("Different types objects :"+al);
			
			al.remove(0);
			System.out.println("Remove method for 0 index :"+al);
			
			System.out.println("Before remove all from l1"+l1);
			l1.removeAll(l1);
			System.out.println("After remove all from ll"+l1);
			
			l1.addAll(al);
			System.out.println("Adding all from al to l1"+l1);
			
			System.out.println("Size of al is :"+al.size());
			System.out.println("Size of l1 is :"+l1.size());
			
			System.out.println("Get method from al:"+al.get(2));
			
			boolean b=al.contains("Ram");
			System.out.println("Contains method :"+b);
			
			boolean c=al.contains(80);
			System.out.println("Contains method :"+c);
			
			al.add(80);
			System.out.println("Adding new element to al:"+al);	
			//Iterator interface:printed row -column
			Iterator itr=al.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());//it will return colmn o/p
			}
			
			itr.remove();//it will remove the last element from the collection
			System.out.println("Iterator al:"+al);
			
			System.out.println(l1);
			Iterator it=l1.iterator();
			
			
			while(it.hasNext()) {
				
				System.out.println(it.next());
			
			}
			it.remove();
			System.out.println("Iterator l1 :"+l1);
	}
	
	

}
