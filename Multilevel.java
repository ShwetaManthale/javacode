package basics;
class A{
	
	static void get() {
		System.out.println("hello");
	}
	
	
}
class B extends A{
	static void put() {
		System.out.println("she is very smart");
	}
	
	
}
public class Multilevel extends B {
	static void add() {
		int a = 10,b=20;
		int c= a+b;
		System.out.println(c);
		
		
	}
	
	public static void main(String[] args) {
		get();
		put();
		add();
		
		
	}

}
