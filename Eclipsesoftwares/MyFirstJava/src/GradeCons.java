///* Write a program to find the grade of 2 students based on total marks(3 subjects) 
//  Get the student's marks by constructor 
// Return total mark to in main method 
// Find the grade of each student.*/
//
// 
//
//public class GradeCons {
//	
//	int TotalMark1,TotalMark2;
//	
//	//get total marks for both students using parameterized constructor
//	GradeCons(int phy,int chem,float bio){
//		
//		float std1mark=phy+chem+bio;
//		
//		TotalMark1=(int)std1mark;
//		
//		float std2mark=phy+chem+bio;
//			
//		TotalMark2=(int)std2mark;
//	
//	}	
//	//returning marks
//	float student1() {		
//		
//		return TotalMark1;
//		
//	}		
//	
//	
//	float student2() {
//		
//		return TotalMark2;
//	}
//	//to show grade for each student
//	GradeCons(){
//		
//		if(TotalMark1<145 ||TotalMark2>145) {
//			
//			System.out.println("Student 1 grade is Grade B");
//			System.out.println("Student 2 grade is Grade A");
//		}else {
//			
//			System.out.println("Fail");
//		}
//		
//	}
//
//
//	public static void main(String[] args) {
//		
//		GradeCons std1=new GradeCons(40,30,40.9f);
//		GradeCons std2=new GradeCons(50,50,49.9f);		
//				
//		
//		System.out.println("Total mark of Student 1 is :"+" "+std1.student1());
//		System.out.println("Total mark of Student 2 is :"+" "+std2.student2());
//		GradeCons std3=new GradeCons();	
//		
//	}
//	
//	
//}