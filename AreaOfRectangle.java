package basics;

import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of l");
		int l=sc.nextInt();
		System.out.println("enter the value of h");
		int h=sc.nextInt();
		double rectangle=l*h;
		System.out.println(rectangle);
		
		
	}

}
