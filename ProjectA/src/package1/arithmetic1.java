package package1;

public class arithmetic1 {

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
	public int mul(int x1, int y1) {
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
		arithmetic1 obj = new arithmetic1();
		int sumResult1=obj.sum(10, 2);
		int sumResult2 = obj.sum(sumResult1, 2);
		int subResult = obj.sub(sumResult2,2);
		int mulResult = obj.mul(subResult, 2);
		obj.div(mulResult, 2);
	}
}
