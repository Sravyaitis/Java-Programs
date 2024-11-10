
public class Factorial {
	
//	public static long factorial(int num) {
//		
//		long fact = 1; //0! =1 so initializing result
//		
//		for(int i=1; i<=num; i++) {
//			fact *= i;
//		}
//		return fact;
//	}

	
	public static long factorial(int num) {
		
		if(num==0 || num==1) {
			return 1;
		}
		return num * factorial(num-1); // Recursive case: n! = n * (n-1)!
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
