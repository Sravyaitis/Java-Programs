
public class Methods {

	public static void main(String[] args) {
	
//		bookDetails();
//		login("Sravya","pwd");
		
//		System.out.println(phoneNum());
//		System.out.println(genderField());
		
//		System.out.println(login("sravya", 123));
		
		System.out.println(areaOfCircle(10));
		System.out.println(areaOfTri(10, 10));
		System.out.println(areaOfRectangle(10, 10));
		System.out.println(areaOfSquare(4));
	}
	
	
	
	
	
	
	
//	public static void bookDetails() {
//		System.out.println("Book Name");
//		System.out.println("No of Pages");
//	}

//	public static void login(String username, String password) {
//		System.out.println("username: "+username);
//		System.out.println("password: "+password);
//	}
	
//	public static String phoneNum() {
//		return "9179358105";
//	}
//	public static char genderField() {
//		return 'F';
//	}
	
//	public static boolean login(String username, int pwd) {
//		if(username=="sravya" && pwd==123) {
//			return true;
//		} 
//		return false;
//	}
	
	public static float areaOfTri(int breadth, int height) {
		float area1=0.5f*breadth*height; //A = 1/2 × b × h
		return area1;
	}
	
	public static float areaOfCircle(int radius) {
		float pie = 3.14f;
		float area2=pie*radius*radius; //A = π r²
		return area2;		
	}
	
	public static int areaOfRectangle(int breadth, int height) {
		int area3=breadth*height;
		return area3;
	}
	
	public static int areaOfSquare(int side) {
		int area4 = side*side;
		return area4;
	}
	
	
}
