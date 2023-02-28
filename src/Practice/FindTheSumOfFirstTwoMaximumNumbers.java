package Practice;

public class FindTheSumOfFirstTwoMaximumNumbers {
	public static void main(String[] args) {
		int []a={28,45,36,87,66,55,99};
		for(int j=0;j<a.length-1;j++) {
			for(int i=0;i<a.length-1;i++) {
				if(a[i]<a[i+1]) {
					int temp = a[i];
					a[i]=a[i+1];
					a[i+1]= temp;
				}
			}
		}
		int sum =0;
		for(int i=0;i<=2;i++) {
			System.out.println(a[i]);
			sum =sum+a[i];
		}
		System.out.println(sum);
	}

}
