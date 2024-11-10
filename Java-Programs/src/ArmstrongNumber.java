
public class ArmstrongNumber {
	
//	public static boolean isArmstrong(int num) {
//		int originalNumber = num;
//		int sum = 0;
//		int numberOfDigits = String.valueOf(num).length();
//		
//		while(num != 0) {
//			int digit = num % 10; // Extracts the last digit,
//			//153%10=3 (because 153 divided by 10 gives 15 with a remainder of 3)
//			sum += Math.pow(digit, numberOfDigits);
//			num /= 10;
//			//num % 10 gives the last digit. num = num / 10 removes the last digit by dividing the number by 10. The process repeats until all digits are extracted.
//		}
//		
//		return sum == originalNumber;
//	}
//

	
	public static boolean isArmstrong(int num) {
		int originalNumber = num;
		int sum=0;
		int numberOfDigits = String.valueOf(num).length();
		
		while(num!=0) {
			int digit = num%10;
			sum+=Math.pow(digit, numberOfDigits);
			num /=10;
		}
		
		return sum==originalNumber;
	}
	
public static void main(String[] args) {
	
	int n=15;
	//int n=153;

	if(isArmstrong(n)) {
		System.out.println("is armstrong number");
	} else {
		System.out.println("is not armstrong number");
	}
		
	
}

}
