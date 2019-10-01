package Constructure;

// This is example of "this" keyword

public class ConstructurDemo {

	// class instance or global variable 
	String name ;
	int age ;
	
	public ConstructurDemo() { //Default constructor 
		System.out.println("Default constructor");
	}
	public ConstructurDemo(int i) { //1  parameter and constructot can be overloaded  
		System.out.println("1 Parameter constructor");
	}
	public void ConstructurDemo(int a,int b) { //2 parameter constructor 
		System.out.println("2P constructor");
	}
	public void Constructor(String name, int age) { 
		this.name = name;//this.classvar= local 
		this.age=age;//this.classvar= local
		System.out.println("Name is "+ name);
		System.out.println("Age is "+ age);
	}
		
	public static void main(String[] args) {
		
		ConstructurDemo obj = new ConstructurDemo ();//The moment we crate of obj then constrctor wil call 
		ConstructurDemo obj1 = new ConstructurDemo (10);
		ConstructurDemo obj3 = new ConstructurDemo (10,20);
		ConstructurDemo obj4 = new ConstructurDemo ("Tom",55);
	
	}

}
