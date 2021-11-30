
public class Employee {
	
	int empid;
	String Name;
	static String Company="SP";
	
	
	Employee(int empid,String Name){
		
		this.empid=empid;
//		this.Company=Company;//used static for this variable
		this.Name=Name;
		
	}
	//to print these 3 values
	void print() {
		
		System.out.println(+empid+" " +Name+" "+Company);
	}
	
	
	

	public static void main(String[] args) {
		
		Employee e1=new Employee(101, "Roy");
		
		e1.print();
		
		Employee e2=new Employee(11, "ram");
		e2.print();

	}

}

//gettng 2 methods here by this
