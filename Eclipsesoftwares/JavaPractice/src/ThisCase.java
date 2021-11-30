
/*this keyword refers to the current class instance variable*/
/*if we haven't used this keyword,it will show default value*/


public class ThisCase {
	
	int i;
	
	void setValue(int i) {
		
		this.i=i;
	}
	
	void show() {
		
		System.out.println(i);
		
		
	}
	
	
	public static void main(String[]args) {
		
		ThisCase tk=new ThisCase();
		tk.setValue(100);
		tk.show();
	}
	
}
/*this keyword refers to the current class instance variable*/