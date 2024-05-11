package package1;

public class arithmetic {

	public int sum(int a, int b) {
		int c;
		c = a + b;
		System.out.println("Sum of a+b= "+c);
		return c;	
	}
	
	public int sub(int x, int y) {
		int z;
		z = x - y;
		System.out.println("Subtraction of x-y= "+z);
		return z;
	}
	
	public void mul(int x1, int y1) {
		int z1;
		z1 = x1*y1;
		System.out.println("Multiplication of x1 and y1 = "+z1);
		
	}
	
	public static void main(String[] args) {
		
		arithmetic obj = new arithmetic();
		int sumResult = obj.sum(10, 2);
		int subResult = obj.sub(4, 2);
		obj.mul(sumResult, subResult);
	
	}
	
}
