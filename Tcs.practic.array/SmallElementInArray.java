package tcs.practice.array;

import java.util.Scanner;

public class SmallElementInArray {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size");
		int size=sc.nextInt();
		System.out.println("Enter the element in array..");
		int manoj[]=new int[size];
		for(int i=0;i<size;i++) {
			manoj[i]=sc.nextInt();
			
		}
		
		smallestarrayelement(manoj);

	}

	private static void smallestarrayelement(int[] manoj) {
		
	
		int smallest = manoj[0]; // assume first element is largest

        for (int i = 1; i < manoj.length; i++) {
            if (manoj[i] < smallest) {
                smallest = manoj[i];
            }
        }

        System.out.println("smallest element in array is: " + smallest);
    }
}
