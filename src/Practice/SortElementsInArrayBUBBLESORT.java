package Practice;

public class SortElementsInArrayBUBBLESORT {
	public static void main(String[] args) {
		int[] a = {10,30,60,50,100,150,20,15};
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
			
		}
		//System.out.println(a);
		for(int k=0;k<a.length;k++) {
			System.out.println(a[k]);
		}
	}

}
