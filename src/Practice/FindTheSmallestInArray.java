package Practice;

public class FindTheSmallestInArray {
	public static void main(String[] args) {
		
		int a[] = {28,45,36,87,66,55,99};
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			
		}
		for(int k=0;k<a.length;k++) {
			System.out.println(a[k]);
			
			
		}
		System.out.println("=============================");
		System.out.println("Smallest in the array : "+a[0]);
	}

}
