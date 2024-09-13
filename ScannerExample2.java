package basics;

import java.util.Scanner;

public class ScannerExample2 {
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value for byte");
	    b=sc.nextByte();
	    a=b;
	    System.out.println(a);
	}

}
