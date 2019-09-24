package OOPConcept;

public class TestCar {
//When same Method is present in parent class as well as in chide class with same name and same no of argument  is called method overriding 
	public static void main(String[] args) {
		//static polymorphism or compile time polymorphism 
		BMW b= new BMW();
		b.start();
	b.stop();
	b.refuel();
	b.theftSafty();
	b.engine();
	
	System.out.println("===============");
	Car c =new Car();
	c.start();
	c.stop();
	c.refuel();
	c.engine();
	System.out.println("===============");
	
	//Top casting 
	Car c1=new BMW();//child class object can be reference variable which is called dynamic polymerphism or runtime polymerphism  
c1.start();//car class
c1.stop();//car class
c1.refuel();////car class
// c1.theftSafty() we can't  access BMW property  
c1.engine();

//Down casting is possible but it give  ClassCastException 
BMW b1=(BMW)new Car();
}
	

}
