
public class SortArray {

	public static void main(String[] args) {
	
		int temp;
		
		int [] a= {30,20,10,15,19};
		
//		int[] c=new int[5];
		
		System.out.println("Original Array is"+" ");
		
		
		for(int i=0;i<a.length;i++) {
			
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
		System.out.println();
		
		
		System.out.println("Ascending array is");
	
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]>a[j]) {
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;							
				
				}
			
			}	
			
		
			System.out.print(a[i]+" ");
			
					
		}
		System.out.println();
		
		
		System.out.println();
		
		System.out.println("Descending array is");
		
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[j]>a[i]) {
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;							
				
				}
			
			}	
			
		
			System.out.print(a[i]+" ");
			
					
		}
		
	
	}

}
