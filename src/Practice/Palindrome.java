package Practice;

public class Palindrome {
	public static void main(String[] args) {
		int a = 1234321;
		int copy = a;
		int rev=0;
		while(a>0) {
			int rem=a%10;
			rev = (rev*10)+rem;
			a=a/10;
		}
		System.out.println(rev);
		if(copy==rev) {
			System.out.println("Given number is Palindrome");
		}
		else {
			System.out.println("Given is not a palindrome");
		}
	}

}
