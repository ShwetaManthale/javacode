package basics;

public class TryCatchExample {
	public static void main(String[] args) {
		try {
		int a=1/1;
		System.out.println(a);
		}
		catch(ArithmeticException a1) {
			System.out.println("exception occure");
		}
	}

}
