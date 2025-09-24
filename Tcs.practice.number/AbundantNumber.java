package tcs.practice.numbers;

public class AbundantNumber {

	public static void main(String[] args) {
		
		int num =12;
		
		checknumberabundant(num);
	}

	private static void checknumberabundant(int num) {
		
		int abun=0;
		
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				abun = abun + i;
				
			}
			
		}
		
		if(abun>num) {
			System.out.println("abundanat number...");
		}else {
			System.out.println("not abundant number");
		}
		
	}

}
