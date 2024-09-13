package Array;

import java.util.Arrays;

public class Example2 {
	public static void main(String[] args) {
		//check if two arrays are equals to each other
		
		int id[]= new int[4];
		id[0]=1;
		id[1]=2;
		id[2]=3;
		id[3]=4;
		
		int id_1[]= new int[4];
		id_1[0]=1;
		id_1[1]=2;
		id_1[2]=3;
		id_1[3]=4;
		
		boolean b1=Arrays.equals(id, id_1);
		System.out.println(b1);
	}

}
