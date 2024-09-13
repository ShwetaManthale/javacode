package Array;

import java.util.Arrays;

public class Assignment_No25 {
	public static void main(String[] args) {
		char name[]=new char[4];
		name[0]='s';
		name[1]='o';
		name[2]='m';
		name[3]='a';
		
		char name_1[]=new char[4];
		name_1[0]='s';
		name_1[1]='o';
		name_1[2]='m';
		name_1[3]='a';
		
		boolean b1=Arrays.equals(name, name_1);
		System.out.println(b1);
		String s1[]=new String[4];
		s1[0]="shweta";
		s1[1]="manthale";
		s1[2]="soma";
		s1[3]="garampalli";
		
		String s2[]=new String[4];
		s2[0]="shweta";
		s2[1]="manthale";
		s2[2]="soma";
		s2[3]="garampalli";
		
		boolean b2=Arrays.equals(s1,s2);
		System.out.println(b2);
		
	}

}
