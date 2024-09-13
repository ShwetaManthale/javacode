package Array;

import java.util.Arrays;

public class Example7 {

	public static void main(String[] args) {
		//find out the given two strings are anagram to each other
		String s1="arm";
		String s2="ram";
		char c1 []=s1.toCharArray();
		char c2[]=s2.toCharArray();
		//System.out.println(Arrays.toString(c1));
		//System.out.println(Arrays.toString(c2));
		
		Arrays.sort(c1);//a,m,r
		Arrays.sort(c2);//a,m,r
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
				
		boolean b1 =Arrays.equals(c1, c2);
		System.out.println(b1);
		if(b1==true) {
			System.out.println("they are anagram to each other");
			
		}
		else {
			System.out.println("they are not anagram");
		}

	}

}
