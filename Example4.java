package Array;

public class Example4 {
	public static void main(String[] args) {
		//create array of size 5 of int data type and just check 34 is present or not and find out the index of 34
		int a[]=new int[5];
		a[0]=11;
		a[1]=12;
		a[2]=11;
		a[3]=34;
		a[4]=16;
		int notocheck=34;
		for(int i=0;i<a.length;i++) {
		if(notocheck==a[i]) {
			//if(a[i]==34){
			System.out.println("the given no "+notocheck+" is present in the array");
			System.out.println("the given no "+notocheck+" is present in the array and the index position is "+i);
			
		}
		}
	}

}
