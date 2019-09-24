package ClassConcept;

public class StaticAndNonStaticConcept {
	//global variables : the scope of global vars will be available across all the function with some conditions 
String name="Tom";//non static Global variable
static int age=25;//static Global variable
	public static void main(String[] args) { 
		//how to call static Method and variable ?
		//1.Direct calling
		sum();
		//2. calling by class name
		StaticAndNonStaticConcept.sum();
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		
		
		//how to call non static method 
		StaticAndNonStaticConcept obj= new StaticAndNonStaticConcept();
		obj.sum();
		obj.sendMail();
		System.out.println(obj.name);
		
		//can i access static method by using  object reference ? YES
		obj.sum();//warning will be given
		

	}

	public void sendMail() {
		System.out.println("sendMail method");
	}
	public static void sum() {
		System.out.println("sum method");
	}
}
