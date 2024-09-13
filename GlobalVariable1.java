package basics;

public class GlobalVariable1 {
	
	//int b=20;
	static int a=20;
	void fun(){
		int b=20;
		
		System.out.println(a+"  "+b);
		++a; ++b;
		
	}
	
	public static void main(String[] args) {
		GlobalVariable1 g=new GlobalVariable1();
		g.fun();
		g.fun();
		
	}

}
