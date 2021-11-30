

class Pattern1{
	
	public static void main(String[] args){
		
		for(int i=1;i<=5;i++){
			
			for(int s=6;s>=i;s--)
				
				{
					System.out.print(" ");
					
				}
				
				for(int j=1;j<=(i*2-1);j++)
				
				{
					System.out.print(i);
					
				}
				
				
				
				System.out.println();
			
		}
		
		
	}
	
	
}
//center space--left to center space count
/*------1
  -----222
   ----33333
   ---4444444
   --555555555*/

/*


i	j=(i*2-1)	s=6
	
1	2-1=1		6
2	4-1=3		5
3	6-1=5		4
4	8-1=7		3
5	10-1=9		2
*/