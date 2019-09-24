package Exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		try {
			int i =9/0;
		}
		catch(ArithmeticException e){ // Instead of ArithmeticException we can right Throwable as it is a superclass of all exception class
			e.printStackTrace();
			System.out.println(e.getMessage());
	}

}
}

