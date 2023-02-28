package Practice;

public class RemoveDuplicatesInArray {
	public static void main(String[] args) {
		int a[]= {1,1,2,2,3,3,4,4,5,6,7,7,6,5,10,11,12};
		int b[]= new int[a.length];
		int k=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				b[k++]=a[i];
			}
		}
		b[k]=a[a.length-1];
		for(int i=0;i<k;i++) {
			System.out.println(b[i]);
		}
	}

}
