
public class Day1 {
	
	public static void main (String [] args) {
		
		Calculator calc=new Calculator();
		int i=calc.getSum(2, 5);
		System.out.println("Sum is :"+i);
		
		int j=calc.getSub(10, 4);
		System.out.println("The sub is:" +j);
		
		System.out.println("The multiplication is :" +calc.getMul(20, 20));
		
		int div=calc.getdiv(10, 5);
		System.out.println("The Result is :" +div);
	}

	
}
