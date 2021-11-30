package student.pckg;



public class StudDetails{
int id;
String Name;
StudAddress Address;



public void details(int id,String Name,StudAddress Address) {
	
	System.out.println("detail is"+" "+id+" "+Name+" ");
	System.out.println(Address.State+Address.City);
}


public static void main(String[] args) {
	
	StudDetails obj=new StudDetails();
	
	
	StudAddress Address=new StudAddress("tvm","kerala","India");
	
	obj.details(11, "Roy", Address);
}

}

 class StudAddress {

	String City,State,Country;
	
	public StudAddress(String city,String state,String country) {
		
		this.State=state;
		this.City=city;
		this.Country=country;
	}
	
}

