
public class Constructor1 {
	
	String name;
	int emp_id;
	
	Constructor1(String name,int emp_id){
		
		this.name=name;
		this.emp_id=emp_id;
		
	}
	
	
	public static void main(String[]args) {
		
		Constructor1 e1=new Constructor1("abc",10);
		Constructor1 e2=new Constructor1("eee",22);
		
		System.out.println("Employee 1: "+e1.name+" "+e1.emp_id);
		System.out.println("Employee 2 :"+e2.name+" "+e2.emp_id);
		
	}
}

