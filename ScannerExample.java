package basics;

import java.util.Scanner;

public class ScannerExample {
	static String fname, lname,email,pwd,padr,cadr;
	static char ch,m,f;
	static int pin;
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your first name");
		fname=sc.next();
		System.out.println("enter your last name");
		lname=sc.next();
		System.out.println("enter your email");
		email=sc.next();
		System.out.println("enter your password");
		pwd=sc.next();
		System.out.println("enter your present address");
		padr=sc.next();
		System.out.println("enter your current address");
		cadr=sc.next();
		System.out.println("enter your male or female");
		ch=sc.next().charAt(0);
		System.out.println("enter your pincode");
		pin=sc.nextInt();
		
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(email);
		System.out.println(pwd);
		System.out.println(padr);
		System.out.println(cadr);
		System.out.println(pin);
		
		if(ch=='m') {
			System.out.println("gender is male");
		}
		else if(ch=='f')
		{
			System.out.println("gender is female");
		}
		else
		{
			System.out.println("invalid entry");
		}
		
		
		
		
		
		
		
	}

}
