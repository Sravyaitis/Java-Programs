package package1;

public class solution2 {
	
	int a,b,c,d,e;
	
	private void method1(int x1, int x2, int x3, int x4, int x5) {
		// TODO Auto-generated method stub
		a=x1;
		b=x2;
		c=x3;
		d=x4;
		e=x5;
	}
	
	public static void main(String[] args) {
		solution2 obj = new solution2();
		obj.method1(10, 11, 12, 13, 14);	//1st call
		System.out.println(obj.a);	//2nd call
		System.out.println(obj.b);	//3rd call
		System.out.println(obj.c);	//4th call
		System.out.println(obj.d);	//5th call
		System.out.println(obj.e);	//6th call
	}
}
