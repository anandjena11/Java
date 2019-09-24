package CoreJava;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Eneter your name ");
		String name = scan.nextLine();
		
	    System.out.println("Your name is "+ name);
		System.out.println("Eneter your Age ");
		int age = scan.nextInt();
		System.out.println("Your age is "+ age);
		System.out.println("Eneter your Mobileno ");
		long  Mob = scan.nextLong();
		
		System.out.println("Your Mobileno is "+ Mob);

		scan.close();
	}

}