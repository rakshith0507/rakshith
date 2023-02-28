package Practice;

public class reversrTheString {
	public static void main(String[] args) {
		String s="ELF2021SELENIUM";
		String s1 =" ";
		for(int i=0;i<=s.length()-1;i++) {
			s1=s.charAt(i)+s1;
		}
		System.out.println(s1);
	}

}
