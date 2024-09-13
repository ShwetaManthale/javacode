package basics;

import java.util.Scanner;

public class CircumferenceOfSquare {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of A");
		Double A= sc.nextDouble();
		Double circumference= 4*A;
		System.out.println(circumference);
		sc.close();
	}

}
