package discountcal.pck;

public class OffSeason extends OnSeason {

	
	@Override
void discount(){
		
		super.discount();
		
		dis=price-(price*40/100);
		
	System.out.println("You have 40% discount on OffSeason Purchase"+" "+dis);

	}



public static void main(String[] args) {
	
	OffSeason obj=new OffSeason();
	
	obj.discount();
	
	
	
	
}

}
