package Practice;

public class FindOnlyDuplicateCharactersInString {
public static void main(String[] args) {
	String s="My Name is Mohan and Im from Mangalore";
	String s1=" ";
	
	for(char i='a';i<='z';i++) {
		int count = 0;
		for(int j=0;j<s.length();j++) {
			char var=s.charAt(j);
			if(i==var) {
				count++;
			}
			
			
		}
		if(count>=1) {
			System.out.println("The duplicate characters are"); /// to find the duplicate characters

			System.out.println(i+":"+count);			
		}
		
	}
}
}
