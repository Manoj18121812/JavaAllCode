package AllDailyPractice;

import java.util.Scanner;

public class SwapTwoNoUsingThirdVariable6 {

	public static void main(String[] args) {
		int x;
		int y;
		int temp;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x and y");
		x=sc.nextInt();
		y=sc.nextInt();
		
		
		System.out.println("Before swapping x="+x+"  y=" +y);
		temp =x;
		x=y;
		y=temp;
		System.out.println("After swapping  x="+x+"  y="+y);
		

	}

}
