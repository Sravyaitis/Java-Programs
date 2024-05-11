package package1;

public class constructorassignment1 {
	
	public constructorassignment1() {
		this(33,44,95);
		System.out.println("Default Constructor");
	}
	public constructorassignment1(int a) {
		this(1,2,3,4);
		System.out.println("one parameterized Constructor");
	}
	public constructorassignment1(int a, int b) {
		this(1);
		System.out.println("two parameterized Constructor");
	}
	public constructorassignment1(int x,int y, int z) {
		System.out.println("three parameterized Constructor");
	}
	public constructorassignment1(int a,int b, int c, int d) {
		this();
		System.out.println("four parameterized Constructor");
	}

	public static void main(String[] args) {
		constructorassignment1 obj = new constructorassignment1(1,2);
	}
}
