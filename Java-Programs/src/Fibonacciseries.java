import java.util.Scanner;

public class Fibonacciseries {
	
	// Recursive method to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        // Base cases: return n if it is 0 or 1
        if (n == 0 || n == 1) {
            return n;
        }
        // Recursive case: sum of the previous two Fibonacci numbers
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; // Fibonacci sequence up to the 10th number
        System.out.println("Fibonacci series up to " + n + ":");
        
        // Loop through and print each Fibonacci number
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
		
//		int n1=0, n2=1, sum=0;
//		
//		System.out.print(n1+ " "+n2);
//		
//		for (int i=0; i<10;i++) {
//			
//			sum = n1+n2; //1
//			
//			System.out.print(" "+sum); //1
//			n1=n2; //1
//			n2=sum; //1
//		}
//		
		
//		System.out.println("Please provide input: ");
//		
//		Scanner sc = new Scanner(System.in);
//		int input=sc.nextInt();
//		
//		int n1 = 0, n2 =1, sum=0;
//		
//		for(int i=0; i<input;i++) {
//			
//			System.out.print(n1+ " ");
//			
//			sum = n1 + n2;
//			n1=n2;
//			n2=sum;
//		}

