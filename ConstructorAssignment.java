package basics;

public class ConstructorAssignment {
	//static method with parameters
	
	static void addition(int a, float b) {
		float sum = a+b;
		System.out.println(sum);
		
	}
	static void get(char c,String s) {
		System.out.println("char is:" +c+"   string s:" +s);
	}
	static void get(char c,double s) {
		System.out.println("char is:" +c+"   double d:" +s);
	}
	
	
	//non Static method calling
	void mul(float f, int i) {
		float fl= f*i;
		System.out.println(fl);
	}
	void div(int a, int b) {
		int d =a/b;
		System.out.println(d);
	}
	void main(int a) {
		System.out.println(a);
	}
	

	//Constructor calling with parameters
	ConstructorAssignment(int i, char c){
		System.out.println(i+"   "+c);
		
	}
	ConstructorAssignment(int s,int n){
		int i= s+n;
		System.out.println(i);
	}
	ConstructorAssignment(double d, float f){
		System.out.println("Double value is:" +d+"  float value is:"+f );
	}
	ConstructorAssignment(){
		System.out.println("Shweta is very smart");
		
	}
	
public static void main(String[] args) {
	System.out.println("static method calling");
	addition(123, 12.456f);
	get('a',"Shweta");
	
	get('f',1233445);
	
	System.out.println("non static method calling");
	ConstructorAssignment c1=new ConstructorAssignment();
	c1.mul(12.3f,123);
	c1.div(300,10);
	c1.main(122);
	
	System.out.println("constructor calling");
	new ConstructorAssignment(12367,'a');
	new ConstructorAssignment(123,3456);
	new ConstructorAssignment(1111111111,12.3f);
	new ConstructorAssignment();
	
}
}
