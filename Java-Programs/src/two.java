import java.util.Scanner;

public class two {
	
	public static void main(String[] args) {
//		int a=10, b=5, c,d,e,f,g;
//		
//		c=a+b;
//		d=a-b;
//		e=a*d;
//		f=a/b;
//		g=a%b;
//		
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);
//		System.out.println(f);
//		System.out.println(g);

	
//		String s = "Java";
//		int a = 123;
//		System.out.println(s+a);
//		System.out.println("I am "+s +" developer");
		
//		String acctHolderName = "Sravya";
//		double currBalance = 450000.00;
//		int minBalance = 3000;
//		System.out.println(acctHolderName);
//		System.out.println(currBalance);
//		System.out.println(minBalance);
		
		
//		int a = 100;
//		System.out.println(++a + a++);
//		
//		System.out.println(++a + a++ + ++a);//101+101+100
//		
//		int b=50;
//		System.out.println(b++ + ++b + b-- + --b);//50+52+50+
		
		
//		
//		//WAP to check whether 10 and 20 are equal or not
//		int a=10,b=10;
//		
//		if(a==b) {
//			System.out.println("a==b");
//		} else {
//			System.out.println("a!=b");
//		}
		
//		//WAP to check whether 10 is positive or negative
//		int a =10;
//		if(a>=0) {
//			System.out.println("a is a positive number");
//		} else {
//			System.out.println("a is a negative number");
//		}
		
//		//WAP to check whether pooja is eligible to cast a vote or not, pooja's age 21
//		int age = 21;
//		
//		if(age>=18) {
//			System.out.println("Pooja is able to cast a vote");
//		} else {
//			System.out.println("not eligible");
//		}
		
		
//		//WAP to check whether 22 is divisible by 4 or not
//		int num=22;
//		
//		if(num%4==0) {
//			System.out.println("num is divisible by 4");
//		} else {
//			System.out.println("num is not divisible by 4");
//		}
		
		//WAP to check whether 32 is even number or not
//		int num=32;
//		
//		if(num%2==0) {
//			System.out.println("num is a even number");
//		}
		
//		//WAP to find greatest of 3 numbers a=10,b=27,c=6.
//		//using nested ternary operator
//		int a=10,b=27,c=6;
//		int greatest = c>(a>b ? a : b) ? c : ((a>b) ? a : b);
		//c>a ? c : a
		//c>b ? c : b
		//c>a ? c : a
		//c>b ? c : b
//		System.out.println(greatest);
		
		
//		//WAP to check whether couples are eligible for mariage or not.
//		
//		Scanner sc = new Scanner(System.in);
//		int maleAge = sc.nextInt();
//		
//		int femaleAge = sc.nextInt();
//		
//		boolean maleEligibility = maleAge>=21;
//		boolean femaleEligibility = femaleAge>=18;
//		
//		if(maleEligibility && femaleEligibility) {
//			System.out.println("can marry");
//		} else if (!maleEligibility && femaleEligibility) {
//			System.out.println("can't marry");
//		} else if (maleEligibility && !femaleEligibility) {
//			System.out.println("can't marry");
//		} else {
//			System.out.println("not eligible");
//		}
//		
		
//		//WAP to check whether 10 is divisible in both 2 and 4.
//		int a =10;
//		if (a%2==0 && a%4==0) {
//			System.out.println("yes");
//		} else {
//			System.out.println("No");
//		}
		
//		//WAP to check whether 8 is divisible in either 3 or 4.
//		int a=8;
//		if(a%3==0 || a%4==0) {
//			System.out.println("yes");
//		} else {
//			System.out.println("no");
//		}
//		
//		//print java 10 times
//		int i;
//		for(i=1; i<=10;i++) {
//			System.out.println(" Java");
//		}
//		//WAP to print numbers from 1 to 100
//		int i;
//		for(i=1;i<=100;i++) {
//			System.out.println(i);
//		}
//		
//		//WAP to print numbers from 65 to 35
//		for(int i=65; i>=35;i--) {
//			System.out.println(i);
//		}
		
//		//WAP to print all even numbers from 1 to 30
//		for(int i=1;i<=30;i++) {
//			if(i%2==0) {
//				System.out.println(i);
//			}
//		}
		
//		//WAP to print sum of all even numbers from 1 to 15
//		int sum=0;
//		for(int i=1;i<=15;i++) {
//			if(i%2==0) {
//				sum+=i;
//			}
//		}
//		System.out.println(sum);
		
		//WAP to print product of all even numbers from 1 to 10
//		int product =1;
//		for(int i=1;i<=10;i++) {
//			if(i%2==0) {
//				product*=i;
//			}
//		}
//		System.out.println(product);
		
		
//		//WAP to print value of 5!
//		int fact=1;
//		int num=5;
//		
//		for(int i=1;i<=num;i++) {
//			fact*=i;
//		}
//		System.out.println(fact);
		
		
//		//WAP to print multiplication table
//		int num=2;
//		int result=0;
//		for(int i=1; i<=10; i++) {
//			result=num*i;
//			System.out.println(result);
//		}
		
		//WAP to print
		 //a.Sum of first 10 natural numbers
		 //b.product of first 10 natural numbers
//		int sum =0;
//		int product =1;
//		
//		for(int i=1; i<=10;i++) {
//			sum+=i;
//			product*=i;
//		}
//		System.out.println(sum);
//		System.out.println(product);
		
		
//		
//		//Count Sum Of Digits in a Number
//		int num=123456;
//		int sum=0;
//		while(num>0) {
//			int lastDigit = num%10;
//			sum+=lastDigit;
//			num/=10;
//		}
//		System.out.println(sum);
//		
		
		
		
//		//WAP to count all numbers present between 1 to 30 which are divisible by 5
//		int count=0;
//		for(int i=1; i<=30; i++) {
//			if(i%5==0) {
//				count++;
//			}
//		}
//		System.out.println(count);
		
		
		
		//WAP to print Fibnocci series
//		Scanner sc = new Scanner(System.in);
//		int n=sc.nextInt();
//		for(int i=0; i<=n ; i++) {
//			System.out.println(fibo(i)+ " ");
//		}
		
		
//		//WAP to swap two numbers
//		//a.using third variable
//		b.without using third variable
		
//		int a=10;
//		int b=20;
//		int c;
//		
//		c=a;
//		a=b;
//		b=c;
//		System.out.println(a);
//		System.out.println(b);
		
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println(a);
//		System.out.println(b);
		
//		//WAP to check whether number 13 is prime number or not
//		int num=13;
//		boolean flag=true;
//		for(int i=2;i<num;i++) {
//			if(num%i==0) {
//				flag = false;
//				break;
//			}
//		}
//		if(flag==true) {
//			System.out.println("is prime num");
//		} else {
//			System.out.println("not a prime num");
//		}
		
		
		//WAP to find the square of 4
//		int num=4;
//		int result = (int) Math.pow(num,2);
//		System.out.println(result);
		
		
		//WAP to print 1 to 30 using while loop
//		int num=1;
//		while(num<=30) {
//			System.out.println(num);
//			num++;
//		}
		
//		//WAP to print 30 to 5 using while loop
//		int num=30;
//		while(num>=5) {
//			System.out.println(num);
//			num--;
//		}
		
		
//		//WAP to print
//		//a. A to Z
//		//b. Z to A
//		//c. alternate characters
//		char ch1='A', ch2='Z';
//		
//		while(ch1<='Z') {
//			System.out.print(ch1+ " ");
//			ch1++;
//		}
//		System.out.println(" ");
//		while(ch2>='A') {
//			System.out.print(ch2+ " ");
//			ch2--;
//		}
//		System.out.println(" ");
//		
//		char ch3 = 'A';
//		while(ch3<='Z') {
//			System.out.print(ch3);
//			ch3+=2;
//		}
		
//		//WAP to find reverse of a number
//		int num=123;
//		int rev = 0;
//		
//		while(num>0) {
//			int lastDigit=num%10; //get the last digit
//			rev = rev*10+lastDigit;	
//			num = num/10; //drop the last digit
//		}
//		System.out.println(rev);
		
//		//ispalindromeNumber
//		int num=121;
//		int reverse =0;
//		
//		while(num>0) {
//			int Lastdigit = num%10;
//			reverse = reverse*10+Lastdigit;
//			num = num/10;
//		}
//		System.out.println(reverse);
//		
//		int tempNum = reverse;
//		
//		if(tempNum ==reverse) {
//			System.out.println("is palindrome");
//		} else {
//			System.out.println("is not palindrome");
//		}
//		
//		//Armstrong Number
//		int num=153;
//		int noOfDigits=String.valueOf(num).length();
//		int sum = 0;
//		
//		while(num>0) {
//			int Lastdigit = num%10;
//			sum+=Math.pow(Lastdigit, noOfDigits);
//			num/=10;
//		}
//		int newNum=num;
//
////		
//		if(newNum==num) {
//			System.out.println("is Armstrong number");
//		} else {
//			System.out.println("Not an Armstrong number");
//		}
		
		
//		//do while loop
//		int a=10;
//		do {
//			System.out.println(a);
//			a++;
//		} while(a<=13);
//		
		
//		//WAP to check whether 2020 is leap year or not.
//		int year = 2024;
//		if(year%4==0) {
//			System.out.println("is a leap year");
//		} else {
//			System.out.println("not a leap year");
//		}
		
		
		//WAP to take any number and print corresponding day by refering below table.
//		int dayNum=9;
//		switch(dayNum) {
//		case 1:
//			System.out.println("Monday");
//			break;
//		case 2:
//			System.out.println("Tuesday");
//			break;
//		case 3:
//			System.out.println("Wednesday");
//			break;
//		case 4:
//			System.out.println("Thursday");
//			break;
//		case 5:
//			System.out.println("Friday");
//			break;
//		case 6:
//			System.out.println("Saturday");
//			break;
//		case 7:
//			System.out.println("Sunday");
//			break;
//		default: System.out.println("Invalid number");
//			break;
//		}
		
//		
//		//WAP to print datatype depends on daynum and datatype. daynum datatype -- 1,2,3,4,5 weekdays , 6 first weekend,  7 second weekend,  >7 or <1invalid
//		int number =0;
//		switch(number) {
//		case 1:
//		case 2:
//		case 3:
//		case 4:
//		case 5:
//			System.out.println("Weekdays");
//			break;
//		case 6: 
//			System.out.println("first weekend");
//			break;
//		case 7:
//			System.out.println("second weekend");
//			break;
//		default: System.out.println("invalid");	
//			break;
//		}
		
//		//WAP to check all the prime numbers from 1 to 15
//		for(int num=2; num<=15; num++) {
//			boolean isPrime= true;
//			for(int i=2;i<=Math.sqrt(num);i++) {
//				if(num%i==0) {
//					isPrime=false;
//					break;
//				}
//			}
//			if(isPrime) {
//				System.out.println(num+ " ");
//			}
//		}
		
//		//WAP to find sum of even numbers from given number 1234
//		 //2+4--->6
//		int num=1234;
//		int sum=0;
//		
//		while(num>0) {
//			int digit = num%10;
//			if(digit%2==0) {
//				sum+=digit;
//			}
//			num/=10;
//		}
//		System.out.println(sum);
		
		
//		//pattern programming
		//1
//		for(int i=1;i<=3;i++) { //outer loop for number of rows
//			for(int j=1;j<=5;j++) { //inner loop for number of columns
//				System.out.print("*");
//			}
//			System.out.println(" ");//for next line
//		}
		
//		//2
//		for(int i =1;i<=4;i++) {
//			for(int j=1; j<=4;j++) {
//				if(i==3 && j>=2) {
//					System.out.print(" ");
//				} else {
//					System.out.print("*");
//				}
//			}
//			System.out.println(" ");
//		}
		
//		//3
//		for(int i=1;i<=4;i++) {
//			for(int j=1; j<=4; j++) {
//				if(i==2 || i==4) {
//					System.out.print("#");
//				} else {
//					System.out.print("*");
//				}
//			}
//			System.out.println(" ");
//		}
		
		
//		//4
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<=4;j++) {
//				if(j==1 || j==3) {
//					System.out.print("*");
//				} else {
//					System.out.print("#");
//				}
//			}
//			System.out.println(" ");
//		}
		
//		//5
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<=4;j++) {
//				if(i==j) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}	
//			}
//			System.out.println(" ");
//		}
		
//		//6
//		for(int i=1;i<=3;i++) {
//			for(int j=1;j<=3;j++) {
//				if(i==1) {
//					System.out.print("1");
//				} else if(i==2) {
//					System.out.print("2");
//				} else {
//					System.out.print("3");
//				}
//			}
//			System.out.println(" ");
//		}
		
//		//7
//		for(int i=1;i<=3;i++) {
//			for(int j=1;j<=3;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
//		//8
//		int a=1;
//		for(int i=1;i<=3;i++) {
//			for(int j=1;j<=3;j++) {
//				System.out.print(a);
//				a++;
//			}
//			System.out.println();
//		}
		
//		//9
//		for(int i=1;i<=3;i++) {
//			for(int j=1;j<=3;j++) {
//				if(i==1) {
//					System.out.print("A");
//				} else if(i==2) {
//					System.out.print("B");
//				} else {
//					System.out.print("C");
//				}
//			}
//			System.out.println();
//		}
		
//		//10
//		for(int i=1;i<=3;i++) {
//		for(int j=1;j<=3;j++) {
//			if(j==1) {
//				System.out.print("A");
//			} else if(j==2) {
//				System.out.print("B");
//			} else {
//				System.out.print("C");
//			}
//		}
//		System.out.println();
//	}
		
//		//11
//		char ch='A';
//		for(int i=1;i<=3;i++) {
//			for(int j=1;j<=3;j++) {
//				System.out.print(ch);
//				ch++;
//			}
//			System.out.println();
//		}
//		
		
//		//12
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<=4;j++) {
//				if(i>=j) { //
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
		
//		//13
//		for(int i=4; i>=1;i--) {
//			for(int j=1;j<=4;j++) {
//				if(i>=j) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
//		//14
//		for(int i=1;i<=4;i++) {
//			for(int j=4;j>=1;j--) {
//				if(i>=j) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
		//15
//		for(int i=1;i<=4;i++) {
//			for(int j=4;j<=1;j++) {
//				
//			}
//		}
//		
//		//leap year
//		int year =2008;
//		if(year%4==0 && (year%100!=0 || year%400==0)) {
//			System.out.println("Leap year");
//		} else {
//			System.out.println("Not a leap year");
//		}
//		
		
//		//Count Number Of Digits in A Number
//		int num=12343943;
//		int count=0;
//		while(num>0) {
//			num/=10; //drop last digit
//			count++; //counting how many times the loop is running to get to num>0
//		} 
//		System.out.println(count);

		
//		//Count Number Of EVEN & ODD Digits in A Number
//		int num=1234569;
//		int countEven=0;
//		int countOdd=0;
//		
//		while(num>0) {
//			int digit=num%10;
//			if(digit%2==0) {
//				countEven++;
//			} else {
//				countOdd++;
//			}
//			num/=10;
//		}
//		
//		System.out.println(countEven);
//		System.out.println(countOdd);
		
		
		//WAP to seperate each letter in a word
		String word = "QuickRef";
		for(char c : word.toCharArray()) {
			System.out.print(c+"-");
		}
		
		
		
		
	
	}
	
//	public static int fibo(int num) {
//		
//		if (num==0 || num==1) return num;
//		
//		return fibo(num-1)+fibo(num-2);
//	}
}



