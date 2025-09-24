package tcs.practice.numbers;

public class APractice {

	public static void armstrongnum(int num) {
		
		
		for(int i=1;i<num;i++) {
			if(num%i==0 && isPrime(i)) {
				System.out.println(i);
			}
		}
		
		
	}
	
	private static boolean isPrime(int num) {
		
		if(num<=1)return false;
		
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}
		
		return true;
	}
	
	
	
	



	public static void main(String[] args) {
		
		int num=60;
		armstrongnum(num);
	}

}
