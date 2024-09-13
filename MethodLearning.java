package basics;
//how to call static method inside the main method
public class MethodLearning {
	
	private static void first_method() {
		 System.out.println("second method");
		 
	 }
	  private static void second_method() {
		 System.out.println("third method");
		 
	 }
	 
	 static void add() {
		 int a=2;
		 int b=5;
		 int c= a+b;
		 System.out.println(c);
		 
	 }
	 static void fourth_method() {
		 System.out.println("hello");
	 }
	public static void main(String[] args) {
		System.out.println("first method");
		first_method();
		second_method();
		fourth_method();
		add();
		
		
	}

}
