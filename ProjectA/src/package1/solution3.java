package package1;

public class solution3 {

	int a,b,c,d,e;
	
	public solution3(int x1,int x2,int x3,int x4,int x5) {
		// TODO Auto-generated constructor stub
		a=x1;
		b=x2;
		c=x3;
		d=x4;
		e=x5;
	}
	
	public static void main(String[] args) {
		solution3 obj = new solution3(11,12,13,14,15);
		System.out.println(obj.a);	//1st call
		System.out.println(obj.b);	//2nd call
		System.out.println(obj.c);	//3rd call	
		System.out.println(obj.d);	//4th call
		System.out.println(obj.e);	//5th call
	}
}


//use of constructor?
//to assign the values for an object