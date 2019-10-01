package Constructure22;

// This is example of "this" keyword

public class Constructor2 {

	// class instance or global variable
	String name;
	int age;

	public Constructor2() { // Default constructor
		System.out.println("Default constructor");
	}

	public Constructor2(int i) { // 1 parameter and constructot can be overloaded
		System.out.println("1 Parameter constructor");
	}

	public Constructor2(int a, int b) { // 2 parameter constructor
		System.out.println("2P constructor");
	}

	public Constructor(String name, int age) { 
		this.name = name;//this.classvar= local 
		this.age=age;//this.classvar= local
		System.out.println("Name is "+ name);
		System.out.println("Age is "+ age);
	}

	public static void main(String[] args) {

		Constructor2 obj = new Constructor2();// The moment we crate of obj then constructor will call
		Constructor2 obj1 = new Constructor2(10);
		Constructor2 obj3 = new Constructor2(10, 20);
		Constructor2 obj4 = new Constructor2("Tom", 55);

	}

}
