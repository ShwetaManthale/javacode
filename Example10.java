package Array;

public class Example10 {

	public static void main(String[] args) {
		//find the no of digit present in given string
		int count_of_numeric=0;
		String s1="shweta soma 123456789";
			char c1[]=	s1.toCharArray();
			
			for(int i=0;i<s1.length();i++) {
				
			
			boolean b1=Character.isDigit(c1[i]);
			//System.out.println(b1);
			if(b1==true) {
				count_of_numeric++;
			}
			
			}
			System.out.println("the no of digit in the given string is "+count_of_numeric);
			
			//..............................................................
			
			int count_of_spaces=0;
			String s2="shweta soma 123456789 mmm";
				char c2[]=	s2.toCharArray();
				
				for(int i=0;i<s2.length();i++) {
					
				
				boolean b2=Character.isWhitespace(c2[i]);
				//System.out.println(b1);
				if(b2==true) {
					count_of_spaces++;
				}
				
				}
				System.out.println("the no of spaces in the given string is "+count_of_spaces);
				
			
	}

}
