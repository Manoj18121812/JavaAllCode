package AllDailyPractice;
import java.util.Scanner;
public class MultiplicationTable {

	
	
	 public static void main(String args[]){
		int n; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No");
		n=sc.nextInt();
		
		for(int i =1;i<=n;i++) {
			System.out.println(n+"*"+i+"="+(n*i));
		}
		
		
	 }
 }

