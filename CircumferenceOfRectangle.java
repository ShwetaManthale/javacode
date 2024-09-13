package basics;

import java.util.Scanner;

public class CircumferenceOfRectangle {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the value of L");
	int L=sc.nextInt();
	System.out.println("enter the value of B");
	int B= sc.nextInt();
	double rectangle = 2*(L+B);
	System.out.println(rectangle);
	
}
}
