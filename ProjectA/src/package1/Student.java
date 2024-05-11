package package1;

public class Student { //{} indicates the boundary of the class
	//class contains variables and methods(used for performing any action)
	int a; //declared a variable named 
	public void b() { // ()indicates the boundary of a method
		
		System.out.println("Welcome to all of you");
	}
	public static void main(String[] args) {//code will execute from main method()
		
		//object(clasName()) is created to access/call the variable and method of the class
		
		Student abc = new Student();
	//className reference_variable = new clasName();
		
		//call/access the memory using reference variable
		abc.a = 10;
		System.err.println("Value of a: "+abc.a);
	}
		
	
}
