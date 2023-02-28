package Practice;

public class FindTheLargest {
public static void main(String[] args) {
	int a[] = {28,45,36,87,66,55,99};
	int largest=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]>largest) {
			largest=a[i];
		}
	}
	System.out.println(largest);
}
}
