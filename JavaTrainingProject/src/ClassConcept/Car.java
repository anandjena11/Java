package ClassConcept;

public class Car {

	int mod;
	int wheel;
	public static void main(String[] args) {
		// new car()=object of car class
		//a,b is object reference variable 
		//Car is interface 
		Car a =new Car();
		Car b =new Car();
		Car c =new Car();
		a.mod=454;
		a.wheel=5;
		
		
		b.mod=4584;
		b.wheel=4;
		c.mod=554;
		c.wheel=6;
		System.out.println("Before assign the reference");
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		System.out.println("After refrence");
		a=b;
		b=c;
		c=a;
		a.mod=10;
		System.out.println(a.mod);//10
		b.mod=20;
		c.mod=20;
		System.out.println(b.mod);//20
		System.out.println(c.mod);//20
		
				
		
		

	}

}
