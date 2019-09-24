package ClassConcept;

public class FunctionInJava {

	public static void main(String[] args) {
		FunctionInJava obj =new FunctionInJava();
		obj.text();
	int p=	obj.pqr();
	System.out.println(p);
	int k	= obj.division(10, 2);
	System.out.println(k);
	
		String name=obj.aa();
		System.out.println(name);
		
		
	}
	//void doesn't return any value
public void text() {
	
	System.out.println("test method");
	
}
//return type is int 
public int pqr() {  // no input ,some output
	int a=10;
	int b=20;
	int c=a+b;
	return c ;
}

public String aa() {//no input,some output
	
	System.out.println("aa method");
	
	String s ="selenium";
	return s; 
}
public int division(int x,int y) {
	System.out.println("division method");
	int d=x/y;
	return d;
	
}
	}


