package basics;

public class ChildClass {
	
	
     ChildClass(int a) {
    	 this();
    	 System.out.println(1);
		
	}
	ChildClass(){
		
		System.out.println(2);
	}
	
	public static void main(String[] args) {
		
		new ChildClass(0);
		
		
	}

}
