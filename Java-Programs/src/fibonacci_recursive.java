import java.util.Scanner;

public class fibonacci_recursive {
	
	public static int fibonacci_recursive (int n) {
		
		if(n == 0 || n == 1) {
			return n;
		}
		return fibonacci_recursive(n-1)+fibonacci_recursive (n-2);
	}

	public static void main(String[] args) {

		System.out.println("Give a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();;
		
		for(int i=0;i<=n; i++) {
			System.out.print(fibonacci_recursive (i)+ " ");
		}
	}

}
