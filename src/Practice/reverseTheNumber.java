package Practice;

import java.util.Scanner;

public class reverseTheNumber {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		int a= 123145;
		int rev=0;
		while(a>0) {
			int rem = a%10;
			rev= (rev*10)+rem;
			a=a/10;
			
			
		}
		System.out.println(rev);
	}

}
