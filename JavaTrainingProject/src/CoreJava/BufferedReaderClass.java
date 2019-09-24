package CoreJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderClass {

	public static void main(String[] args) throws IOException {
	
		// Instantiate BufferedReader object 
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name");
		String name =reader.readLine();
		
		System.out.println(" Your name is "+ name);
	
		reader.close();
		
	}

}
