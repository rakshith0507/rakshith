package Practice;

public class ReplaceTheCharacter {
	public static void main(String[] args) {
		
		String s = "My Name is Mohan And Im From Mangalore";
		String s1=" ";
		for(int i=0;i<=s.length()-1;i++){
			char ch = s.charAt(i);
			if(ch=='M') {
				ch='W';
				s1=s1+ch;
			}
			else {
				s1=s1+s.charAt(i);
			}
			
		}
		System.out.println(s1);
		
		
	}

}
