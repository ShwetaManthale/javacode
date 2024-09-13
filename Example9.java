package Array;

public class Example9 {

	public static void main(String[] args) {
		
		//in the given string how many are alphabets ,numerics ,special character and spaces
		int count_of_letter=0;
		String s1="shweta soma";
			char c1[]=	s1.toCharArray();
			
			for(int i=0;i<s1.length();i++) {
				
			
			boolean b1=Character.isLetter(c1[i]);
			if(b1==true) {
				count_of_letter++;
			}
			
			}
			System.out.println("the no of letter in the given string is "+count_of_letter);
			
	}

}
