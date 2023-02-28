package Practice;

public class stringIncrementalPattern {
	public static void main(String[] args) {
		 String s = "***";
		 int k=0;
		 for(int i=0;i<(s.length()+s.length()-1);i++) {
			 if(i<s.length()) {
				 for(int j=0;j<=i;j++) {
					 System.out.print(s.charAt(j));
				 }
				 System.out.println();
			 }
			 else {
				 for(int j=0;j<s.length();j++) {
					 if(k>=j) {
						 System.out.print(' ');
					 }
					 else {
						 System.out.print(s.charAt(j));
					 }
				 }
				 k++;
				 System.out.println();
			 }
		 }
	        
	}

}
