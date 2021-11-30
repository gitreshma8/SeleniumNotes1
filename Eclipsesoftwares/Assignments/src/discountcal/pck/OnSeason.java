package discountcal.pck;

public class OnSeason {

	public float price=1000, dis;
	
	void discount(){
		
		dis=price-(price*15/100);
	
		
			System.out.println("You have 15% discount on OnSeason Purchase"+" "+dis);
			
	}
}
