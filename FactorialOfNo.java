package AllDailyPractice;

import java.util.Scanner;

public class FactorialOfNo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no");
		int n = sc.nextInt();
		int fact = 1 ;
		if(n<0) {
			System.out.println("the no is negative");
		}
		else {
			for(int i=1;i<=n;i++) {
				fact = fact*i;
			}
		}
		System.out.println("factorial of n is "+fact);

	}

}
