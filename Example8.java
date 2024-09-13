package Array;

import java.util.Arrays;

public class Example8 {
	public static void main(String[] args) {
		//copy the one array value into another array using iteration
		int a[]=new int[4];
		a[0]=0;
		a[1]=30;
		a[2]=80;
		a[3]=40;
		int b[]=new int[4];
	for(int i =0;i<4;i++) {
			
		b[i]=a[i];
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}

}
