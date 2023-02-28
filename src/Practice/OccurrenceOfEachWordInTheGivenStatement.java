package Practice;

public class OccurrenceOfEachWordInTheGivenStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "hi hello welcome hello hi bangalore";
		String s1=" ";
		String[] s2 = s.split(" ");
		for (int i = 0; i <s2.length; i++) {
			int count=1; 
			
			for(int j=i+1;j<s2.length;j++) {
				
				if(s2[i].equals(s2[j])) {
					count++;
				}
			}
			
				if(count>1) {
					
					System.out.println(s2[i]+":"+count);
					
					}
				
			}
		
		

	}

}
