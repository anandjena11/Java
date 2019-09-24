package JavaBasics;

public class DataTypes {

	public static void main(String[] args) {
		String x[][]=new String[3][5];
	x[0][0]= "a";
	x[0][1]= "b";
	x[0][2]= "c";
	x[0][3]= "d";
	x[0][4]= "e";
	
	
	
	x[1][0]= "TOM";
	x[1][1]= "MOM";
	x[1][2]= "DOM";
	x[1][3]= "FOM";
	x[1][4]= "ROM";
	
	
	x[2][0]= "A1";
	x[2][1]= "B1";
	x[2][2]= "C1";
	x[2][3]= "D1";
	x[2][4]= "E1";
	
	

		
	for(int row=3; row < x[1][1].length(); row++) 
	{
		
		for(int col=5;col<x[2][3].length();col++) 
		{
			
			System.out.println(x[row][col]);
		}
		
	}
		

		
	}
}





