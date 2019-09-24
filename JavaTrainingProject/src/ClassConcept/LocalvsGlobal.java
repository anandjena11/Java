package ClassConcept;

public class LocalvsGlobal {
	String name="Tom";//Global variable
	int age=25;
	
	
	public static void main(String[] args) {
		int i=10; //local variable for main mathod
		System.out.println(i);
		
		LocalvsGlobal obj=new LocalvsGlobal();
		System.out.println(obj.age);

	}
	public void sum() {//local variable for sum method
		int i=10;
		int j=20;
		int age=25;
	}

}
