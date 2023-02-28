package Practice;

import java.time.LocalDateTime;

public class demo {
public static void main(String[] args) {
	
	for(int i=1;i<=4;i++)
	{
		System.out.println();
		
		for(int j=4;j>=i;j--)
		{
			System.out.print("*");
		}
	}
	for(int i=1;i<=4;i++)
	{
		System.out.println();
		
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
	}
	//LocalDateTime sys = new LocalDateTime.now();
	

}
}
