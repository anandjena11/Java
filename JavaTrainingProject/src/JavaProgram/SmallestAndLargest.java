package JavaProgram;

import java.util.Arrays;

public class SmallestAndLargest {

	public static void main(String[] args) {
		int numbers[]= {-10,24,50,-88,987658};
		int largest=numbers[0];
		int smallest=numbers[0];
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]>largest) {
				largest = numbers[i];
			}else if (numbers[i]<smallest) {
				smallest =numbers[i];
			}
		}
		
		System.out.println("\n Given Array is :"+ Arrays.toString(numbers));
		System.out.println("Largest no is is :"+ largest);
		System.out.println("Smallest no is is :"+ smallest);
	}
	

}
