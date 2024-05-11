package package1;

public class abc {
		public abc() {
			System.out.println("Default constructor");
		}
		public abc(int a) {
			this(44,555); //it will call two parameterized constructor
			System.out.println("Parameterized constructor");
		}
		public abc(int a, int b) {
			this(); //this will call default constructor
			System.out.println("2 Parameter constructor");
		}
		public static void main(String[] args) {
			System.out.println("Im the main method and Im the boss");
			abc obj1 = new abc(111);//control goes to one parameterized constructor
			//code executes line by line from top to bottom in the main method
		}
}
