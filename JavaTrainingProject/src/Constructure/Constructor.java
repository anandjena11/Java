package Constructure;

// This is example of "this" keyword

public class Constructor {

	// class instance or global variable 
	String name ;
	int age ;
	
	public Constructor() { //Default constructor 
		System.out.println("Default constructor");
	}
	public Constructor(int i) { //1  parameter and constructot can be overloaded  
		System.out.println("1 Parameter constructor");
	}
	public Constructor(int a,int b) { //2 parameter constructor 
		System.out.println("2P constructor");
	}
	public Constructor(String name, int age) { 
		this.name = name;//this.classvar= local 
		this.age=age;//this.classvar= local
		System.out.println("Name is "+ name);
		System.out.println("Age is "+ age);
	}
		
	public static void main(String[] args) {
		
		Constructor obj = new Constructor ();//The moment we crate of obj then constrctor wil call 
		Constructor obj1 = new Constructor (10);
		Constructor obj3 = new Constructor (10,20);
		Constructor obj4 = new Constructor ("Tom",55);
	
	}

}
