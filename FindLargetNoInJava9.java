package AllDailyPractice;

import java.util.Scanner;

public class FindLargetNoInJava9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first no");
		int x =sc.nextInt();
		System.out.println("Enter the second no");
		int y = sc.nextInt();
		System.out.println("Enter the Third no");
		int z = sc.nextInt();
		
		
		if ( x > y && x > z )
			 System.out.println("First number is largest.");
			 else if ( y > x && y > z )
			 System.out.println("Second number is largest.");
			 else if ( z > x && z > y )
			 System.out.println("Third number is largest.");
			 else 
			 System.out.println("Entered numbers are not distinct.");
	}

}
