package Practice;

public class AddTheDigitsInArray {
	public static void main(String[] args) {
		int [] a= {1,4,11,7,9};
		int sum = 0;
		
		for(int i=0;i<a.length;i++) {
			sum = sum+a[i];
			
		}
		System.out.println(sum);
		
	}

}
