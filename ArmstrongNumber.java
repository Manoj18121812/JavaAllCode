package AllDailyPractice;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int arm=0;
		int a=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		int d=n;
		while(n>0) {
			a = n%10;
			arm = arm +a*a*a;
			n=n/10;
		}
		if(d==arm) {
			System.out.println("Number is Armstrong");
		}else {
			System.out.println("Number is not Armstrong");
		}
		
		
		

	}

}
