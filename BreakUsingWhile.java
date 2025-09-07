package AllDailyPractice;

import java.util.Scanner;

class BreakUsingWhile {
	
 public static void main(String[] args) {
	 
	 Scanner sc = new Scanner(System.in);
	 int n=0;
	 
	 while(true) {
		 System.out.println("Enter an integer");
	  n = sc.nextInt(); 
	  
	  if(n==0) {
		  break;
	  }
		  System.out.println("You enter integer"+n);
	  }
	 
	 }
	 
 }
 
 
