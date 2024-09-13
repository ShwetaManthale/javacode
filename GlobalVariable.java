package basics;

public class GlobalVariable {
	static int a=20;//global variable
	double b;//global variable //here if we do not initialize the global variable then also it has the default value as 0.0
	
	void add() {
		a=50; //updating the global variable value by declaring in local area means inside the method
		System.out.println("addition of two number is  " +(a+b));
	}
	
	
	public static void main(String[] args) {
		
		a=40;//updating the global variable value by declaring in local area means inside the method
		System.out.println(a);
		GlobalVariable g= new GlobalVariable();
		
		System.out.println(g.b=30.0);// updating the global variable value when its non static variable
		g.add();
		
		
	}

}
