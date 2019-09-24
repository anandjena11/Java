package OOPConcept;

public interface USBank {
	
	int min_bal=100;
	public void credit();
	
	public void debit();
	public void transferMoney();
	
	//1.Only method declaration no body
	//2.we can declare variables and they are by default static in nature
	//variable value will not be changed, its final /constant in nature
	//4.no static method in interface
	//5.we can create the object of interface
	//6.interface is abstract in nature 
	//7.No main method is require 
	// in interface it is 100% abstaction 
	//but in abstract class partial abstraction is opssible
	//we can create contstructor of abstact class but in in interface

}
