import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
//		int[] a = new int[5];
//		a[0]=100;
//		a[1]=200;
//		a[2]=300;
//		a[3]=400;
//		a[4]=500;
//		System.out.println(a.length);
//		
//		for(int i=0; i<a.length;i++) {
//			System.out.println(a[i]);
//		}
//		
//		//enhanced For-each loop
//		String[] s = {"java","Sql","selenium"};
//		for(String singleValue : s) {
//			System.out.println(singleValue);
//		}
		
		
//		
//		//using scanner class
//		Scanner sc = new Scanner(System.in);
//		int size;
//		System.out.println("Enter the size of an array: ");
//		size = sc.nextInt();
//		int[] a = new int[size];
//		
//		for(int i=0;i<a.length;i++) {
//			a[i]=sc.nextInt();
//		}
//		
//		for(int j=0;j<a.length;j++) {
//			System.out.println(a[j]);
//		}
		
		
//		//WAP to take an array from the user and print first and last element 
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter size of array: ");
//		int size = sc.nextInt();
//		
//		int[] a = new int[size];
//		
//		for(int i=0;i<a.length;i++) {
//			a[i]=sc.nextInt();
//		}
//		System.out.println(a[0]);
//		System.out.println(a[a.length-1]);
		
		
		
//		//WAP to take an array from user and find
//		// a.sum of an array 
//		// b.average of an array. 
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the size of an array: ");
//		int size = sc.nextInt();
//		
//		int[] a = new int[size];
//		
//		for(int i=0;i<a.length;i++) {
//			a[i]=sc.nextInt();
//		}
//		
//		int sum=0;
//		for(int j=0;j<a.length;j++) {
//			sum+=a[j];
//		}
//		System.out.println(sum);
//		
//		float avg=(float) sum/a.length;
//		System.out.println(avg);
		
		
//		//WAP by taking input from user, print sum of even position numbers of an array 
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the size of an array: ");
//		int size=sc.nextInt();
//		
//		int[] a = new int[size];
//		for(int i=0;i<a.length;i++) {
//			a[i]=sc.nextInt();
//		}
//		
//		int sum=0;
//		for(int j=0; j<a.length;j++) {
//			int digit = a[j]%10;
//			if(digit%2==0) {
//				sum+=digit;
//			} 
//		}
//		System.out.println(sum);
//		
		
//		//WAP to reverse an array
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the size of an array: ");
//		int size = sc.nextInt();
//		int[] a = new int[size];
//		
//		System.out.println("Enter the values of an array: ");
//		for(int i=0;i<a.length;i++) {
//			a[i]=sc.nextInt();
//		}
//		
//		for(int j=a.length-1;j>=0;j--) {
////			System.out.print(a[j]+" ");
//			System.out.println("a["+j+"]="+a[j]);
//		}
		
		
//		//WAP to copy an array into another array
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the size of an array: ");
//		int size = sc.nextInt();
//		int[] a = new int[size];
//		
//		System.out.println("Enter the values of an array: ");
//		for(int i=0;i<a.length;i++) {
//			a[i]=sc.nextInt();
//		}
//		
//		int[] b=new int[a.length];
//		//copying
//		for(int j=0;j<a.length;j++) {
//			b[j]=a[j];
//		}
//		//printing
//		for(int k=0;k<a.length;k++) {
//			System.out.println(b[k]);
//		}
		
//		//WAP to take input from user and find greatest(maximum) element from an array.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the size of array: ");
//		int size=sc.nextInt();
//		
//		int[] a = new int[size];
//		for(int i=0;i<a.length;i++) {
//			a[i] = sc.nextInt();
//		}
//		
//		int maxNum=a[0];
//		for(int j =0;j<a.length;j++) {
//			if(a[j]>maxNum) {
//				maxNum=a[j];
//			}
//		}
//		System.out.println(maxNum);
		
//		
//		//WAP to take input from user and find smallest(minimum) element fro an array.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the size of array: ");
//		int size=sc.nextInt();
//		
//		int[] a = new int[size];
//		for(int i=0;i<a.length;i++) {
//			a[i] = sc.nextInt();
//		}
//		
//		int minNum=a[0];
//		for(int j=0;j<a.length;j++) {
//			if(a[j]<minNum) {
//				minNum=a[j];
//			}
//		}
//		System.out.println(minNum);
		
		
//		//WAP to sort(arrange) the elements of array in increasing order
//		//input: 22 5 6 88 9
//		//output: 5 6 9 22 88 
//		
//		int[] arr= {22, 5, 6, 88, 9};
		
//		//for comparing and swapping- simple bubble sort algorithm
//		int c;
//		for(int a=0;a<arr.length;a++) {
//			for(int b=a+1;b<arr.length;b++) {
//				if(arr[b]<arr[a]) {
//					c=arr[a];
//					arr[a]=arr[b];
//					arr[b]=c;
//				}
//			}
//		}
//		//for printing sorted array
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+ " ");
//		}
		
		
//		//WAP to sort(arrange) the elements of array in decreasing order.
//		 //input: 22 5 6 88 9
//		 //output: 88 22 9 6 5 
//		
//		int[] arr = {22,5,6,88,9};
//		int c;
//		for(int a=0;a<arr.length;a++) {
//			for(int b=a+1;b<arr.length;b++) {
//				if(arr[b]>arr[a]) {
//					c=arr[a];
//					arr[a]=arr[b];
//					arr[b]=c;
//				}
//			}
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+ " ");
//		}
		
		
		//WAP to find second highest element from an aray without sorting.
		//input: 22 5 6 88 9
		//output: 22 
//		int[] arr = {22,5,6,88,9};
//		int maxNum=a[0];
//		int secMaxNum=a[1];
//
		
	
		
		
		
		
		
		
		
	}
}
