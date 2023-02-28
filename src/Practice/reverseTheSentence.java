package Practice;

public class reverseTheSentence {
	public static String reverse(String s) {
		String kali = " ";
		for(int i=0;i<s.length();i++) {
			kali=s.charAt(i)+kali;
		}
		return kali;
		
	}
	public static void main(String[] args) {
		String a="My name is Rakshith";
		String b = " ";
		String[] c = a.split(" ");
		for(int i=c.length-1;i>=0;i--) {
			String d = c[i];
			if(d.equals("Rakshith")) {
				b= b+reverse(d)+" ";
				
				
			}
			else {
				b=b+d+" ";
				
			
			}
			
			
		
		}
		System.out.println(b);
		
	}

}
