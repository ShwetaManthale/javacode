package basics;

import java.util.Scanner;

public class AreaOfCircle {
	
	
	 
public static void main(String[] args) {
	double pi=3.14;

	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value of r");
	double r=sc.nextDouble();
	double radius =pi*r*r;
	
	
	System.out.println(radius);
	
}
}
