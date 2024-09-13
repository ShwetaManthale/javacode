package Array;

import java.util.Arrays;

public class Example6 {

	public static void main(String[] args) {
		//how to sort the array
		String name="shweta";
		char c1[]=name.toCharArray();
		System.out.println(Arrays.toString(c1));
		Arrays.sort(c1);
		System.out.println(Arrays.toString(c1));
	}

}
