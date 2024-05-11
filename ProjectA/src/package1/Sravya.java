package package1;

public class Sravya {
		public Sravya() {
			// TODO Auto-generated constructor stub
			System.out.println("Default constructor");
		}
		public Sravya(int a) {
			// TODO Auto-generated constructor stub
			System.out.println("Parameterized constructor");
		}
		public Sravya(int a, int b) {
			// TODO Auto-generated constructor stub
			System.out.println("2 Parameter constructor");
		}
		public static void main(String[] args) {
			System.out.println("Im the main method and Im the boss");
			Sravya obj2 = new Sravya(222,333);
			Sravya obj = new Sravya();
			Sravya obj1 = new Sravya(111);
			//code executes line by line from top to bottom in the main method
		}
}

//4 pillars of java
//class creation
//main method creation
//object creation inside main method
//call the method using the reference variable 
