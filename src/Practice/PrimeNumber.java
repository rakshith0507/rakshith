package Practice;

public class PrimeNumber {
	public static void main(String[] args) {
		int start =1;
		int end = 25;
		int sum=0;
		
		for(int i=start;i<=end;i++) {
			int count =0;
			int n=i;
			
			for(int j=1;j<=n;j++) {
				if(n%j==0) {
					count++;
				}
			}
			if (count==2) {
				
				sum++;
			}
			
			
		}
		System.out.println(sum);
	}

}
