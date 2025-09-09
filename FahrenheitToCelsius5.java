package AllDailyPractice;

import java.util.Scanner;

public class FahrenheitToCelsius5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Temprature in Fahrenheit");
		float temperature = sc.nextFloat();
		
		float temp = ((temperature - 32)*5)/9;
		System.out.println("Your Temp is :"+ temp);

	}

}
