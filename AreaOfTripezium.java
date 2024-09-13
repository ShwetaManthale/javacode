package basics;

import java.util.Scanner;

public class AreaOfTripezium {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of l1");
		Double l1=sc.nextDouble();
		System.out.println("enter the value of l2");
		Double l2=sc.nextDouble();
		
		
		System.out.println("enter the value of h");
		Double h=sc.nextDouble();
		
		Double tripezium = 0.5*(l1+l2)*h;
		
		System.out.println("area of Tripezium is  " +tripezium);
	
	}

}
