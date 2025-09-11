package AllDailyPractice;

import java.util.Scanner;

class ReverseNumber
{
 public static void main(String args[]) {
	 Scanner sc = new Scanner(System.in);
	 int n,reverse=0;
	 
	 System.out.println("enter the no to reverse");
	 n=sc.nextInt();
	 
	 while(n!=0) {
		 reverse = reverse * 10;
		 reverse = reverse + n%10;
		 n = n/10;
	 }
 System.out.println("The revrse no is "+reverse);
 }
}

