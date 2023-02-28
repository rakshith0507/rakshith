package Practice;

public class CountTheMultipleOf {
	public static void main(String[] args) {
		int start = 1;
		int end =30;
		int count =0;
		//To count multiple of 3
		
		for(int i=start;i<=end;i++) {
			if(i%3==0) {
				count++;
			}
		}
		System.out.println("Count of multiple of 3 is "+ count);
	}

}
