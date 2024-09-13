package Array;

import java.util.Arrays;

public class Assignment_No24 {
	public static void main(String[] args) {
		Double a[]=new Double[3];
		
		a[0]=1.6;
		a[1]=3.6;
		a[2]=5.9;
		
		
		char name[]=new char[3];
		name[0]='s';
		name[1]='o';
		name[2]='m';
		//name[3]='a';
		
		boolean b[]= new boolean[3];
		b[0]=true;
		b[1]=false;
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(b));
		
		/*for(int i=0;i<=2;i++) {
		System.out.println("double values are "+a[i]+" char values are "+name[i]+" boolean values are "+b[i] );
		}*/
	}

}
