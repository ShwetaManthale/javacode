package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
	//accept the values of array at runtime it is of int data type
		
		Scanner sc=new Scanner(System.in);
		int a[]=new int[4];
		for( int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
		
		
		}
		System.out.println(Arrays.toString(a));
		/*System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);*/
	}

}
