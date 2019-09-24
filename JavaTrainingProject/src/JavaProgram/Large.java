package JavaProgram;

public class Large {

	public static void main(String[] args) {

		int A[]= {10,20,30,40,50};
		int i,j;
		int largest=A[0];
		int smallest=A[0];
		for (i=1;i<A.length; i++) {
		 if(A[i]>largest) {
			 largest =A[i];
		 }
		 else if(A[i]<smallest) {
			 
			 smallest=A[i];
		 }
		 
			
		}
		System.out.println(largest + " is largest");
		 System.out.println(smallest + " is smallest");

	}

	

}
