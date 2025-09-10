package AllDailyPractice;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Word to check ...");
	String string = sc.nextLine();
	int length =string.length();
	
	String reverse ="";
	for(int i=length-1;i>=0;i--) {
		reverse = reverse + string.charAt(i);
	}
	
	if(string.equals(reverse)) {
		System.out.println("Word is palindrome...");
	}else {
		System.out.println("Word are not palindrome...");
	}
	}

}
