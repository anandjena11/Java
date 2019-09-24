package ClassConcept;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj=new MethodOverloading();
				obj.sum();
				obj.sum(10);
				obj.sum(10, 5);
		
	
}
	public static void main(int p) {// main method can be overloaded
		
	}
	
	public void sum() {//0 input parameter
		
		System.out.println("SUM method with Zoro input");
	}
public void sum(int x) {//1 input parameter
		
		System.out.println("SUM method with one input ");
		System.out.println(x);
	
	
}
public void sum(int p,int q) {//2 input parameter
	
	System.out.println("SUM method in 2 input");
	System.out.println(p+q);
}
}