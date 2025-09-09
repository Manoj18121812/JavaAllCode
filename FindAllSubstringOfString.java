package AllDailyPractice;

import java.util.Scanner;

public class FindAllSubstringOfString {

	public static void main(String[] args) {
	
	  
	      Scanner in = new Scanner(System.in); 
	      System.out.println("Enter a string to print it's all substrings"); 
	      String string  = in.nextLine(); 
	  
	      int  length = string.length();
	      
	      
	      System.out.println("Substrings of \""+string+"\" are :-"); 
	      
	      for( int i = 0 ; i < length ; i++ ) 
	      { 
	      for( int j = 1 ; j <= length - i ; j++ ) 
	      { 
	      String sub = string.substring(i, i+j); 
	      System.out.println(sub); 
	      } 
	      } 

	}

}
