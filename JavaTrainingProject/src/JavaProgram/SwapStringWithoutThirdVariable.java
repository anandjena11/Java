package JavaProgram;

public class SwapStringWithoutThirdVariable {

	public static void main(String[] args) {

		String a= "Hello";
		String b="World";
		System.out.println("Before swapping :");
		System.out.println("The value of a is :"+a);
		System.out.println("The value of b is :"+b);
		
		
		//1.Append a and b
		a=a+b; //Hello world
		
		//2.store initial string a in string b:
		b=a.substring(0, a.length()-b.length());
		
		
		//3. Store initial String  b in String a:
		a=a.substring(b.length());
		
		System.out.println("After swapping :");
		System.out.println("The value of a is :"+a);
		System.out.println("The value of b is :"+b);
		
	}

}
