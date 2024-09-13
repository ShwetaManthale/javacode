package basics;

public class LocalVariable {
	
	
	static void add() {
		int a,b; //local variables
		a=12;
		b=20;
		b=10;
		System.out.println(a+b);
	}
	static void sub() {
		double a, b; //local variables
		a=1.1;
		b=1.0;
		
		System.out.println(a-b);
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		add();
		sub();
		
		
		
	}

}
