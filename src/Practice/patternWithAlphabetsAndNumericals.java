package Practice;

public class patternWithAlphabetsAndNumericals {
	public static void main(String[] args) {
		int a=1;
		char b='A';
		for (int i = 1; i <= 6; i++) {
			for (int j =i ; j <= 5; j++) {
				if (j == 1 || j == 5 || j == i) {
					System.out.print(b++ + " ");
				} else {
					System.out.print(a++ + " ");
				}
			}
			System.out.println();
		}
	}

}
