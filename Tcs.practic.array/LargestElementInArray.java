package tcs.practice.array;

import java.util.Scanner;

public class LargestElementInArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array..");
		int size=sc.nextInt();
		
		int manoj[]=new int[size];
		System.out.println("Enter the element in array..");
		for(int i=0;i<size;i++) {
			manoj[i]=sc.nextInt();
		}
		
		largestelementarray(manoj);

	}

	private static void largestelementarray(int[] manoj) {
		
		int largest = manoj[0]; // assume first element is largest

        for (int i = 1; i < manoj.length; i++) {
            if (manoj[i] > largest) {
                largest = manoj[i];
            }
        }

        System.out.println("Largest element in array is: " + largest);
    }
}
