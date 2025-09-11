package AllDailyPractice;
import java.util.*;
public class PrimeNoYouWant {

	
	
	 public static void main(String args[]) {
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the no of prime you want ");
		 int n = sc.nextInt();
		 int status=1,num=3;
		 
		 if(n>=1) {
			 
			 System.out.println("First "+n+" prime no are-");
			 System.out.println("2");
			 
		 }
		 
		 for(int count = 2; count<=n;)
		 {
			 for(int j=2;j<=Math.sqrt(num);j++)
			 {
				if(num%j==0) 
				{
					status=0;
					break;
				}
			 }
			 if(status !=0)
			 {
				 System.out.println(num);
				 count++;
			 }
			 status = 1;
			 num++;
			 } 
		}

		 }
	 

