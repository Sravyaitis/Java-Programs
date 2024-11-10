import java.util.Scanner;

public class Palindrome {
	
	public static boolean isPalindrome(String str) {
		
		str = str.toLowerCase();
		int left = 0;
		int right =str.length()-1;
		
		while(left<right) {
			if(str.charAt(left)!=str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public static void main(String[] args) {
		//String s = "mom";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an input: ");
		String input =sc.nextLine();
		if(isPalindrome(input)) {
			System.out.println("is a palindrome");
		} else {
			System.out.println("is not a palindrome");
		}
		
	}
}
