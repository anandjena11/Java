package IOFunctions;

import java.io.File;

public class IOFunctionInJava {

	public static void main(String[] args) {
	// create a folder 
  File fileobj = new File("C:/Users/ANAND/Desktop/Seleinum");
  fileobj.mkdir();
//Dlete a folder 
  fileobj.delete();
//Exisitance of  a folder 
  boolean a = fileobj.exists();
  if (a==true) {
	  System.out.println("folder exist");
  }else {
	  
	  System.out.println("folder not exist");
  }	 

	}

}
