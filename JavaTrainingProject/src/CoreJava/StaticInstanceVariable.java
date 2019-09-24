package CoreJava;

public class StaticInstanceVariable {
	static int x=100; // static variable
	int y=200; // instance variable

	public static void main(String[] args) {
		int z=300;  // local variable
		// We can access static variables without creating an Object of a class
		System.out.println("Value of static variable x is "+ x);
		System.out.println("Value of static variable with class name x is "+ StaticInstanceVariable.x);

		
		// Creating an instance of a class 'StaticInstanceVariable' 

		StaticInstanceVariable obj =new StaticInstanceVariable();
		System.out.println("Value of intance variable y is "+ obj.y);
		System.out.println("Value of local variable z is "+ z);


	}

}
