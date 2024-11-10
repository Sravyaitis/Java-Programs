import java.util.Scanner;

public class PrimeNumber {
	
	public static boolean isPrime(int num) {
		if (num<=1) {
		return false;
		}
		
		for(int i=2; i<=Math.sqrt(num);i++) { //This significantly reduces the number of iterations required.
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		if(isPrime(num)) {
			System.out.println(num + " is a prime number.");
		} else {
			System.out.println(num + " is not a prime number.");
		}
		
		sc.close();
	
	}

}


