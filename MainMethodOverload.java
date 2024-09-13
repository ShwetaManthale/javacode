package basics;

public class MainMethodOverload {
	
	void main(int a,int b) {
		System.out.println(1);
		
	}
	void main(int a, double d) {
		System.out.println(2);
	}
	
	
	public static void main(String[] args) {
		MainMethodOverload m= new MainMethodOverload();
		m.main(0, 0);
		m.main(0, 1.3d);
		
		
	}

}
