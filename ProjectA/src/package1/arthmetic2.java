package package1;

public class arthmetic2 {
	
	public int multi(int p, int q) {
		int r;
		r = p*q;
		System.out.println("Mul of p and q = "+r);
		return r;
	}
	public int sum(int a, int b) {
		int c;
		c = a+b;
		System.out.println("Sum of a and b = "+c);
		return c;
	}
	public int sub(int x, int y) {
		int z;
		z=x-y;
		System.out.println("Subtract x and y = "+z);
		return z;
	}
	public int mul2(int x1, int y1) {
		int z1;
		z1 = x1*y1;
		System.out.println("Multiplication of x1 and y1 = "+z1);
		return z1;
	}
	public void div(int a1, int b1) {
		int c1;
		c1 = a1/b1;
		System.out.println("Division of a1 and b1="+c1);
	}
	
	public static void main(String[] args) {
		arthmetic2 obj = new arthmetic2();
		int mulresult1 = obj.multi(10,2);
		int sumResult=obj.sum(mulresult1, 2);
		int subResult = obj.sub(sumResult,2);
		int mulResult2 = obj.mul2(subResult, 2);
		obj.div(mulResult2, 2);
	}
}
