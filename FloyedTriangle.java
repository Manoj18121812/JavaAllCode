package AllDailyPractice;
import java.util.Scanner;
class FloyedTriangle
{
 public static void main(String args[])
 {
 
	 int num=1;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter no of rows of floyes triangle ");
	 int n = sc.nextInt();
	 
	 System.out.println("Floyed Triangle are ");
	 
	 for(int i=1;i<=n;i++) {
		 for(int j=1;j<=i;j++) {
			 System.out.print(num+" ");
			 num++;
		 }
	 
	 System.out.println();
	 }
 }
}