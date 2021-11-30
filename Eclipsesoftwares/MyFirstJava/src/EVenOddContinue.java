
public class EVenOddContinue {

	public static void main(String[] args) {
		
		System.out.println("To display only even numbers");
		System.out.println();
	
for(int i=0;i<=10;i++) {
	
	
	if(i%2==1)
		continue;
	
	System.out.println(i);
	
}

System.out.println();

System.out.println("To display only odd numbers");


for (int i=0;i<10;i++) {	
		
	
	if(i%2==0)
		continue;
	System.out.println(i);
}

	}

}
