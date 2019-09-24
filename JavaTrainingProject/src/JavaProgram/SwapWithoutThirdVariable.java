package JavaProgram;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
	int x=5;
	int y=10;
	//1. With using third variable :t
	int t;
	t=x;//5
	x=y;//10
	y=t;//5
	
	//2. without 3rd variable + operator 
	// x=x+y;//15
	// y=x-y;//5
	// x=x-y;//10
	//3. without 3rd variable * operator 
	
	// x=x*y;//50
	// y=x/y;//5
	// x=x/y;//10
	//4. without 3rd variable XOR ^ operator 
	// x=x^y;//15
//	y=x^y;//10
	// x=x^y;//5
	System.out.println(x);
	System.out.println(y);

	
}
}
