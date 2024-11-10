import java.util.Scanner;

public class Add2num {
	
	
	public static void main(String[] args) {
//		int a=1;
//		int b=2;
//		int sum=0;
//		
//		sum=a+b;
//		
//		System.out.println(sum);
		
		int sum;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1: ");
		int num1=sc.nextInt();
		System.out.println("Enter num2: ");
		int num2=sc.nextInt();
		
		sum=num1+num2;
		System.out.println(sum);
		
		
		
	}
}
