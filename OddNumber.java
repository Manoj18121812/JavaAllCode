package AllDailyPractice;

import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int no = sc.nextInt();
		
		
		if(no%2 == 0) {
			System.out.println("The no is even");
		}else
			System.out.println("the no is odd");

	}

}
