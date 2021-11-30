
public class AverageArea {

	
	
	static int average(int a,int b,int c) {
		
		int avg=(a+b+c)/3;		
		
		return avg;
	}
	
	static float average(float a,float b,float c) {
		
		float avgf=(a+b+c)/3;
		return avgf;
		
	}
	
	static float area(float r) {
		
		float A=(float)3.14*r*r;
		
		return A;
	}
	
	static void  area(int W,int L) {
		
		int A=W*L;
		
		System.out.println("Area of Rectangle is :"+" "+A);
		
	}
	
	static int area(int a) {
		
		int S=a*a;
		
		System.out.println("Area of Square is :"+" "+S);
		return 0;
	}
	
	
	public static void main(String[] args) {
		
		int Avgintresult=average(3,4,5);
		
		System.out.println("Average result of 3 integers :"+" "+Avgintresult);
		
		System.out.println();
		
		float Avgfloat=average(2.9f,1.2f,3.2f);
		System.out.println("Average result of 3 floating numbers :"+" "+Avgfloat);
		
		System.out.println();
		
		float circlearea=area(10.9f);
		System.out.println("Area of circle is:"+" "+circlearea);
		
		System.out.println();		
		area(20,30);
		
		System.out.println();
		area(15);
		
	}
}
