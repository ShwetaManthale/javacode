package basics;



class Parent{
	
	void add(int a){
		System.out.println("hi");
		
	}
}



public class MethodOverriding extends Parent {
	
	void add(int a) {
		System.out.println("hello");
		super.add(8);
	}
	
	
	
	public static void main(String[] args) {
		MethodOverriding m= new MethodOverriding();
		m.add(0);
		
		
	}

}
