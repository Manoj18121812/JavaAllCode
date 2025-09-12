package AllDailyPractice;

import java.util.Scanner;

public class SwapTwoNoWithoutUsingThird7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of  x and y");
		
		int x=sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println("Before Swapping of x="+ x+" y="+y);
		
		x = x+y;
		y = x-y;
		x = x-y;
		
		System.out.println("After Swapping of x="+ x+" y="+y);
		
	}

}
/*
x=10 + 5 = 15
y=15-5 =10
x=15 -10 =5*/