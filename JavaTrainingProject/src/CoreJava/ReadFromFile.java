package CoreJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

	public static void main(String[] args) throws IOException {
		
		FileReader filename= new FileReader("F:\\Testing\\New Text Document.txt");
	 BufferedReader bufferedReader = new BufferedReader(filename);
		String testfile = null;
	 
	 while((testfile= bufferedReader.readLine())!=null ) {
		 
		 System.out.println(testfile);
		 
		 }
	 filename.close();
	 bufferedReader.close();
	}
	

}
