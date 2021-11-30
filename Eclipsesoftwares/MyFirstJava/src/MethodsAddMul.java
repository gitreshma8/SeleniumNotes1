
public class MethodsAddMul {

	 static int a=12,b=10;

	
	static int Addition() {
		
			
		int sum=a+b;
			
		System.out.println("Addition is"+" " +sum);

		return sum;
	
		
	}
	
	
static int Multiplicaton() {
		
		
		int product=a*b;
		int result=product+b;
		System.out.println("Multiplication is"+ " " +result);
		System.out.println("Multiplication Result is"+ " " +product);
	
		return product;
	}

	
	
	public static void main(String[] args) {
	
MethodsAddMul.Addition();

MethodsAddMul.Multiplicaton();

int mode=Multiplicaton();

if(mode%2==0) {
	
	System.out.println("yes divisible");
}

else {
	System.out.println("not divisible");

		
	}


}}