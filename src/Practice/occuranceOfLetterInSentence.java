package Practice;

public class occuranceOfLetterInSentence {
	public static void main(String[] args) {
		// String s= "hi hello Bye";

		// int count =0;
//		for(int i=0;i<=s.length()-1;i++) {
//
//			
//			if(s.charAt(i)=='h') {
//				count++;
//			}
//		}
//		System.out.println(count);
		String s = "indiain";
		for (char ch = 'a'; ch <= 'z'; ch++) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) != ch) {
					count++;
				}

			}
			// System.out.println(ch + " : " + count);
			if (count > 1) {
				System.out.println(ch + " = " + count);
			}
		}
		String s1 = "indiain";
		String s3 = s1.substring(0, 2);
		String c = "";
		System.out.println(s3);
		int cou = 0;
		for (int i = 0; i <= s3.length(); i++) {
			for (int j = 0; j <= s1.length()-1; j++) {
				if (s3.charAt(i) != s1.charAt(j)) {
					c = c + s1.charAt(j);
					cou++;
				}
			}

		}
		System.out.println(c + " " + cou);
	}

}
