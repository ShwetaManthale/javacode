package basics;

import java.util.Scanner;

public class CircumferenceOfCircle {
public static void main(String[] args) {
	double pi=3.14;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the value of r");
	int r= sc.nextInt();
	double circumference =2*pi*r;
	System.out.println(circumference);
	
}
}
