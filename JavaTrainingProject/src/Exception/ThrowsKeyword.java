package Exception;

public class ThrowsKeyword {

	public static void main(String[] args) throws ArithmeticException {
		
		ThrowsKeyword obj =new ThrowsKeyword();
		obj.sum();
		System.out.println("ABC"); // it will not print as main method will give exception to JVM
	}

	public void sum() throws ArithmeticException {
	
		div();
	}

	public void div() throws ArithmeticException {
		int i=9/0;//Exception line
	}
}

//JVM will catch throws keyword 