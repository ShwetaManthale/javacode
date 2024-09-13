package Array;

import java.util.Arrays;

public class Assignmentno27 {

	public static void main(String[] args) {
		int array1[]=new int[5];
		array1[0]=2;
		array1[1]=4;
		array1[2]=6;
		array1[3]=8;
		array1[4]=10;
		
		int array2[]=new int [5];
		
		for(int i=0,k=4;i<array1.length;i++,k--) {
			array2[k]=array1[i];
		}
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		

	}

}
