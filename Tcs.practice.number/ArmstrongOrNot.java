package tcs.practice.numbers;

import java.util.Scanner;

public class ArmstrongOrNot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number..");
		int manoj = sc.nextInt();
		checknumber(manoj);

	}

	private static void checknumber(int manoj) {
	
		int original =manoj;
		double digits=String.valueOf(manoj).length();
		double result=0;
		
		while(manoj>0) {
			int digit = manoj%10;
			result = result+ Math.pow(digit, digits);
			manoj = manoj/10;
			
		}
		
		if(result==original) {
			System.out.println("no is armstrong");
		}else {
			System.out.println("no is not armstrong");
		}
}
}

/*
int digits = String.valueOf(num).length();
uses built-in methods:

String.valueOf(num) — converts the number to a string (built-in)
.length() — gets the string length (also built-in)*/
