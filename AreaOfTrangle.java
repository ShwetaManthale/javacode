package basics;

import java.util.Scanner;

public class AreaOfTrangle {
	public static void main(String[] args) {
		//Double h,trangle;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of h");
		Double h=sc.nextDouble();
		Double trangle = 0.4*h*h;
		
		System.out.println("area of trangle is  " +trangle);
	
	}

}
