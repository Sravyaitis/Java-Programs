package package1;

public class solution1 {
	
	int a,b,c,d,e;
	
	public static void main(String[] args) {
		solution1 obj = new solution1();
		obj.a = 10; //1st call
		obj.b = 12; //2nd call
		obj.c = 14; //3rd call
		obj.d = 16;	//4th call
		obj.e = 18; //5th call	
		System.out.println(obj.a);  //6th call
		System.out.println(obj.b);	//7th call
		System.out.println(obj.c);	//8th call
		System.out.println(obj.d);	//9th call
		System.out.println(obj.e);	//10th call
	}

}
