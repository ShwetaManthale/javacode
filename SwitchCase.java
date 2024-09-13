package basics;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		
		int balance=100000, withdraw, deposit,choice;
		Scanner sc= new Scanner(System.in);
		
		while (true) {
		System.out.println("welcome to ATM machine ");
		System.out.println("choose ur selection");
		
		System.out.println("choose  1 for deposit");
		System.out.println("choose  2 for withdraw");
		System.out.println("choose  3 for balance check");
		System.out.println("choose  4 for exit");
		
		
		
		choice = sc.nextInt();
		
		
		switch(choice) { 
		case 1:
			System.out.println("deposit ur money");
			deposit=sc.nextInt();
			balance=balance+deposit;
			System.out.println("updated balance is " +balance );
			System.out.println();
			break;
		case 2:
			System.out.println("enter money for withdraw");
			withdraw= sc.nextInt();
			if(balance>=withdraw) {
		
			balance =balance-withdraw;
			System.out.println("updated balance is"  +balance);
			}
			else
			{
				System.out.println("insufficiant balance");
				
			}
			System.out.println();
			
			break;
			
		case 3:
			System.out.println("your balance is" +balance);
			
			break;
			
		case 4:
			System.exit(0);
		    break;
		    
			default:
				System.out.println("invalid entry");
	
	}
	}
		
	}
}



