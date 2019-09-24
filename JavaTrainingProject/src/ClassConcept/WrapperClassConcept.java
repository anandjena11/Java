package ClassConcept;

public class WrapperClassConcept {

	public static void main(String[] args) {
	
		String x="100";
		System.out.println(x+20);
		
		//Data conversion Sting to integer
		int i =Integer.parseInt(x);
		System.out.println(i+20);
		// Different type of wrapper class--String,Double,Boolean

		// string to double conversion
		String y= "12.33";
		double d= Double.parseDouble(y);
		System.out.println(10+d);
		
		//String to Boolean 
		String k="ture";
	boolean b =	Boolean.parseBoolean(k);
	System.out.println(b);
	
	// int to string conversion 
	int j=200;
	System.out.println(j+20);
	String s=String.valueOf(j);
			System.out.println(s+20);
	//
	String u="10A";
	int w =Integer.parseInt(u);
	
	System.out.println(w+20);





		


	}

}
