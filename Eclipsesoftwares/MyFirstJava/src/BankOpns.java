import java.util.Scanner;
public class BankOpns {

	static int  Balance=500,option;

	static Scanner sc=new Scanner(System.in);

public static void transaction(){

int choice,Dep;

System.out.println("Please select an option");
System.out.println("1:Withdraw");
System.out.println("2:Deposit");
System.out.println("3:Account Balance");

choice=sc.nextInt();

switch(choice){



case 1:

	int WD;

System.out.println("Enter the amount to withdraw");

WD=sc.nextInt();

if(WD>Balance||WD==0){

System.out.println("Insufficient Balance");

}
else{

Balance=Balance-WD;

System.out.println("You have withdrawn" +" "+ WD +" "+"the balance is" +" "+Balance);

}
anotherTransaction();
break;

case 2:


System.out.println("Enter the Deposit amount");

Dep=sc.nextInt();
if(Dep<1){
System.out.println("Enter the correct Deposit amount");
}
Balance=Balance+Dep;

System.out.println("Deposited amount is :"+" "+Dep +"account balance is:"+Balance);
anotherTransaction();

break;



case 3:
	
	System.out.println("Your balance amount is:"+" " +Balance);
	
anotherTransaction();


break;
default:
	System.out.println("if invalid option");
	
	anotherTransaction();
	break;


}


}

public static void anotherTransaction() {
	
	
	
	System.out.println("Do you want to make another transaction+ 1 for transaction and 2 to exit");
	
	option=sc.nextInt();

if(option==1) {
	
	transaction();
	
}

else  if(option==2) {
	
	System.out.println("Thanks for choosing us. Good Bye!");
	
	
}
	
else {
	
	System.out.println("Invalid choice\n\n");
    anotherTransaction();
	
	
}
}


public static void main(String[] args){


BankOpns.transaction();


BankOpns.anotherTransaction();



}

	
}
